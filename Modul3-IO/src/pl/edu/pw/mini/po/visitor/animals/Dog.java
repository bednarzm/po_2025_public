package pl.edu.pw.mini.po.visitor.animals;

import pl.edu.pw.mini.po.visitor.AnimalVisitor;

public class Dog extends Animal {
	
	private static int dogIdCounter;

	private int dogId = ++dogIdCounter;

	public Dog(String name) {
		super(name);
	}

	@Override
	public void apply(AnimalVisitor animalVisitor) {
		animalVisitor.visitDog(this);
	}

	public int getDogId() {
		return dogId;
	}

	@Override
	public String toString() {
		return "Dog [name=" + getName() + "]";
	}

}
