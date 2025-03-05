package pl.edu.pw.mini.po.extension.basic;

import pl.edu.pw.mini.po.extension.basic.additional.MyFavoriteSecond;
import pl.edu.pw.mini.po.extension.basic.additional.Second;
import pl.edu.pw.mini.po.extension.basic.additional.Third;

public class Demonstrator {

	public static void main(String[] args) {
		First first = new First("Moby");
		first.saySomething();
		
		
		Second second = new Second("Ala");
		second.saySomething();
		second.myFavoriteSquare();
		second.internal();
		
		First first2 = new Second("Jola");
		first2.saySomething();
		
		First first3 = new MyFavoriteSecond("aaa");
		test(new Second("Xenon"));
		
		Third third = new Third("Ania");
		
	}

	private static void test(First first) {
		first.saySomething();
	}
	
}
