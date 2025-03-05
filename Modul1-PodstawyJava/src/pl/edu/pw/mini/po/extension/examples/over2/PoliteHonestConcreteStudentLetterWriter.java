package pl.edu.pw.mini.po.extension.examples.over2;

public class PoliteHonestConcreteStudentLetterWriter extends HonestConcreteStudentLetterWriter{

	@Override
	public String writeALetter() {
		return "Dear parents! \n " + "I`d like to kindly inform you that \n " + super.writeALetter() + "\n My best! \n";
	}
	
}
