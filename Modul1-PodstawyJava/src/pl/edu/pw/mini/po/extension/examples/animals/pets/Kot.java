package pl.edu.pw.mini.po.extension.examples.animals.pets;

public class Kot extends ZwierzeDomowe {

	public Kot(String imie) {
		super(imie);
	}

	@Override
	protected String nazwaGatunkowa() {
		return "Kot obrazalski";
	}

	@Override
	public void dajGlos() {
		System.out.println("Miau, miau");
	}

}
