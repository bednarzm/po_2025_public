package pl.edu.pw.mini.po.termika.szybowiec;

import pl.edu.pw.mini.po.termika.teren.GeneratorTerenu;

public class Bocian extends Szybowiec {

	public Bocian(GeneratorTerenu generatorTerenu) {
		super(generatorTerenu);
	}

	@Override
	public void fly() {
		super.fly();
		System.out.println("Lece jak prawdziwy Bocian!");
	}

	@Override
	protected String getNazwa() {
		return "Bocian";
	}

}
