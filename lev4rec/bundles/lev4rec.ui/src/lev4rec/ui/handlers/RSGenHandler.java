package lev4rec.ui.handlers;

import java.io.IOException;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import lev4rec.code.template.runner.Runner;

public class RSGenHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelectionChecked(event);
		Object object = selection.getFirstElement();

		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		DirectoryDialog dialog = new DirectoryDialog(shell, SWT.NULL);
		dialog.setMessage("Select output xmi foder");
		String output = dialog.open();
		System.out.println(output);
		if (output != null) {
			if (object instanceof IFile) {
				IFile f = (IFile) object;
				Runner r = new Runner();

				try {
					r.run(f.getRawLocation().toOSString(),
							output);
				} catch (IOException e) {
					IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
					MessageDialog.openInformation(window.getShell(), "Generation output",
							"The model has not been generated!: " + e.getMessage());
					return null;
				}

				for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
					try {
						project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
					} catch (CoreException e) {
						IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
						MessageDialog.openInformation(window.getShell(), "Generation output",
								"The model has not been generated!: " + e.getMessage());
						return null;
					}
				}
			}
		}

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(), "Generation output ", "The model has been generated");
		return null;
	}

}
