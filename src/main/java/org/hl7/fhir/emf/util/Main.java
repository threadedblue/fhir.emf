package org.hl7.fhir.emf.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceContainer;

public class Main implements Runnable {

	@Override
	public void run() {
		Path path = Paths
				.get("/Users/robertgeoffry/bahWk/fhir.emf/src/main/java/org/hl7/fhir/emf/util/resourceList.txt");
		try {
			List<String> lines = Files.readAllLines(path);
			List<String> lines2 = new ArrayList<>(lines.size());
			for (String line : lines) {
				String[] ss = line.split(" ");
				lines2.add(String.format("@Override%s", '\n'));
				lines2.add(String.format("public ResourceContainer case%s(%s eObject) {%s", ss[0], ss[0], '\n'));
				lines2.add(String.format("ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();%s", '\n'));
				lines2.add(String.format("container.set%s(eObject);%s", ss[0], '\n'));
				lines2.add(String.format("return container;%s", '\n'));
				lines2.add(String.format("}%s", '\n'));
				lines2.add("\n\n");
			}
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					"/Users/robertgeoffry/bahWk/fhir.emf/src/main/java/org/hl7/fhir/emf/util/ResourceContainerSwitch6.txt",
					true));

			for (String line : lines2) {
				writer.append(line);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

}
