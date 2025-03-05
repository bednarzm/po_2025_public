package pl.edu.pw.mini.po.interfaces.atm;

import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashGet;
import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashSet;

public class ATM2 implements CashGet, CashSet{

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String caution() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refillCash(int cash) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawCash(int cashToGet) {
		// TODO Auto-generated method stub
		
	}

}
