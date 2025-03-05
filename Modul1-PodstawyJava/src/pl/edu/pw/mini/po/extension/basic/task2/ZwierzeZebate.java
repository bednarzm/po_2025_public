package pl.edu.pw.mini.po.extension.basic.task2;

import java.util.Random;

public abstract class ZwierzeZebate extends Zwierze {
	private static Random random = new Random();

	private int biezacaLiczbaZebow;
	
	protected static int generate() {
		return new Random().nextInt(3);
	}

	public void setBiezacaLiczbaZebow(int biezacaLiczbaZebow) {
		this.biezacaLiczbaZebow = biezacaLiczbaZebow;
	}
	
}
