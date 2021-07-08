package lev4rec.code.template.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import lev4rec.code.template.main.Generate;
import lowcoders.LowcodersPackage;
import lowcoders.RSModel;

public class Runner {

	public static void main(String[] args) {
		Runner r = new Runner();
		try {
			r.registerLowcodePackageMM();
			r.run("/Users/juri/development/git/LEV4REC/lev4rec/bundles/lev4rec.feature.model/configs/CrossRec_enanched.xmi", "output");
			       
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(String modelPath, String outputFolderPath) throws IOException {
		System.out.println("Model 2 text generation:");

		File folder = new File(outputFolderPath);
		System.out.print("\t" + "Generate all the files from the template...");
		Generate generator = new Generate(loadModel(modelPath), folder, new ArrayList<String>());
		generator.doGenerate(new BasicMonitor());
		System.out.println("Generated!");

	}

	public static RSModel loadModel(String modelPath) {
		registerLowcodePackageMM();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(LowcodersPackage.eINSTANCE.getNsURI(), LowcodersPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createFileURI(modelPath), true);
		RSModel model = (RSModel) resource.getContents().get(0);
		return model;
	}

	public static void registerLowcodePackageMM() {
		EPackage.Registry.INSTANCE.put(LowcodersPackage.eNS_URI, LowcodersPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(".xmi", LowcodersPackage.eINSTANCE);
	}
}
