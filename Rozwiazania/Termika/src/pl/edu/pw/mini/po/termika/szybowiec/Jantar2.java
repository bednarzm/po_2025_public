package pl.edu.pw.mini.po.termika.szybowiec;

import pl.edu.pw.mini.po.termika.teren.GeneratorTerenu;

public class Jantar2 extends Szybowiec {

	public Jantar2(GeneratorTerenu generatorTerenu) {
		super(generatorTerenu);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Wysokosc: " + getWysokosc());
	}

	@Override
	protected String getNazwa() {
		return "Jantar2";
	}

}