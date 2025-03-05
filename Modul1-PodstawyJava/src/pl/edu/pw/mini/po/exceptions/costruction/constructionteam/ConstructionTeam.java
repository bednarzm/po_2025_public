package pl.edu.pw.mini.po.exceptions.costruction.constructionteam;

import pl.edu.pw.mini.po.exceptions.costruction.constructionteam.storage.ToolStorage;
import pl.edu.pw.mini.po.exceptions.costruction.constructionteam.welderteam.WelderTeamException;

public abstract class ConstructionTeam {

	protected ToolStorage toolStorage = new ToolStorage();

	public abstract void work() throws WelderTeamException;

}
