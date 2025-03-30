package pl.edu.pw.mini.po.termika.teren;

public class NieobslugiwanaTemperaturaException extends Exception {

	private static final long serialVersionUID = -7769343493713234520L;

	public NieobslugiwanaTemperaturaException(double deltaT) {
		super("Metoda obsluguje wartosci z przedzialy <-20; 50>.");
	}

}
