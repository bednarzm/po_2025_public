package pl.edu.pw.mini.po.exceptions.nature.throwing;

import pl.edu.pw.mini.po.exceptions.nature.exceptions.FirstException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.NonRelatedWithRootException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.RootException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SecondException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SophisticatedSecondException;

public class ThrowingExceptionDemonstrator {

	public static void main(String[] args) {
		//demonstrateProperExceptionCatching();
		//demonstrateWrongExceptionCatching();
	}

	private static void demonstrateProperExceptionCatching() {
		ExceptionThrower exceptionThrower = new ExceptionThrower();
		for(int i=0;i<10;i++) {
			catchExceptionProperly(exceptionThrower);
		}
	}
	private static void catchExceptionProperly(ExceptionThrower exceptionThrower) {
		//Dzieki ustawieniu bloku catch na wyjatki poczawszy od najdalszego potomka do rodzica (na koncu)
		//mamy pewnosc ze wszystkie beda wylapane osobno w odpowiednich miejscach
		//poniewaz catch obsluguje pierwszy pasujacy wyjatek.
		try {
			exceptionThrower.throwingMethod();
		}catch(FirstException firstException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			firstException.printStackTrace();
		}catch(SophisticatedSecondException sophisticatedSecondException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			sophisticatedSecondException.printStackTrace();
		}catch(SecondException secondException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			secondException.printStackTrace();
		}catch(RootException rootException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			rootException.printStackTrace();
		}catch(NonRelatedWithRootException nonRelatedWithRootException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			nonRelatedWithRootException.printStackTrace();
		}finally{
			//jesli potrzebujemy wstawic kod ktory sie zawsze wykona po opuszczeniu w/w bloku
			//jesli nie to nie deklarujemy bloku finally
			System.out.println("Czy wyjatek polecial czy nie block finally i tak sie wykona!");
		}
	}
	private static void demonstrateWrongExceptionCatching() {
		ExceptionThrower exceptionThrower = new ExceptionThrower();
		for(int i=0;i<10;i++) {
			catchExceptionWrongly(exceptionThrower);
		}
	}
	private static void catchExceptionWrongly(ExceptionThrower exceptionThrower) {
		try {
			exceptionThrower.throwingMethod();
		}
		
		catch(RootException rootException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			rootException.printStackTrace();
		}
		//Umieszcenie catch na typ RootException na poczatku powoduje ze podklasy nigdy nie beda lapane przez nastepne klauzule, 
		//tylko przez powyzsza. Zatem ponizszy kod nigdy nie bedzie wykonany wiec kompilator nie widzi sensu zeby go kompilowac. 
		//Efekt - zakomentowany kod sie nie kompiluje.
		/*
		catch(FirstException firstException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			firstException.printStackTrace();
		}catch(SophisticatedSecondException sophisticatedSecondException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			sophisticatedSecondException.printStackTrace();
		}catch(SecondException secondException) {
			//Cos z tym robimy. Jakos reagujemy w miare potrzeb. Albo wyrzucamy dalej pod nowym szyldem albo wstawiamy kod obslugujacy.
			secondException.printStackTrace();
		}*/
		catch(NonRelatedWithRootException nonRelatedWithRootException) {
			//Ten blok sie kompiluje poniewaz obiekt klasy NonRelatedWithRootException nie zostanie wylapany przez blok 
			//czekajacy na RootException, poniewaz nie jest jego poklasa ani nim samym. Zatem czesc kodu ma tutaj racje bytu.
			nonRelatedWithRootException.printStackTrace();
		}
		
		finally{
			//jesli potrzebujemy wstawic kod ktory sie zawsze wykona po opuszczeniu w/w bloku
			//jesli nie to nie deklarujemy bloku finally
			System.out.println("Czy wyjatek polecial czy nie block finally i tak sie wykona!");
		}
	}
}
