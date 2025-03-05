package pl.edu.pw.mini.po.composite;

import java.util.Random;

public class Wheel {

	private Tyre tyre;
	
	public Wheel() {
		Random random = new Random();
		tyre = new Tyre(1 + random.nextDouble());
	}

	@Override
	public String toString() {
		return "Wheel [tyre=" + tyre + "]";
	}

}
