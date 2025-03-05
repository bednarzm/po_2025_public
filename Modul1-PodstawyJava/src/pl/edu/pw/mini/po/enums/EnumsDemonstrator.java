package pl.edu.pw.mini.po.enums;

public class EnumsDemonstrator {

	public static void main(String[] args) {
		PrimeNumbersProcessor primeNumbersProcessor = new PrimeNumbersProcessor();
		primeNumbersProcessor.doSomethingWithPrimeNumber(18);
		primeNumbersProcessor.doSomethingWithPrimeNumberInBetterWay(PrimeNumberProcessable.THREE);
		
		University university = new University();
		university.getFacultyStudents("MiNI");
		university.getFacultyStudents("Wydzial lansu i bansu");
		university.getFacultyStudents(Faculty.MINI);
	}

}
