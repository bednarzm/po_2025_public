package pl.edu.pw.mini.po.constructors;

public class ClassToBeConstructed {

	private int firstValue;
	private int age;
	private String name;
	private String lastName;

	public ClassToBeConstructed() {
		this.age = 20;
		this.firstValue = 55;
	}

	public ClassToBeConstructed(int age, String name, String lastName) {
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}

	public ClassToBeConstructed(int firstValue, int age, String name, String lastName) {
		this.firstValue = firstValue;
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}

	public int getFirstValue() {
		return firstValue;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}

}
