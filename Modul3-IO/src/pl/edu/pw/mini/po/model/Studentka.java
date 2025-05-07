package pl.edu.pw.mini.po.model;

public class Studentka extends StudentZNazwiskiem {

	private String jakiesInfo;

	public Studentka(String imie, String wiek, String nazwisko, String jakiesInfo) {
		super(imie, wiek, nazwisko);
		this.jakiesInfo = jakiesInfo;
	}

	public String getJakiesInfo() {
		return jakiesInfo;
	}

	@Override
	public String toString() {
		return "Studentka [jakiesInfo=" + jakiesInfo + ", toString()=" + super.toString() + "]";
	}

}
