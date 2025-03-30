package pl.edu.pw.mini.po.termika.teren;

import java.util.Random;

import pl.edu.pw.mini.po.termika.teren.gleba.GlebaKamienista;
import pl.edu.pw.mini.po.termika.teren.gleba.GlebaNiekamienista;
import pl.edu.pw.mini.po.termika.teren.piasek.TerenPiaszczysty;
import pl.edu.pw.mini.po.termika.teren.terenwilgotny.PodmoklaLaka;
import pl.edu.pw.mini.po.termika.teren.terenwilgotny.TerenWodny;

public class GeneratorTerenu {

	private static final Random random = new Random();

	private RodzajTerenu[][] teren;

	private static RodzajTerenu generujRodzajTerenu() {
		RodzajTerenu result;

		switch (random.nextInt(5)) {
		case 0:
			result = new TerenPiaszczysty();
			break;
		case 1:
			result = new GlebaKamienista();
			break;
		case 2:
			result = new GlebaNiekamienista();
		case 3:
			result = new TerenWodny();
		default:
			result = new PodmoklaLaka();
		}

		return result;
	}

	public GeneratorTerenu(int x, int y) {
		int rozmiarX, rozmiarY;

		rozmiarX = x > 0 ? x : 100;
		rozmiarY = y > 0 ? y : 100;

		teren = new RodzajTerenu[rozmiarY][rozmiarX];

		for (int i = 0; i < teren.length; i++) {
			for (int j = 0; j < teren[i].length; j++) {
				teren[i][j] = generujRodzajTerenu();
			}
		}

	}

	public void modyfikujAtmosfere() throws NieobslugiwanaTemperaturaException {
		for (int i = 0; i < teren.length; i++) {
			for (int j = 0; j < teren[i].length; j++) {
				teren[i][j].modyfikujTemperature(-1 + random.nextInt(5));
			}
		}
	}

	public RodzajTerenu[][] getTeren() {
		return teren;
	}

}
