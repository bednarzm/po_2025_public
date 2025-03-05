package pl.edu.pw.mini.po.exceptions.nature.overriding;

public class ExtendedMyThrower extends MyThrower {
	protected void throwingMethod() /*throws SecondException*/ {//Nie musimy wyrzucac jesli nie potrzebujemy. 
		
	}
}
