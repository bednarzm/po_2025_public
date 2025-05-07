package pl.edu.pw.mini.po.visitor.animals;

import pl.edu.pw.mini.po.visitor.AnimalVisitor;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void apply(AnimalVisitor animalVisitor) {
		animalVisitor.visitCat(this);
	}

	@Override
	public String toString() {
		return "Cat [name=" + getName() + "]";
	}

}
