package pl.lodz.p.java.app.persistance;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import pl.lodz.p.java.app.model.Element;
import pl.lodz.p.java.app.model.Resistor;
import pl.lodz.p.java.app.model.Set;

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
			if(e instanceof Resistor) {
				sb = new StringBuilder();
				sb.append(e.getName()).
						append(',').
						append(((Resistor) e).getR()).
						append(',').
						append(((Resistor) e).
						getUnit()).
						append("\n");
			}
		}
		try {
			zapisPliku("test.csv", "blablabla");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("ZAPIS!!!");
	}

	public void zapisPliku(String filename, String text) throws IOException {
		FileWriter file = null;
		try {
			file = new FileWriter(filename);

			file.write(text);
			// // zapis po znaku
			// for (char z = 'a'; z <= 'z'; z++) {
			// file.write(z);
			// file.write('\n');
			// }

		} finally {
			if (file != null) {
				file.close();
			}
		}
	}
}
