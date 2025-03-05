package pl.edu.pw.mini.po.extension.examples.animals.pets;

public class Pies extends ZwierzeDomowe {

	public Pies(String imie) {
		super(imie);
	}

	@Override
	protected String nazwaGatunkowa() {
		return "Pies domowy";
	}

	@Override
	public void dajGlos() {
		System.out.println("Hau hau");
	}

}
