package pl.edu.pw.mini.po.constructors;

public class ConstructorsDemonstrator {

	public static void main(String[] args) {
		
		//demonstrateDefaultConstructorProblem();
		//demonstrateAnotherConstructorUseCase();
		//demonstrateAnotherConstructorWithToStringUseCase();
		//demonstrateAnotherTypeOfInitialization();
		//demonstrateAnotherTypeOfInitialization2();
		//demonstrateConstructorUse();
	}

	private static void demonstrateAnotherConstructorUseCase() {
		WrongLotteryTicketWithBug wrongLotteryTicketWithBug;
		
		System.out.println(" Wrong Lottery now");
		
		for(int i=0;i<100;i++) {
			wrongLotteryTicketWithBug = new WrongLotteryTicketWithBug("Jan", "Ban");
			System.out.println(wrongLotteryTicketWithBug.isWon() + " " + wrongLotteryTicketWithBug.getAllTicketsSummarizedWonPrizeAmount());
		}
		
		System.out.println(" Lottery now");
		
		for(int i=0;i<100;i++) {
			LotteryTicket lotteryTicket = new LotteryTicket("Stefan", "Stefaowicz");
			System.out.println(lotteryTicket.isWon() + " " + lotteryTicket.getAllTicketsSummarizedWonPrizeAmount());
		}
	}

	private static void demonstrateAnotherConstructorWithToStringUseCase() {
		
		System.out.println(" Lottery now");
		
		for(int i=0;i<100;i++) {
			LotteryTicket lotteryTicket = new LotteryTicket("Stefan", "Stefaowicz");
			System.out.println(lotteryTicket);
		}
	}
	
	private static void demonstrateConstructorUse() {
		ClassToBeConstructed classToBeConstructed = new ClassToBeConstructed(25, "John", "Don");
		
	}

	private static void demonstrateDefaultConstructorProblem() {
		ClassWithImpliciteDefaultConctructor classWithImpliciteDefaultConctructor;
		classWithImpliciteDefaultConctructor = new ClassWithImpliciteDefaultConctructor();//Mimo ze nie ma widocznego konstruktora to mozemy go uzyc bo zostal dodany niejawanie
		
		ClassWithAdditionalArgBasedConstructorAdded classWithAdditionalArgBasedConstructorAdded;
		//classWithAdditionalArgBasedConstructorAdded = new ClassWithAdditionalArgBasedConstructorAdded();//Nie kompiluje sie bo dodanie wlasnego konstruktora powoduje ze bezparametrowy 
																										//nie jest juz niejawanie dodawany
		
		ClassWithAdditionalArgBasedConstructorAndDefaultAdded classWithAdditionalArgBasedConstructorAndDefaultAdded;
		classWithAdditionalArgBasedConstructorAndDefaultAdded = new ClassWithAdditionalArgBasedConstructorAndDefaultAdded();//Dodalismy konstruktor bezparametrowy i juz jest ok
		
		//Jesli mimo zdefiniowania konstruktora parametrowego potrzebujemy tez i bezparametrowego to musimy go juz dodac
		
		
		
	}
	private static void demonstrateAnotherTypeOfInitialization() {
		SelfInitiatingClass selfInitiatingClass = new SelfInitiatingClass();
		SelfInitiatingClassInitiationOrder selfInitiatingClassInitiationOrder = new SelfInitiatingClassInitiationOrder();

	}
	private static void demonstrateAnotherTypeOfInitialization2() {
		System.out.println(">>>");
		int value = SelfInitiatingClassInitiationOrder.anotherStaticValue;
		System.out.println("After any static has been touched...");
		SelfInitiatingClassInitiationOrder selfInitiatingClassInitiationOrder = new SelfInitiatingClassInitiationOrder();
	}
	
}
