package iox.sds4emf;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.io.input.ReaderInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.hl7.fhir.emf.Registrar;

public class Deserialize extends Registrar {

	private static final Logger log = LogManager.getLogger(Deserialize.class);

	public static EObject it(String fileName) {
		init();
		java.net.URI uri = new File(fileName).toURI();
		resource = getResourceSet().getResource(URI.createURI(uri.toString()), true);
		EObject eObject = (EObject) resource.getContents().get(0);

		return eObject;
	}

	public static EObject it(StringReader reader, String sUri) {
		Charset charset = Charset.forName("US-ASCII");
		return it(new ReaderInputStream(reader, charset), sUri);
	}

	public static EObject it(InputStream reader, String sUri) {
		init();
		URI uri = URI.createURI(sUri);
		try {
			resource = getResourceSet().createResource(uri);
			resource.load(reader, Collections.EMPTY_MAP);
			EList<EObject> eList = resource.getContents();
			if (eList.size() > 0) {
				EObject eObject = (EObject) resource.getContents().get(0);

				return eObject;
			} else {
				log.error("json=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("json"));
				log.error("xml=" + resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().get("xml"));
				log.error("Resource had no contents; returning null");
			}
		} catch (IOException e) {
			log.error("", e);
		} catch (ClassCastException e) {
			log.error("Cast", e);
		} catch (NullPointerException e) {
			log.debug("reader=" + reader);
			log.debug("sUri=" + sUri);
			log.debug("uri=" + uri);
			log.debug("resourceSet=" + resourceSet);
			log.debug("resource=" + resource);
			for (Map.Entry<String, Object> entry : getResourceSet().getResourceFactoryRegistry()
					.getExtensionToFactoryMap().entrySet()) {
				log.debug("key=" + entry.getKey() + " value=" + entry.getValue().getClass().getName());
			}
			log.error("NPE", e);
		} catch (Exception e) {
			log.error("", e);
		}
		return null;
	}
}
