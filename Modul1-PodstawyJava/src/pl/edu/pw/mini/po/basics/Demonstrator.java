package pl.edu.pw.mini.po.basics;

import pl.edu.pw.mini.po.basics.anotherpackage.AnotherClassWithFieldsFromAnotherPackage;
import pl.edu.pw.mini.po.basics.anotherpackage.ClassToBeImported;

public class Demonstrator {

	public static void main(String[] args) {
		//demonstrateEmptyClasses();
		//demonstrateReferenceNamingConvention();
		//demonstrateClassFieldsAndScopes();
		//demonstrateClassMethodsAndScopes();
		//demonstrateStaticAndNonStaticContent();
		//demonstrateImport();
		
	}

	private static void demonstrateEmptyClasses() {
		EmptyClass emptyClass1 = new EmptyClass();
		EmptyClass emptyClass2 = new EmptyClass();
		EmptyClass emptyClass3 = new EmptyClass();
		
		System.out.println("Empty class objects: ");
		System.out.println("First: "+ emptyClass1);
		System.out.println("Second: "+ emptyClass2);
		System.out.println("Third: "+ emptyClass3);
	}
	
	private static void demonstrateReferenceNamingConvention() {
		ClassWithFieldsFromSamePackage classWithFieldsFromSamePackage = new ClassWithFieldsFromSamePackage();
		ClassWithFieldsFromSamePackage classWithFields = new ClassWithFieldsFromSamePackage();
		
		
		ClassWithFieldsFromSamePackage k = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
		ClassWithFieldsFromSamePackage zz = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
		ClassWithFieldsFromSamePackage zmienna = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
		ClassWithFieldsFromSamePackage kotek1 = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
		ClassWithFieldsFromSamePackage piesek7 = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
		ClassWithFieldsFromSamePackage rambo = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
		ClassWithFieldsFromSamePackage kokoszka_dziubala_oj_dziubala = new ClassWithFieldsFromSamePackage();//Niewiele to nam mowi o zmiennej
	}

	private static void demonstrateClassFieldsAndScopes() {
		
		ClassWithFieldsFromSamePackage classFromSamePackage = new ClassWithFieldsFromSamePackage();
		classFromSamePackage.publicScopeIntValue = 10;
		classFromSamePackage.defaultScopeIntValue = 20;
		
		//classFromSamePackage.privateScopeIntValue = 30;//Nie kompiluje sie, zasieg niedostepny z tego miejsca
		
		System.out.println(classFromSamePackage.publicScopeIntValue + " " + classFromSamePackage.defaultScopeIntValue
				+ " " + (classFromSamePackage.publicScopeIntValue + classFromSamePackage.defaultScopeIntValue));
		
		AnotherClassWithFieldsFromAnotherPackage classFromNaAnotherPackage = new AnotherClassWithFieldsFromAnotherPackage();
		classFromNaAnotherPackage.publicScopeIntValue = 111;
		
		//classFromNaAnotherPackage.defaultScopeIntValue = 222;//Nie kompiluje sie, zasieg niedostepny z tego miejsca
		//classFromNaAnotherPackage.privateScopeIntValue = 333;//Nie kompiluje sie, zasieg niedostepny z tego miejsca
		
		System.out.println(classFromNaAnotherPackage.publicScopeIntValue + " " + classFromSamePackage.defaultScopeIntValue);
		
		//klejenie stringów z liczbami
	}
	
	private static void demonstrateClassMethodsAndScopes() {
		ClassWithFieldsFromSamePackage classFromSamePackage = new ClassWithFieldsFromSamePackage();
		classFromSamePackage.publicScopeIntValue = 5;
		classFromSamePackage.defaultScopeIntValue = 6;
		
		int summarizedFields = classFromSamePackage.sumAllFields();
		System.out.println("Suma: " + summarizedFields);
		classFromSamePackage.printSumAllFields();
		int multipliedFields = classFromSamePackage.multiplePrivateScopeIntValue(5);
		
		//String generatedGreeting = classFromSamePackage.generateGreetings();//Nie kompiluje sie, zasieg niedostepny z tego miejsca
		classFromSamePackage.doSomething();//Ale to juz tak i prywatna metoda generateGreetings() moze byc wywolana przez doSomething()
		
		classFromSamePackage.printGreetingForGuy("Piotrek");
		classFromSamePackage.printGreetingForGuy("Janek", "Ala");

		AnotherClassWithFieldsFromAnotherPackage classFromNaAnotherPackage = new AnotherClassWithFieldsFromAnotherPackage();
		classFromNaAnotherPackage.publicScopeIntValue = 5;
		//classFromNaAnotherPackage.defaultScopeIntValue = 6;//Nie kompiluje sie, zasieg niedostepny z tego miejsca
		
		summarizedFields = classFromNaAnotherPackage.sumAllFields();
		System.out.println("Suma: " + summarizedFields);
		
		classFromNaAnotherPackage.printSumAllFields();
		//multipliedFields = classFromNaAnotherPackage.multiplePrivateScopeIntValue(5);//Nie kompiluje sie, zasieg niedostepny z tego miejsca
		
	}

	private static void demonstrateStaticAndNonStaticContent() {

		ClassWithStaticAndNonStaticContent firstObject = new ClassWithStaticAndNonStaticContent();
		ClassWithStaticAndNonStaticContent secondObject = new ClassWithStaticAndNonStaticContent();
		ClassWithStaticAndNonStaticContent thirdObject = new ClassWithStaticAndNonStaticContent();
		
		
		firstObject.nonStaticValue = 10;
		secondObject.nonStaticValue = 20;
		thirdObject.nonStaticValue = 30;
		System.out.println("Non static values: " + firstObject.nonStaticValue + " " + secondObject.nonStaticValue + " " + thirdObject.nonStaticValue);
		
		firstObject.staticValue = 10;
		System.out.println("Static values: " + firstObject.staticValue + " " + secondObject.staticValue + " " + thirdObject.staticValue);
		
		ClassWithStaticAndNonStaticContent.staticValue = 222;
		System.out.println("Static values: " + firstObject.staticValue + " " + secondObject.staticValue + " " + thirdObject.staticValue);
		
		ClassWithStaticAndNonStaticContent.staticValue = 333;
		System.out.println("Static values: " + ClassWithStaticAndNonStaticContent.staticValue 
				+ " " + ClassWithStaticAndNonStaticContent.staticValue + " " + ClassWithStaticAndNonStaticContent.staticValue);
		
		//ClassWithStaticAndNonStaticContent.nonStaticValue;//Nie kopiluje sie bo pole niestatyczne moze egzystowac tylko z obiektem
															//t.j. instancja klasy a nie z nia sama
		
		//ClassWithStaticAndNonStaticContent.notImpossibleToCallNonStaticMethod();//Nie kompilujace sie metody - zawieraja celowe bledy
		//ClassWithStaticAndNonStaticContent.notImpossibleToSetStaticFieldValue();//Nie kompilujace sie metody - zawieraja celowe bledy
		
	}
	
	private static void demonstrateImport() {
		ClassToBeImported sl;
	}

}
