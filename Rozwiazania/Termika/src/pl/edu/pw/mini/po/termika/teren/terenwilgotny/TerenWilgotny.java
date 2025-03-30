package pl.edu.pw.mini.po.termika.teren.terenwilgotny;

import pl.edu.pw.mini.po.termika.teren.NieobslugiwanaTemperaturaException;
import pl.edu.pw.mini.po.termika.teren.RodzajTerenu;

public abstract class TerenWilgotny extends RodzajTerenu {

	private boolean natura2000;

	public TerenWilgotny() {
		natura2000 = random.nextBoolean();
	}

	@Override
	public double getPradyNoszace() {
		return getTemperatura() / 10.0 - 1 + random.nextInt(4);
	}

	@Override
	public void modyfikujTemperature(int deltaT) throws NieobslugiwanaTemperaturaException {
		double docelowaTemperatura = zaproponujTemperature(deltaT);
		setTemperatura(docelowaTemperatura <= 20 ? docelowaTemperatura : 20);
	}
	
}
