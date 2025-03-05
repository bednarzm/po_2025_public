package pl.edu.pw.mini.po.extension.examples.animals.pets;

import pl.edu.pw.mini.po.extension.examples.animals.Zwierze;

public abstract class ZwierzeDomowe extends Zwierze {

	private String imie;

	public ZwierzeDomowe(String imie) {
		this.imie = imie;
	}

	public String nazwaGatunkowaZImieniem() {
		return nazwaGatunkowa() + " o imieniu: " + imie;//Takie klejenie Stringow dla ich duzej ilosci i czestotliwosci jest kosztowne
	}

}
