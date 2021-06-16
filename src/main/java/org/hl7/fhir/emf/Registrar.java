package org.hl7.fhir.emf;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class Registrar {

	static Logger log = LogManager.getLogger(Registrar.class);

	protected static final ResourceSet resourceSet = new ResourceSetImpl();
	protected static Resource resource;
	static Set<EPackage> registeredPackages = new HashSet<EPackage>();

	protected static void init() {
		log.trace("Registrar==>" + resourceSet);
		registerPackage(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		log.trace("<==Registrar");
	}
	
	public static ResourceSet getResourceSet() {
		return resourceSet;
	}

	public static Resource getResource() {
		return resource;
	}
	
	public static void associateExtension(String extension, Object obj) {
		getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(extension, obj);
	}
	
	public static void associateScheme(String scheme, Object obj) {
		getResourceSet().getResourceFactoryRegistry().getProtocolToFactoryMap().put(scheme, obj);
	}
	
	public static void registerPackage(String packageURI, Object packageImpl) {
		registeredPackages.add((EPackage) packageImpl);
		getPackageRegistry().put(packageURI, packageImpl);
	}
	
	public static Registry getPackageRegistry() {
		return resourceSet.getPackageRegistry();
	}

	public static Set<EPackage> getUserRegisteredPackages() {
		return registeredPackages;
	}
	
	public static EObject createEObject(String packageName, Class<?> clazz) {
		return createEObject(packageName, clazz.getSimpleName());
	}
	
	public static EObject createEObject(String packageName, String className) {
		EClass eClass = (EClass) getPackageRegistry().getEPackage(packageName).getEClassifier(className);
		return EcoreUtil.create(eClass);
	}
	
	public static EOperation fetchOperation(String packageName, String operationName) {
		EOperation eOperation = (EOperation) getPackageRegistry().getEPackage(packageName).getEClassifier(operationName);
		return eOperation;
	}
}
