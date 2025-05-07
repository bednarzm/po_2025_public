package pl.edu.pw.mini.po.visitor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import pl.edu.pw.mini.po.visitor.animals.Animal;
import pl.edu.pw.mini.po.visitor.animals.Bird;
import pl.edu.pw.mini.po.visitor.animals.Cat;
import pl.edu.pw.mini.po.visitor.animals.Dog;

public class VisitorDemonstrator {

	/**
	 * Zalozmy ze w odziedziczonym po kims kodzie (ktory nie moze byc zmieniany)
	 * majac tylko kolekcje referencji na nadklasy, pojawila sie potrzeba
	 * wyekstrahowania listy imion psow i kotow ktore tam sa, celem pozniejszego
	 * wypisania ich na konsoli. Psie imie jest dodatkowo skonkatenowane z psim id.
	 */
	public static void main(String[] args) {
		List<Animal> animals = collectionTakenFromOtherLibrary();
		printAnimals(animals);

		System.out.println();

		List<String> namesExtractedByInstanceof = extractNamesUsingInstanceof(animals);
		System.out.println("Extracted names using instanceof: " + namesExtractedByInstanceof);
		List<String> namesExtractedByVisitor = extractNameUsingVisitor(animals);
		System.out.println("Extracted names using visitor: " + namesExtractedByVisitor);

	}

	private static void printAnimals(List<Animal> animals) {
		for (Animal animal : animals) {
			System.out.println(animal);
		}
	}

	private static List<Animal> collectionTakenFromOtherLibrary() {
		List<Animal> shapes = new LinkedList<>();

		shapes.add(new Dog("Fafik"));
		shapes.add(new Dog("Dina"));
		shapes.add(new Dog("Burek"));
		shapes.add(new Dog("Burek"));
		shapes.add(new Dog("Burek"));
		shapes.add(new Cat("Gniewosz"));
		shapes.add(new Cat("Munio"));
		shapes.add(new Bird("Kra-kra"));
		shapes.add(new Bird("Kukuryku"));

		return shapes;

	}

	private static List<String> extractNamesUsingInstanceof(List<Animal> animals) {
		List<String> result = new ArrayList<>();

		for (Animal animal : animals) {
			if (animal instanceof Dog) {
				Dog dog = (Dog) animal;// Tu musimy castowac aby miec dostep do getDogId()
				result.add(animal.getName() + dog.getDogId());
			} else if (animal instanceof Cat) {
				result.add(animal.getName());// Tu nie musimy castowac bo getName() mamy z nadklasy
			}
		}

		return result;
	}

	private static List<String> extractNameUsingVisitor(List<Animal> animals) {
		DogCatNamesExtractingVisitorImpl dogCatNamesExtractingVisitorImpl = new DogCatNamesExtractingVisitorImpl();
		for (Animal animal : animals) {
			animal.apply(dogCatNamesExtractingVisitorImpl);
		}

		return dogCatNamesExtractingVisitorImpl.getExtractedNames();
	}

}
