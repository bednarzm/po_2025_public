package pl.edu.pw.mini.po.extension.examples.animals.birds;

public class Kuropatwa extends Ptak {

	private static final String PIERWSZY_DZWIEK = "dziurryk";//Taki sam dla wszystkich kuropatw wiec statyczny, notacja wezowa
	private static final String DRUGI_DZWIEK = "cerrwik";//Taki sam dla wszystkich kuropatw wiec statyczny, notacja wezowa
	private static final String TRZECI_DZWIEK = "kirryk";//Taki sam dla wszystkich kuropatw wiec statyczny, notacja wezowa
	
	@Override
	protected String nazwaGatunkowa() {
		return "Kuropatwa kolorowa";//No niech sie juz tak nazywa
	}

	@Override
	public void dajGlos() {
		int drawnValue = random.nextInt(3);//Zalozny ze dzwieki sa tak samo prawdopodobne

		switch(drawnValue) {
			case 0:
					System.out.println(PIERWSZY_DZWIEK);
				break;
			case 1:
					System.out.println(DRUGI_DZWIEK);
				break;
			case 2:
					System.out.println(TRZECI_DZWIEK);
				break;
				default:
					//nic nie robi wiec mozna nie implementowac
		}

	}
	
}
