package pl.edu.pw.mini.po.termika.teren.gleba;

import pl.edu.pw.mini.po.termika.teren.NieobslugiwanaTemperaturaException;
import pl.edu.pw.mini.po.termika.teren.RodzajTerenu;

public abstract class Gleba extends RodzajTerenu {
	private double gestosc;

	protected Gleba(double gestosc) {
		this.gestosc = gestosc;
	}

	@Override
	public double getPradyNoszace() {
		return 0.66 / 8.0;
	}

	@Override
	public void modyfikujTemperature(int deltaT) throws NieobslugiwanaTemperaturaException {
		double docelowaTemperatura = zaproponujTemperature(deltaT);
		setTemperatura(docelowaTemperatura <= 40 ? docelowaTemperatura : 40);
	}

}
