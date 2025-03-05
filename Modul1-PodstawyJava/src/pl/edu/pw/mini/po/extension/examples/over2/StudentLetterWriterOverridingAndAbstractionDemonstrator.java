package pl.edu.pw.mini.po.extension.examples.over2;

public class StudentLetterWriterOverridingAndAbstractionDemonstrator {

	public static void main(String[] args) {
		//demonstrate1();
		//demonstrate2();
	}

	private static void demonstrate1() {
		PostOffice postOffice = new PostOffice();
		
		StudentLetterWriter studentLetterWriter = new PoliteHonestConcreteStudentLetterWriter();
		PoliteHonestConcreteStudentLetterWriter politeHonestConcreteStudentLetterWriter = new PoliteHonestConcreteStudentLetterWriter();
		
		postOffice.sendLetterFromConcreteWriter(studentLetterWriter);
		postOffice.sendLetterFromConcreteWriter(politeHonestConcreteStudentLetterWriter);
	}

	private static void demonstrate2() {
		PostOffice postOffice = new PostOffice();
		
		StudentLetterWriter studentLetterWriter = new PoliteHonestConcreteStudentLetterWriter();
		PoliteHonestConcreteStudentLetterWriter politeHonestConcreteStudentLetterWriter = new PoliteHonestConcreteStudentLetterWriter();
		
		postOffice.sendLetterFromAbstractWriter(studentLetterWriter);
		postOffice.sendLetterFromAbstractWriter(politeHonestConcreteStudentLetterWriter);
	}

}
