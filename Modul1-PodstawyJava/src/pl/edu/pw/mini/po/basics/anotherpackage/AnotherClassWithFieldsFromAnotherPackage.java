package pl.edu.pw.mini.po.basics.anotherpackage;

public class AnotherClassWithFieldsFromAnotherPackage {

	private int privateScopeIntValue;
	int defaultScopeIntValue;
	public int publicScopeIntValue;//Generalnie nie powinno sie dawac pelnego zasiegu dla pol
	
	public int sumAllFields() {
		return privateScopeIntValue + defaultScopeIntValue + publicScopeIntValue;
	}
	
	public void printSumAllFields() {
		int suma = privateScopeIntValue + defaultScopeIntValue + publicScopeIntValue;
		System.out.println(" Suma: " + suma);
	}
	
	int multiplePrivateScopeIntValue(int factor) {
		return privateScopeIntValue * factor;
	}
	
	private String generateGreetings() {
		return "My greeting is: Hi!" ;
	}
	
	public void doSomething() {
		String greeting = generateGreetings();
		int value = multiplePrivateScopeIntValue(5);
		System.out.println(" >>> " + greeting + " " + value);
	}

}
