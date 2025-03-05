package pl.edu.pw.mini.po.exceptions.nature.overriding;

import pl.edu.pw.mini.po.exceptions.nature.exceptions.SecondException;

public class SophistcatedMyThrower extends MyThrower {
	protected void throwingMethod() throws SecondException/*, NonRelatedWithRootException*/ {
		//Dziedziczaca metoda moze deklarowac wyrzucanie NAJWYZEJ tego co zostalo zadeklarowane w metodzie dziedziczonej.
		//Nie moze deklarowac wyrzucania innych wyjatkow, wiec deklaracja wyrzucania NonRelatedWithRootException sie nie kompiluje.
		
		//cos sie tu jeszcze dzieje w kodzie
		throw new SecondException();
	}
}
