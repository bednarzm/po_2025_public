package pl.edu.pw.mini.po.extension.examples.animals.birds;

public class Wrobel extends Ptak {

	private static final String PIERWSZY_DZWIEK = "cilp";//Taki sam dla wszystkich wrobli wiec statyczny, notacja wezowa
	private static final String DRUGI_DZWIEK = "szelp";//Taki sam dla wszystkich wrobli wiec statyczny, notacja wezowa
	private static final String TRZECI_DZWIEK = "errr";//Taki sam dla wszystkich wrobli wiec statyczny, notacja wezowa
	private static final String CZWARTY_DZWIEK = "tetet";//Taki sam dla wszystkich wrobli wiec statyczny, notacja wezowa

	@Override
	protected String nazwaGatunkowa() {
		return "Wrobel zwyczajny";
	}

	@Override
	public void dajGlos() {
		//Zalozny ze pierwszy dzwiek wystepuje w polowie przypadkow, a reszta po rowno w drugiej czesci
		
		if(random.nextBoolean()) {
			System.out.println(PIERWSZY_DZWIEK);
		} else {
			int drawnValue = random.nextInt(3);
			switch(drawnValue) {
				case 0:
						System.out.println(DRUGI_DZWIEK);
					break;
				case 1:
						System.out.println(TRZECI_DZWIEK);
					break;
				case 2:
						System.out.println(CZWARTY_DZWIEK);
					break;
					default:
						//nic nie robi wiec mozna nie implementowac
			}
		}
	}
	
}
