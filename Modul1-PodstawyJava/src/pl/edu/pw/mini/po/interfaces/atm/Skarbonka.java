package pl.edu.pw.mini.po.interfaces.atm;

import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashGet;
import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashSet;

public class Skarbonka implements CashSet, CashGet{

	@Override
	public int getBalance() {
		return 0;
	}

	@Override
	public String caution() {
		return null;
	}

	@Override
	public void withdrawCash(int cashToGet) {
		
	}

	@Override
	public void refillCash(int cash) {
		
	}
	
}
