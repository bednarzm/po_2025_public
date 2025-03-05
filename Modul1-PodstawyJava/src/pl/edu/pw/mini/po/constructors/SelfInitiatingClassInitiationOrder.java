package pl.edu.pw.mini.po.constructors;

public class SelfInitiatingClassInitiationOrder {
	public static int anotherStaticValue = 1; 
	
	private static Object staticObject = staticInit("Static field");
	private Object nonstaticObject = nonStaticInit("Non static field");
	
	static {
		staticInit("Static block");
	}
	
	{
		nonStaticInit("Non static block");
	}

	public SelfInitiatingClassInitiationOrder() {
		nonStaticInit("Constructor");
	}
	
	private static Object staticInit(String whereWasCalled) {
		System.out.println("Static was called at " + whereWasCalled);
		return new Object();
	}
	
	private static Object nonStaticInit(String whereWasCalled) {
		System.out.println("Non static was called at " + whereWasCalled);
		return new Object();
	}
}
