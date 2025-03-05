package pl.edu.pw.mini.po.extension.animals;

public class Dog extends AnimalWithTeeth{

	public Dog() {
		currentToothObject = 40 + drawNextInt(3);
	}

}
