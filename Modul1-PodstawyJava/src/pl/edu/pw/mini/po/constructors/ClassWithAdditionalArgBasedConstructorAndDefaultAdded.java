package pl.edu.pw.mini.po.constructors;
/*
 * Nazw to juz troche za dluga
 */
public class ClassWithAdditionalArgBasedConstructorAndDefaultAdded {

	private String name;

	public ClassWithAdditionalArgBasedConstructorAndDefaultAdded() {
		name = "Default name";
	}

	public ClassWithAdditionalArgBasedConstructorAndDefaultAdded(String name) {
		this.name = name;
	}
	
}
