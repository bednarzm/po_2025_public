package pl.edu.pw.mini.po.extension.examples.animals2;

public class Dog extends AnimalWithTeeth {

	@Override
	protected int generateCurrentToothNumber() {
		return random.nextInt(4) + 39;//39-42
	}

}
