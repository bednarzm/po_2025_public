package pl.edu.pw.mini.po.blocks;

public class BlocksDemonstrator {

	public int anyValue;//Unikamy publicznych pol - tutaj public jest ze wzgledow demonstracyjnych. Tak sie nie powinno robic.

	public static void main(String[] args) {
		staticDoSomething();
		
		//publicDoSomething();//Nie kompiluje sie bo to metoda niestatyczna
		BlocksDemonstrator blocksDemonstrator = new BlocksDemonstrator();
		blocksDemonstrator.publicNonstaticDoSomething();//Teraz sie kompiluje bo metoda est wywolywana z obiektu
		
		blocksDemonstrator.privateDoSomething();//Tez przejdzie bo blockDemonstrator instancja tej samej klasy co klasa z punktu widzenie ktorej 
												//metoda prywatna jest wywolywana BlocksDemonstrator.main, a kazda klasa ma dostep do swych pol prywatnych
		
		
		System.out.println("Any value before wrong setting: " + blocksDemonstrator.anyValue);
		blocksDemonstrator.setAnyValueWrongly(22);
		System.out.println("Any value after wrong setting: " + blocksDemonstrator.anyValue);
		System.out.println();
		System.out.println("Any value before proper setting: " + blocksDemonstrator.anyValue);
		blocksDemonstrator.setAnyValueProper(22);
		System.out.println("Any value after proper setting: " + blocksDemonstrator.anyValue);
		
		blocksDemonstrator.showBlock();
		
		System.out.println("Hej");
		System.out.print("Hej\n");
		
		System.out.println("Tralalala \n");
		System.out.println("Tralalala \n\n next \n\n next \n");
		
		System.out.print("Print only: \n");
		
		
	}
	
	public static void staticDoSomething() {
		
	}

	public void publicNonstaticDoSomething() {
		
	}

	private void privateDoSomething() {
		
	}

	public void setAnyValueWrongly(int anyValue) {
		anyValue = anyValue;//anyvalue jest zmiena lokalna i ustawia sama siebie, a chcielismy zeby ustawiala pole anyValue
	}

	public void setAnyValueProper(int anyValue) {
		this.anyValue = anyValue;//dzieki uzyciu "this" mamy rozroznienie zmiennej lokalnej i pola w klasie ktore chcemy ustawic
	}
	
	public void showBlock() {
		this.anyValue = 5;
		
		{
			int anyValue = 10;//Znowu nadpisuje nam pole o tej samej nazwie
		
			{
				int anotherValue = 1;
			}
		}
		
		System.out.println("Field anyValue" + this.anyValue + " local anyValue: " + anyValue);
		
	}
	
}
