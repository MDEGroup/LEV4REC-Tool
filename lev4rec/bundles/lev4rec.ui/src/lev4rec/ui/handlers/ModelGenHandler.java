package lev4rec.ui.handlers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.xml.sax.SAXException;

import it.lev4rec.mode.generator.Injector;

public class ModelGenHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
        Object object = selection.getFirstElement();
        if (object instanceof IFile) {
        	IFile f = (IFile) object;
        	Injector i = new Injector(
        			"/Users/juri/development/git/LEV4REC/lev4rec/bundles/lev4rec.feature.model/model.xml",
        			f.getRawLocation().toOSString());
        	
    		try {
    			Injector.serializeModel(i.generate(),f.getFullPath().toString().replace(".xml", ".xmi"));
    		} catch (ParserConfigurationException | SAXException | IOException e) {
    			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
				MessageDialog.openInformation(
						window.getShell(),
						"Generation output",
						"The model has not been generated!: " + e.getMessage());
				return null;
    		}

        	for(IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()){
        	    try {
					project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
				} catch (CoreException e) {
					IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
					MessageDialog.openInformation(
							window.getShell(),
							"Generation output",
							"The model has not been generated!: " + e.getMessage());
					return null;
				}
        	}
        }

		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Generation output ",
				"The model has been generated");
		return null;
	}
	}
