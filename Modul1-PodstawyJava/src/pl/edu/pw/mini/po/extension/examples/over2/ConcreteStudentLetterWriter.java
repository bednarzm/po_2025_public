package pl.edu.pw.mini.po.extension.examples.over2;

public class ConcreteStudentLetterWriter extends StudentLetterWriter {

	@Override
	public String writeALetter() {
		return super.writeALetter() + " Because I`ve spent too much of my money on Saturday...";
	}

}
