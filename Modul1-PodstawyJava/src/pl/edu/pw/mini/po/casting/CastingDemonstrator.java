package pl.edu.pw.mini.po.casting;

public class CastingDemonstrator {

	public static void main(String[] args) {
		castingDemonstrator1();
		
		Animal animal = new Duck();
		//castingDemonstrator2(animal);
		
		Object stringObject = new String("");
		//castingDemonstrator2(stringObject);
		
		//castingDemonstrator3(animal);
		//castingDemonstrator3(stringObject);
	}

	private static void castingDemonstrator1() {
		/*
		Duck kaczka = new Duck();
		System.out.println(kaczka.myField);
		kaczka.fly();
		*/
		//Bird bird = new Duck();
		//Animal animal = bird;
		//Duck duck = bird;//Blad kompilacji. Bez castingu nie da rady
		//Duck duck = (Duck)bird;
		
	}
	private static void castingDemonstrator2(Object object) {
		Duck duck = (Duck)object;//Brzydko!!!
		duck.dive();
	}

	private static void castingDemonstrator3(Object object) {
		if(object instanceof Duck) {//Instanceof uzywamy tylko wtedy gdy nie mamy innego wyjscia.
			Duck duck = (Duck)object;//Bezpiecznie ale wciaz Brzydko!!!
			duck.dive();
		}
	}

}
