package pl.edu.pw.mini.po.extension.basic;

import java.util.Random;

public class First {
	
	protected String name;
	
	public First(String name) {
		this.name = name + (new Random()).nextInt(5);
	}
	
	public double myFavoriteSquare() {
		return Math.sqrt(9);
	}
	
	protected void saySomething() {
		System.out.println("First");
	}
	
}
