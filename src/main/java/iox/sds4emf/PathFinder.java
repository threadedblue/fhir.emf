package iox.sds4emf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class PathFinder {

	private static final Logger log = LogManager.getLogger(PathFinder.class);

	public static String findPath(EObject eObject) {
		StringBuilder bld = new StringBuilder();
		String s = eObject.eClass().getName();
		EObject eObject1 = eObject.eContainer();
		if (eObject1 != null) {
			int idx = getIndex(eObject, eObject1);
			bld.insert(0, s);
			if (idx > -2) {
				if (idx >= 0) {
					String s1 = String.format("[%d]", idx);
					bld.append(s1);
				}
			}
			bld.insert(0, ".");
			bld.insert(0, findPath(eObject1));
		} else {
			bld.insert(0, s);
		}
		log.debug("eObject1=" + eObject1);
		return bld.toString();
	}
	
	public static String findPath(EAttribute eAttribute) {
		StringBuilder bld = new StringBuilder();
		String s = eAttribute.getName();
		EObject eObject1 = eAttribute.eContainmentFeature();
		if (eObject1 != null) {
			int idx = getIndex(eAttribute, eObject1);
			bld.insert(0, s);
			if (idx > -2) {
				if (idx >= 0) {
					String s1 = String.format("[%d]", idx);
					bld.append(s1);
				}
			}
			bld.insert(0, ".");
			bld.insert(0, findPath(eObject1));
		} else {
			bld.insert(0, s);
		}
		log.debug("eObject1=" + eObject1);
		return bld.toString();
	}
	
	public static String findPath(EReference eReference) {
		StringBuilder bld = new StringBuilder();
		String s = eReference.getName();
		EObject eObject1 = eReference.eContainer();
		if (eObject1 != null) {
			int idx = getIndex(eReference, eObject1);
			bld.insert(0, s);
			if (idx > -2) {
				if (idx >= 0) {
					String s1 = String.format("[%d]", idx);
					bld.append(s1);
				}
			}
			bld.insert(0, ".");
			bld.insert(0, findPath(eObject1));
		} else {
			bld.insert(0, s);
		}
		log.debug("eObject1=" + eObject1);
		return bld.toString();
	}
	
	public static int getIndex(EObject eObject, EObject eObject1) {
		int idx = -2;
		if (eObject1.eContents().size() > 1) {
			idx = eObject1.eContents().indexOf(eObject);
		}
		return idx;
	}
	
	public static void main(String[] args) {
		
	}
}
