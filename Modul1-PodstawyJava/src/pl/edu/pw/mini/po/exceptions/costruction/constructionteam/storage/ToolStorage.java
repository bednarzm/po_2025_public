package pl.edu.pw.mini.po.exceptions.costruction.constructionteam.storage;

import pl.edu.pw.mini.po.exceptions.costruction.constructionteam.Welder;

public class ToolStorage {
	private Welder welder;//brak inicjalizacji wiec jest null

	public Welder retrieveWelder() {
		//Na potrzeby przykladu zakladamy, ze spawarke zabiera sie tylko raz i jej nie zwraca.
		return welder;
	}

}
