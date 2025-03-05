package pl.edu.pw.mini.po.interfaces.atm;

import java.util.Random;

import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashGet;
import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashSet;

public class ATM implements CashSet, CashGet{
	
	private int currentCashBalance;

	public ATM() {
		currentCashBalance = 1000 + new Random().nextInt(9001);
	}

	public void withdrawCash(int cashToGet) {
		if(currentCashBalance >= cashToGet) {
			currentCashBalance -= cashToGet;//currenCash = currenCash - cashToGet;
			returnCash(cashToGet);
		} else {
			denyCash(cashToGet);
		}
	}

	private void returnCash(int cashToReturn) {
		System.out.println("Cash returned " + cashToReturn);
	}
	
	private void denyCash(int cashToReturn) {
		System.out.println("Sorry " + cashToReturn + " is too much than I can give you.");
	}
	
	public void refillCash(int cash) {
		currentCashBalance += cash;
	}

	@Override
	public int getBalance() {
		return currentCashBalance;
	}

	@Override
	public String caution() {
		return "Wydawaj rozwaznie!";
	}
	
}
