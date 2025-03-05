package pl.edu.pw.mini.po.extension.examples.over2;

public class PostOffice {

	public void sendLetterFromConcreteWriter(StudentLetterWriter studentLetterWriter) {//Uzaleznienie od konkretu
		System.out.println("A letter to be sent: \n\n" + studentLetterWriter.writeALetter());
	}

	public void sendLetterFromAbstractWriter(LetterWriter letterWriter) {//Brak uzaleznienia od konkretu (abstrakcja)
		System.out.println("A letter to be sent: \n\n" + letterWriter.writeALetter());
	}
	
}
