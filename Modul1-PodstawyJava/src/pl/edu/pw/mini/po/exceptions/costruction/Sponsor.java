package pl.edu.pw.mini.po.exceptions.costruction;

public class Sponsor {
	
	private ConstructionCompany constructionCompany = new ConstructionCompany();

	public void go() {
		try {
			constructionCompany.runProject();
		} catch (ConstructionManagerException constructionManagerException) {
			constructionManagerException.printStackTrace();
			constructionManagerException.getCause();//jesli strona jest zainteresowana przyczyna to moze sobie ja sprawdzic
		}
	}
	
}
