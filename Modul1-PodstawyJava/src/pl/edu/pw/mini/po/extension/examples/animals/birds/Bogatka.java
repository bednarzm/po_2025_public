package pl.edu.pw.mini.po.extension.examples.animals.birds;

public class Bogatka extends Ptak {
	
	private static final String PIERWSZY_DZWIEK = "cicibej";//Taki sam dla wszystkich bogatek wiec statyczny, notacja wezowa
	private static final String DRUGI_DZWIEK = "si si trn";//Taki sam dla wszystkich bogatek wiec statyczny, notacja wezowa
	
	@Override
	protected String nazwaGatunkowa() {
		return "Sikorka Bogatka";
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
