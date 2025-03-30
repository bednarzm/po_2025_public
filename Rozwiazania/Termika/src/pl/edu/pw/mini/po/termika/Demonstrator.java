package pl.edu.pw.mini.po.termika;

import pl.edu.pw.mini.po.termika.szybowiec.Jantar2;
import pl.edu.pw.mini.po.termika.szybowiec.Szybowiec;
import pl.edu.pw.mini.po.termika.teren.GeneratorTerenu;
import pl.edu.pw.mini.po.termika.teren.NieobslugiwanaTemperaturaException;

public class Demonstrator {

	public static void main(String[] args) {
		GeneratorTerenu generatorTerenu = new GeneratorTerenu(20, 10);

		try {
			for (int i = 0; i < 3; i++) {
				System.out.println("\nIteracja " + i);
				Szybowiec jantar2 = new Jantar2(generatorTerenu);
				jantar2.setWysokosc(1000);

				for (int j = 0; j < 20; j++) {
					generatorTerenu.modyfikujAtmosfere();
					jantar2.fly();
					System.out.println(jantar2);
				}

			}
		} catch (NieobslugiwanaTemperaturaException nieobslugiwanaTemperaturaException) {
			System.out.println(nieobslugiwanaTemperaturaException.getMessage());
		}
	}

}
