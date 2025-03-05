package pl.edu.pw.mini.po.extension.examples.animals;

import pl.edu.pw.mini.po.extension.examples.animals.birds.Bogatka;
import pl.edu.pw.mini.po.extension.examples.animals.birds.Kuropatwa;
import pl.edu.pw.mini.po.extension.examples.animals.birds.Strzyzyk;
import pl.edu.pw.mini.po.extension.examples.animals.birds.Wrobel;
import pl.edu.pw.mini.po.extension.examples.animals.pets.Kot;
import pl.edu.pw.mini.po.extension.examples.animals.pets.Pies;

public class AnimalsDemonstrator {

	public static void main(String[] args) {
		Zwierze[] zwierzeta = new Zwierze[7];// Powinno sie uzyc kolekcji ale narazie celowo pracujemy na tablicach

		zwierzeta[0] = new Strzyzyk();
		zwierzeta[1] = new Bogatka();
		zwierzeta[2] = new Wrobel();
		zwierzeta[3] = new Pies("Fafik");
		zwierzeta[4] = new Pies("Dina");
		zwierzeta[5] = new Kot("Klakier");
		zwierzeta[6] = new Kuropatwa();

		for (int a = 1; a <= 2; a++) {
			System.out.println("Seria nr " + a + ":\n");
			for (int i = 0; i < zwierzeta.length; i++) {
				zwierzeta[i].dajGlos();
			}
			System.out.println("\n\n");
		}

	}

}
