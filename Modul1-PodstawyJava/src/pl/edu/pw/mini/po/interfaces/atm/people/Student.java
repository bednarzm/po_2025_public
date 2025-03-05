package pl.edu.pw.mini.po.interfaces.atm.people;

import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashGet;

public class Student {

	private CashGet atm;

	public void getCash(int cash) {
		atm.withdrawCash(cash);
	}

	public Student(CashGet atm) {
		this.atm = atm;
		
	}

	public void setAtm(CashGet atm) {
		this.atm = atm;
	}
	
	
}
