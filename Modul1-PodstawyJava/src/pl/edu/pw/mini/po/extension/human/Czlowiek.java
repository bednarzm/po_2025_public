package pl.edu.pw.mini.po.extension.human;

public abstract class Czlowiek {

	protected String imie;
	protected String nazwisko;

	public Czlowiek(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}
	
	protected String modyfikujeImie(String imie) {
		String firstLetter = String.valueOf(imie.charAt(0)).toUpperCase();
		String restOfStringWithoutFirst = imie.substring(1).toLowerCase();
		
		return firstLetter + restOfStringWithoutFirst;
	}
}
