package pl.edu.pw.mini.po.extension.examples.over;

public class OverridingOverLoadingDemonstrator {

	public static void main(String[] args) {
		//demonstrateOverriding();
		//demonstrateOverloading();
	}

	private static void demonstrateOverriding() {
		BaseClass baseClassRefToBaseClass = new BaseClass();
		ExtendingClass extendingClassRefToExtendingClass = new ExtendingClass();
		NextExtendingClass nextExtendingClassRefToExtendingClass = new NextExtendingClass();
		
		BaseClass baseClassRefToExtendingClass = new ExtendingClass();
		BaseClass baseClassRefToNextExtendingClass = new NextExtendingClass();
		
		ExtendingClass extendingClassRedToNextExtendingClass = new NextExtendingClass();
		
		System.out.println();
		System.out.println("Odniesienie bezposrednie:");
		baseClassRefToBaseClass.doSomething();
		extendingClassRefToExtendingClass.doSomething();
		nextExtendingClassRefToExtendingClass.doSomething();
		System.out.println();
		System.out.println("Odniesienie przez referencje na nadklase:");
		baseClassRefToExtendingClass.doSomething();
		baseClassRefToNextExtendingClass.doSomething();
		extendingClassRedToNextExtendingClass.doSomething();
		
		baseClassRefToBaseClass.overload(baseClassRefToBaseClass);
//		baseClassRefToBaseClass.overload(baseClassRefToExt);
		
	}
	
	private static void demonstrateOverloading() {
		BaseClass baseClass = new BaseClass();
		baseClass.doSomething(2);
		baseClass.doSomething("Hej!");
	}
	
}
