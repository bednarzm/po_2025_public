package pl.edu.pw.mini.po.exceptions.costruction.constructionteam;

import java.util.Random;

public class Welder {
	
	public void weld() throws SpawarkaZepsutaException {
		if((new Random(1000)).nextInt() == 0) {
			throw new SpawarkaZepsutaException("Transformator poszedl...");
		} else {
			System.out.println("Bzzzzzz......");
		}
	}
	
}
