package pl.edu.pw.mini.po.interfaces.atm;

import java.util.Random;

import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashGet;
import pl.edu.pw.mini.po.interfaces.atm.abstraction.CashSet;
import pl.edu.pw.mini.po.interfaces.atm.people.Parent;
import pl.edu.pw.mini.po.interfaces.atm.people.Student;

public class ATMDemonstrator {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		CashGet cashGetable = atm;
		CashSet cashSetable = atm;

		Student student = new Student(cashGetable);
		Parent parent = new Parent(cashSetable);
		
		ATM2 atm2  = new ATM2();
		student.setAtm(atm2);
		parent.setAtm(atm2);
		
		for (int i = 0; i < 1000; i++) {
			student.getCash(500 + new Random().nextInt(500));
			parent.refillCash(400 + new Random().nextInt(500));
		}

	}

}
