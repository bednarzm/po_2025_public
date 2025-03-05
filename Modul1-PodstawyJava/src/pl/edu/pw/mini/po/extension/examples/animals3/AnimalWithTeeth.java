package pl.edu.pw.mini.po.extension.examples.animals3;

import java.util.Random;

public abstract class AnimalWithTeeth {//klasa posrednia ze wspolnymi elementami dla psa i kota

	protected int currentToothNumber;//moze byc i private z getterem lub setterem (nawet lepiej) ale tu zalozylismy tak
	protected Random random = new Random();//moze byc i private z getterem  (nawet lepiej)

	public AnimalWithTeeth() {
	}

}
