package pl.edu.pw.mini.po.exceptions.nature.overriding;

import pl.edu.pw.mini.po.exceptions.nature.exceptions.FirstException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.RootException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SecondException;
import pl.edu.pw.mini.po.exceptions.nature.exceptions.SophisticatedSecondException;

public class MyThrower {

	protected void throwingMethod() throws SecondException {
		
	}

	protected void throwingSuperClassOnly() throws RootException {
		
	}
	protected void throwingSubclassesOnly() throws FirstException,SecurityException, SophisticatedSecondException {
		
	}
	protected void throwingAllOnly() throws FirstException,SecurityException, SophisticatedSecondException, RootException {
		
	}
}
