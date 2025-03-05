package pl.edu.pw.mini.po.constructors;

public class ClassWithAdditionalArgBasedConstructorAdded {
	private String name;
	
	public ClassWithAdditionalArgBasedConstructorAdded(String name) {
		this.name = name;
		name = name.toLowerCase();
	}
	
}
