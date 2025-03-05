package pl.edu.pw.mini.po.nulls;

import pl.edu.pw.mini.po.basics.ClassWithStaticAndNonStaticContent;

public class NullDemonstrator {

	ClassWithStaticAndNonStaticContent staticContentClass;
	
	public static void main(String[] args) {

		//demonstrateNulls();
		//demonstrateManyReferenceToDifferentObjects();
		demonstrateManyReferenceToSameObject();

	}

	private static void demonstrateNulls() {
		/*
		//Zmienne lokalne trzeba zawsze inicjalozowac chocby to by null
		ClassWithStaticAndNonStaticContent notinitializedObjectAndNonNulledObject;
		System.out.println(" >>> " + notinitializedObjectAndNonNulledObject);
		*/
		
		ClassWithStaticAndNonStaticContent notinitializedObject = null;
		
		notinitializedObject.staticMethodDoingSomething();
		
		ClassWithStaticAndNonStaticContent.staticMethodDoingSomething();
		
		//notinitializedObject.nonStaticMethod();//Wyrzuci wyjatek podczas uruchamiania
		
		System.out.println();
	}

	private static void demonstrateManyReferenceToDifferentObjects() {
		MyClass firstReference = new MyClass();
		MyClass secondReference = new MyClass();
		MyClass thirdReference = new MyClass();
		
		System.out.println(" Before setting on secondReference only: first: " + firstReference.value + " second: " + secondReference.value
								+ " third: " + thirdReference.value);
		secondReference.value = 44;
		System.out.println(" Before setting on secondReference only: first: " + firstReference.value + " second: "
								+ secondReference.value + " third: " + thirdReference.value);
		System.out.println();
	}

	private static void demonstrateManyReferenceToSameObject() {
		MyClass firstReference;
		MyClass secondReference;
		MyClass thirdReference;
		
		secondReference = new MyClass();
		firstReference = secondReference;
		thirdReference = secondReference;
		
		
		System.out.println(" Before setting on secondReference only: first: " + firstReference.value + " second: " + secondReference.value
								+ " third: " + thirdReference.value);
		secondReference.value = 44;
		System.out.println(" Before setting on secondReference only: first: " + firstReference.value + " second: "
								+ secondReference.value + " third: " + thirdReference.value);
	}

}
