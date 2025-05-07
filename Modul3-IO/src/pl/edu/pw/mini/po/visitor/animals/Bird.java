package pl.edu.pw.mini.po.visitor.animals;

public class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Bird [name=" + getName() + "]";
	}

}
