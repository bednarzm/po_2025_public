package pl.edu.pw.mini.po.model;

public class Student extends StudentZNazwiskiem {

	private static final long serialVersionUID = -1347869274843083425L;
	protected int jakisParametr;

	public Student(String imie, String wiek, String nazwisko, int jakisParametr) {
		super(imie, wiek, nazwisko);
		this.jakisParametr = jakisParametr;
	}

	public int getJakisParametr() {
		return jakisParametr;
	}

	@Override
	public String toString() {
		return "Student [jakisParametr=" + jakisParametr + ", toString()=" + super.toString() + "]";
	}

}
