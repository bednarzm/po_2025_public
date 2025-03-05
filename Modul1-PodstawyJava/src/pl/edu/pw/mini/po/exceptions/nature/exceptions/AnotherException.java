package pl.edu.pw.mini.po.exceptions.nature.exceptions;

public class AnotherException extends Exception {
	/*Wyjatek z konstruktorem */
	public AnotherException(Throwable cause) {
		super("Tutaj wpisujemy nasza informacje opisujaca wyjatek jesli zawsze jest taka sama", cause);
	}
	/*Tutaj opis wyjatku pobieram z zewnarz. Niech poda go cos co wie co napisac.*/
	public AnotherException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
