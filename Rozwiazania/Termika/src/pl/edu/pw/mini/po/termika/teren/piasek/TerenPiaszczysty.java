package pl.edu.pw.mini.po.termika.teren.piasek;

import pl.edu.pw.mini.po.termika.teren.NieobslugiwanaTemperaturaException;
import pl.edu.pw.mini.po.termika.teren.RodzajTerenu;

public class TerenPiaszczysty extends RodzajTerenu {

	private GranulacjaPiasku granulacjaPiasku;

	@Override
	public double getPradyNoszace() {
		return 0.2 * getTemperatura() * random.nextDouble();
	}

	@Override
	public void modyfikujTemperature(int deltaT) throws NieobslugiwanaTemperaturaException {
		double docelowaTemperatura = zaproponujTemperature(deltaT);
		setTemperatura(docelowaTemperatura <= 50 ? docelowaTemperatura : 50);
	}

}
