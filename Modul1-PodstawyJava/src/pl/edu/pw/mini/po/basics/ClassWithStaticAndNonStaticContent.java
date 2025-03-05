package pl.edu.pw.mini.po.basics;

public class ClassWithStaticAndNonStaticContent {

	public static int staticValue;// Nie trzeba uzywac static w nazwach pol statycznych - dodano dla rozroznienia
	public int nonStaticValue;// unikamy deklarowania publicznych pol

	public static void staticMethodDoingSomething() {
		System.out.println("I am a static method and I am doing something now...");
	}

	public static void nonStaticMethodDoingSomething() {
		System.out.println("I am a non static method and I am doing something now...");
	}

	public static void increaseStaticValue() {
		staticValue++;
		// nonStaticValue++;//To nie przejdzie bo statyczna metoda nie moze odnosic sie
		// do niestatycznych elementow
		staticMethodDoingSomething();// Mozna wywolywac ine statyczne metody

	}

	public void increaseNonStaticValue() {
		nonStaticValue++;
	}

	public void nonStaticMethod() {
		staticMethodDoingSomething();// Niestatyczna metoda moze wywolywac statyczne metody
		increaseStaticValue();// Niestatyczna metoda moze wywolywac statyczne metody
		System.out.println(staticValue);
		nonStaticMethodDoingSomething();// Niestatyczna metoda moze wywolywac niestatyczne metody
		increaseNonStaticValue();
	}

	/* Nie kompiluje sie bo metoda statyczna nie moze sie odwolywac do metody statycznej
	public static void notImpossibleToCallNonStaticMethod() {
		increaseNonStaticValue();
	}
	*/
	
	/* Nie kompiluje sie bo metoda statyczna nie moze sie odwolywac do metody statycznej
	public static void notImpossibleToSetStaticFieldValue() {
		nonStaticValue = 89;
	}
	*/
	
}
