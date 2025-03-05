package pl.edu.pw.mini.po.extension.examples.animals2;

import java.util.Random;

public abstract class AnimalWithTeeth {

	private int currentToothNumber;//moze byc i protected ale tu zalozylismy tak
	protected Random random = new Random();//moze byc i private z getterem  (nawet lepiej)

	protected abstract int generateCurrentToothNumber();//siegamy do implementacji w przyszlej podklasie

	public AnimalWithTeeth() {
		this.currentToothNumber = generateCurrentToothNumber();
	}

}
