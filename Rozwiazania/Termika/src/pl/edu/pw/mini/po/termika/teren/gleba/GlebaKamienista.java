package pl.edu.pw.mini.po.termika.teren.gleba;

public class GlebaKamienista extends Gleba {

	private static final double GESTOSC_MINIMALNA = 1;

	public GlebaKamienista() {
		super(random.nextDouble() + GESTOSC_MINIMALNA);
	}

}
