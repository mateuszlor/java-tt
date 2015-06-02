package pl.lodz.p.it.java.facades;

import java.io.FileWriter;
import java.io.IOException;

import pl.lodz.p.it.java.model.Element;
import pl.lodz.p.it.java.model.Resistor;
import pl.lodz.p.it.java.model.Set;

public class CSV {

	private Set set;

	public CSV(Set set) {
		this.set = set;
	}

	public void load() {

	}

	public void save() {
		StringBuilder sb;
		for (Element e : set.getElements()) {
			if (e instanceof Resistor) {
				sb = new StringBuilder();
				sb.append(e.getName()).append(',')
						.append(((Resistor) e).getR()).append(',')
						.append(((Resistor) e).getUnit()).append("\n");
			}
		}
		try {
			writeToFile("test.csv", "blablabla");
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("ZAPIS!!!");
	}

	public void writeToFile(String filename, String text) throws IOException {
		FileWriter file = null;
		try {
			file = new FileWriter(filename);

			file.write(text);

		} finally {
			if (file != null) {
				file.close();
			}
		}
	}
}
