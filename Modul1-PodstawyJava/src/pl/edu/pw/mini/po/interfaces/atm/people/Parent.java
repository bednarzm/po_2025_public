package pl.edu.pw.mini.po.interfaces.atm.people;

import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashSet;

public class Parent {

	private CashSet atm;
	
	public void refillCash(int cash) {
		atm.refillCash(cash);
	}
	
	public Parent(CashSet atm) {
		this.atm = atm;
	}

	public void setAtm(CashSet atm) {
		this.atm = atm;
	}
	
	
}
