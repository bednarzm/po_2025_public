package pl.edu.pw.mini.po.interfaces.atm.abstraction;

public interface CashGet extends BalanceGet, Actionable {
	void withdrawCash(int cashToGet);
}
