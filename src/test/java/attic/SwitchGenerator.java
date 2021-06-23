package attic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// 
// This class is solely for the purpose of generating a series of switch case blocks.
// It reads a text file that was originally cut&pasted from a web page (HL7 FHIR specification)
// Its output is intended to be pasted into a proper Java class file.
// The file paths contained herein, may not be correct.
// 


public class SwitchGenerator implements Runnable {

	@Override
	public void run() {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("resourceList.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(
					"/Users/robertgeoffry/bahWk/fhir.emf/src/main/java/org/hl7/fhir/emf/util/case-statements.txt",
					false));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String line = reader.readLine();
			while (line != null) {
				String[] ss = line.split(" ");
				writer.append(String.format("@Override%s", '\n'));
				writer.append(String.format("public ResourceContainer case%s(%s eObject) {%s", ss[0], ss[0], '\n'));
				writer.append(String.format(
						"ResourceContainer container = FhirFactory.eINSTANCE.createResourceContainer();%s", '\n'));
				writer.append(String.format("container.set%s(eObject);%s", ss[0], '\n'));
				writer.append(String.format("return container;%s", '\n'));
				writer.append(String.format("}%s", '\n'));
				writer.append("\n\n");
				line = reader.readLine();
			}
			reader.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new SwitchGenerator().run();
	}

}
