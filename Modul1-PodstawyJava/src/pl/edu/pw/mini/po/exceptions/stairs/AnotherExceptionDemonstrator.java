package pl.edu.pw.mini.po.exceptions.stairs;

import java.util.Random;

import pl.edu.pw.mini.po.exceptions.nature.exceptions.AnotherException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.FirstException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SecondException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.ThirdException;

public class AnotherExceptionDemonstrator {

	public static void main(String... args) {
		
	}
	
	private static void basicThrowingMethod() throws FirstException, SecondException, ThirdException {
		switch (new Random().nextInt(5)) {
		case 0:
			throw new FirstException();
		// break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy
		// nie bedzie wykonany
		case 1:
			throw new SecondException();
		// break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy
		// nie bedzie wykonany
		case 2:
			throw new ThirdException();
		// break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy
		// nie bedzie wykonany
		case 3:
		case 4:
			System.out.println("Oh Yeah! Wyjatek nie polecial! Metoda normalnie konstynuje prace!");
		}
	}

	private static void wrongMethod() {
		//fourthThrowingMethod();
		//Nie kompiluje sie. Albo lapiemy na miejscu albo deklarujemy przechodniosc i puszczamy wyjatek 
		// "nad glowa" (throws).
	}

	/*
	 * First exception lapiemy na miejscu a reszt "puszczamy nad glowa" jesli nie chcemy ich tu lapac i obslugiwac 
	 */
	private static void secondMethod() throws ThirdException, AnotherException {
		try {
			basicThrowingMethod();
		} catch(FirstException firstException) {
			firstException.printStackTrace();//obslugujemy i zamykamy sprawe
		} catch(SecondException secondException) {
			secondException.printStackTrace();//lapiemy i wyrzucamy dalej ale juz pod innym szyldem
			//Trzeba pamietac zeby zadeklarowac jego typ przy "throws"
			throw new AnotherException("Zdarzyl sie demonstracyjny wyjatek. Masakra.", secondException);
		} 
	}
	
	/*
	 * First exception lapiemy na miejscu a reszt "puszczamy nad glowa" jesli nie chcemy ich tu lapac i obslugiwac 
	 */
	private static void thirdMethod() throws SecondException, ThirdException{
		try {
			basicThrowingMethod();
		} catch(FirstException firstException) {
			firstException.printStackTrace();
		}
	}
	
}
