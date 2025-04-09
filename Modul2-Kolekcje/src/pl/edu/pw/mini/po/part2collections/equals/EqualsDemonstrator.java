package pl.edu.pw.mini.po.part2collections.equals;

import pl.edu.pw.mini.po.part2collections.equals.model.person.PersonWithEquals;
import pl.edu.pw.mini.po.part2collections.equals.model.person.PersonWithoutEquals;

public class EqualsDemonstrator {

	public static void main(String[] args) {
		//demonstratePersonWithoutEquals();
		//demonstratePersonWithEquals();
	}
	private static void demonstratePersonWithoutEquals() {
		
		PersonWithoutEquals person1 = new PersonWithoutEquals("Jan", "Nowak");
		PersonWithoutEquals person2 = new PersonWithoutEquals("Jan", "Nowak");
		PersonWithoutEquals person3 = new PersonWithoutEquals("Jan", "Nowak");
		PersonWithoutEquals person4 = new PersonWithoutEquals("Jan", "Nowak");
		PersonWithoutEquals person5 = new PersonWithoutEquals("Jan", "Nowak");
		
		System.out.println(" \nWrong way below: ");
		System.out.println(" person1 == person2? " + (person1 == person2));
		System.out.println(" person1 == person3? " + (person1 == person3));
		System.out.println(" person1 == person4? " + (person1 == person4));
		System.out.println(" person1 == person5? " + (person1 == person5));
	}

	private static void demonstratePersonWithEquals() {
		
		PersonWithEquals person1 = new PersonWithEquals("Jan", "Nowak");
		PersonWithEquals person2 = new PersonWithEquals("Jan", "Nowak");
		PersonWithEquals person3 = new PersonWithEquals("Jan", "Nowak");
		PersonWithEquals person4 = new PersonWithEquals("Jan", "Nowak");
		PersonWithEquals person5 = new PersonWithEquals("Jan", "Nowak");
		
		System.out.println(" \nWrong way below: ");
		System.out.println(" person1 == person2? " + (person1 == person2));
		System.out.println(" person1 == person3? " + (person1 == person3));
		System.out.println(" person1 == person4? " + (person1 == person4));
		System.out.println(" person1 == person5? " + (person1 == person5));
		
		System.out.println(" \nGood way below: ");
		System.out.println(" person1.equals(person2)? " + person1.equals(person2));
		System.out.println(" person1.equals(person3)? " + person1.equals(person3));
		System.out.println(" person1.equals(person4)? " + person1.equals(person4));
		System.out.println(" person1.equals(person5)? " + person1.equals(person5));
		
	}
	
}
