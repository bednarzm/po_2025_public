package pl.edu.pw.mini.po.termika.teren;

import java.util.Random;

public abstract class RodzajTerenu {

	protected static final Random random = new Random();

	private double temperatura;

	public abstract double getPradyNoszace();

	public abstract void modyfikujTemperature(int deltaT) throws NieobslugiwanaTemperaturaException;

	protected double zaproponujTemperature(double deltaT) throws NieobslugiwanaTemperaturaException {
		if (deltaT < -20 || deltaT > 50) {
			throw new NieobslugiwanaTemperaturaException(deltaT);
		}
		return temperatura + deltaT;
	}

	protected double getTemperatura() {
		return temperatura;
	}

	protected void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

}
