package org.hl7.fhir.emf;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public abstract class Registrar {

	static Logger log = LogManager.getLogger(Registrar.class);

	protected static final ResourceSet resourceSet = new ResourceSetImpl();

	protected static void init() {
		log.trace("Registrar==>" + resourceSet);
		registerPackage(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		log.trace("<==Registrar");
	}
	
	public static ResourceSet getResourceSet() {
		return resourceSet;
	}

	public static Resource createResource(URL url) {
		URI uri = URI.createURI(url.toString());
		return getResourceSet().createResource(uri);
	}

	public static Resource createResource(URI uri) {
		return getResourceSet().createResource(uri);
	}
	
	public static void associateExtension(String extension, Object obj) {
		getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(extension, obj);
	}
	
	public static void associateScheme(String scheme, Object obj) {
		getResourceSet().getResourceFactoryRegistry().getProtocolToFactoryMap().put(scheme, obj);
	}
	
	public static void registerPackage(String packageURI, Object packageImpl) {
		getPackageRegistry().put(packageURI, packageImpl);
	}
	
	public static Registry getPackageRegistry() {
		return resourceSet.getPackageRegistry();
	}
}
