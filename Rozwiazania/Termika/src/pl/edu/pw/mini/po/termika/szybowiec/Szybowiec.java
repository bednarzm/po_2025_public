package pl.edu.pw.mini.po.termika.szybowiec;

import java.util.Random;

import pl.edu.pw.mini.po.termika.teren.GeneratorTerenu;
import pl.edu.pw.mini.po.termika.teren.RodzajTerenu;

public abstract class Szybowiec {

	private static final Random random = new Random();

	private RodzajTerenu[][] teren;
	private double wysokosc;
	private int positionX, positionY;

	protected abstract String getNazwa();

	private static void pozaStrefa() {
		System.out.println("Lot poza strefa.");
	}

	public Szybowiec(GeneratorTerenu generatorTerenu) {
		teren = generatorTerenu.getTeren();
		positionY = teren.length / 2;
	}

	public void fly() {
		if (++positionX < teren[positionY].length) {
			positionY = random.nextInt(teren.length);
			if (positionY > 0 && positionY < teren.length) {
				wysokosc += teren[positionY][positionX].getPradyNoszace();
				if (wysokosc <= 0) {
					System.out.println("Ooops, ladowanie w polu.");
				}
			} else {
				pozaStrefa();
			}
		} else {
			pozaStrefa();
		}
	}

	public void setWysokosc(double wysokosc) {
		this.wysokosc = wysokosc;
	}

	public double getWysokosc() {
		return wysokosc;
	}

	@Override
	public String toString() {
		return getNazwa() + " wysokosc: " + wysokosc;
	}

}
