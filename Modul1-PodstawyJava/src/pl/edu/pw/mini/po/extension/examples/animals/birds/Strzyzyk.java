package pl.edu.pw.mini.po.extension.examples.animals.birds;

public class Strzyzyk extends Ptak{
	private static final String PIERWSZY_DZWIEK = "czek";//Taki sam dla wszystkich kuropatw wiec statyczny, notacja wezowa
	private static final String DRUGI_DZWIEK = "drrr";//Taki sam dla wszystkich kuropatw wiec statyczny, notacja wezowa

	@Override
	protected String nazwaGatunkowa() {
		return "Strzyzyk kostropaty";
	}

	@Override
	public void dajGlos() {
		if(random.nextBoolean()) {//Zalozny ze oba dzwieki sa tak samo prawdopodobne
			System.out.println(PIERWSZY_DZWIEK);
		} else {
			System.out.println(DRUGI_DZWIEK);
		}
	}

}
