package pl.edu.pw.mini.po.visitor;

import java.util.LinkedList;
import java.util.List;

import pl.edu.pw.mini.po.visitor.animals.Cat;
import pl.edu.pw.mini.po.visitor.animals.Dog;
/**
 * Jest to oczywiscie propozycja implementacji 
 * wzorca visitor. 
 */
public class DogCatNamesExtractingVisitorImpl implements AnimalVisitor {

	private List<String> extractedNames = new LinkedList<>();

	/**
	 * Kazda z metod visitSquare lub visitCircle wyknuje prace na rzecz 
	 * konkretnego typu ktorym jest zaiteresowana. 
	 */

	/**
	 * Metoda dla konkretnego typu (Dog).
	 * Jak widac otrzymuje juz referencje na psa (przekazana przez niego samego)
	 *  wiec ma do niego dostep i moze na nim pracowac jesli istnieje koniecznosc 
	 *  wykonywania operacji na jego rzecz z referencja do konkretnego podtypu "w reku".
	 */
	public void visitDog(Dog dog) {
		extractedNames.add(dog.getName() + dog.getDogId());
	}
	/**
	 * Metoda dla konkretnego typu (Cat).
	 * Jak widac otrzymuje juz referencje na kota (przekazana przez niego samego)
	 *  wiec ma do niego dostep i moze na nim pracowac jesli istnieje koniecznosc 
	 *  wykonywania operacji na jego rzecz z referencja do konkretnego podtypu "w reku".
	 */
	@Override
	public void visitCat(Cat cat) {
		extractedNames.add(cat.getName());
	}

	public List<String> getExtractedNames() {
		return extractedNames;
	}

}
