package pl.edu.pw.mini.po.extension.examples.over;

public class BaseClass {
	public void doSomething() {
		System.out.println("BaseClass: Cos robie");
	}
	public void doSomething(int i) {//OVERLOADED not OVERRIDDEN, name the same but different number of params
		System.out.println("BaseClass: Cos robie");
	}
	public void doSomething(String name) {//OVERLOADED not OVERRIDDEN, name the same but different number of params
		System.out.println(name +": " + "BaseClass: Cos robie");
	}
	
	public void doSomething(String... name) {//OVERLOADED not OVERRIDDEN, name the same but different number of params
		System.out.println(name +": " + "BaseClass: Cos robie");
	}
	
	public void overload(BaseClass baseClass) {
		System.out.println("1");
	}
	
	public void overload(ExtendingClass baseClass) {
		System.out.println("2");
	}
	
}
