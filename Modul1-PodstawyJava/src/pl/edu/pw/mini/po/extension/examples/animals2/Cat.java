package pl.edu.pw.mini.po.extension.examples.animals2;

public class Cat extends AnimalWithTeeth {

	@Override
	protected int generateCurrentToothNumber() {
		return random.nextInt(5) + 26;//26-30
	}

}
