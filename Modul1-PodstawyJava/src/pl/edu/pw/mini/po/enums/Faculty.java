package pl.edu.pw.mini.po.enums;

public enum Faculty {

	MINI("Wydzial Matematyki i Nauk Informacyjnych", "MiNI", "MiNI"), 
	EL("Wydzial Elektroniki", "WE", "Elka"), 
	FTIMS("Wydzial Fizyki Technicznej i Matematyki Stosowanej", "FTiMS", "Fartem To i Moze Skonczysz"), 
	WIP("Wydzial Inzynierii Produkcji", "WiP", "VIP");

	private String fullName;
	private String shortcut;
	private String inofficialName;

	private Faculty(String fullName, String shortcut, String inofficialName) {
		this.fullName = fullName;
		this.shortcut = shortcut;
		this.inofficialName = inofficialName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getShortcut() {
		return shortcut;
	}

	public String getInofficialName() {
		return inofficialName;
	}

}
