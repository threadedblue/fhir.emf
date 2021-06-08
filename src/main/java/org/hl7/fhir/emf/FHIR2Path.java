package org.hl7.fhir.emf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FHIR2Path {

	private static final Logger LOG = LoggerFactory.getLogger(FHIR2Path.class);

	public static List<java.lang.String> toFhirPath(EObject eObject) {

		List<java.lang.String> paths = new ArrayList<java.lang.String>();
		LOG.info(eObject.eClass().getName());
		TreeIterator<EObject> itr = eObject.eAllContents();
		while (itr.hasNext()) {
			EObject o = itr.next();
			List<java.lang.String> stk = buildPath(o);
			Collections.reverse(stk);
			LOG.info("stk=" + stk.toString());
//			stk.push(o.eClass().getName());
			StringBuilder bld = new StringBuilder();
			bld.append(java.lang.String.join(".", stk));
			LOG.info("bld=" + bld.toString());
		}
		return null;
	}

	static List<java.lang.String> buildPath(EObject eObject) {
		List<java.lang.String> stk = new ArrayList<java.lang.String>();
		EObject eContainer = eObject.eContainer();
		while (eContainer != null) {
			stk.add(eContainer.eClass().getName());
			eContainer = eContainer.eContainer();
		}
		return stk;
	}
}
