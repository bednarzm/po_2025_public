package pl.edu.pw.mini.po.exceptions.costruction;

public class ConstructionCompany {
	
	private ConstructionManager constructionManager = new ConstructionManager();
	
	public void runProject() throws ConstructionManagerException{
		constructionManager.runConstruction();
	}
	
}
