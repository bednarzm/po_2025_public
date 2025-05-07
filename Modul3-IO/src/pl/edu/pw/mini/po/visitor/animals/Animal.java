package pl.edu.pw.mini.po.visitor.animals;

import pl.edu.pw.mini.po.visitor.AnimalVisitor;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void apply(AnimalVisitor animalVisitor) {}

	public String getName() {
		return name;
	}

}
