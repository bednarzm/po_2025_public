package pl.edu.pw.mini.po.exceptions.nature.throwing;

import java.util.Random;

import pl.edu.pw.mini.po.exceptions.nature.exceptions.FirstException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.NonRelatedWithRootException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.RootException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SecondException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SophisticatedSecondException;

public class ExceptionThrower {

	public void throwingMethod() throws RootException /*RootException i wszystkie podklasy*/, NonRelatedWithRootException {//Mozna wyrzucac rowniez i podklasy
		//Jakis kod tu jest

		//Tak sie zlozylo ze z jakiegos powodu trzeba wyrzucic wyjatek
		switch (new Random().nextInt(5)) {
			case 0:
					throw new FirstException();
				//break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy nie bedzie wykonany
			case 1:
				throw new SecondException();
				//break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy nie bedzie wykonany
			case 2:
				throw new SophisticatedSecondException();
				//break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy nie bedzie wykonany
			case 3:
				throw new RootException();
				//break;//Tu sie nie skompiluje bo kod ponizej miejsca wyrzucenia wyjatku nigdy nie bedzie wykonany
			case 4:
				System.out.println("Oh Yeah! Wyjatek nie polecial! Metoda normalnie konstynuje prace!");
		}
	}
}
