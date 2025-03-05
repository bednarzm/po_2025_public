package pl.edu.pw.mini.po.exceptions.costruction.constructionteam.welderteam;

import pl.edu.pw.mini.po.exceptions.costruction.constructionteam.ConstructionTeam;
import pl.edu.pw.mini.po.exceptions.costruction.constructionteam.Welder;

public class WelderTeam extends ConstructionTeam {

	@Override
	public void work() throws WelderTeamException {
		Welder welder = toolStorage.retrieveWelder();
		if(welder != null) {
			welder.weld();
		} else {
			throw new UkradliSpawarkeException("Nie ma wiec ukradli!");
		}

	}

}
