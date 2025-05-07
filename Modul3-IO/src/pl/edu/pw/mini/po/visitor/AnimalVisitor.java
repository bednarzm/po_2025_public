package pl.edu.pw.mini.po.visitor;

import pl.edu.pw.mini.po.visitor.animals.Cat;
import pl.edu.pw.mini.po.visitor.animals.Dog;

public interface AnimalVisitor {
	default void visitDog(Dog dog) {};
	default void visitCat(Cat cat) {};
}
