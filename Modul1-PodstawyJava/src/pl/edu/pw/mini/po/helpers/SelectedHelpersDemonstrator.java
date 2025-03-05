package pl.edu.pw.mini.po.helpers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class SelectedHelpersDemonstrator {

	public static void main(String[] args) {
		//demonstrateString();
		//demonstrateSystem();
		//demonstrateRandom();
		//demonstrateMath();
		//demonstrateBigDecimal();
		//demonstrateTypeWrappers();
		//demonstrateAutoboxingMechanism();
	}

	private static void demonstrateString() {
		String literalString1 = "GOSIA";
		String literalString2 = "GOSIA";
		
		System.out.println(" Comaring of two strings: " + (literalString1.equals(literalString2)));
		System.out.println(" WRONG!!! comparing of two strings: " + (literalString1 == literalString2));//Tak nie porownujemy choc w tym szczegolnym przypadku sie udalo
		
		System.out.println();
		
		String nonLiteralString1 = new String("GOSIA");
		String nonLiteralString2 = new String("GOSIA");
		
		System.out.println(" Comaring of two strings: " + (nonLiteralString1.equals(nonLiteralString2)));
		System.out.println(" WRONG!!! comparing of two strings: " + (nonLiteralString1 == nonLiteralString2));//Tak nie porownujemy
		
		String s1 = new String("firstPart");
		String s2 = new String("secondPart");
		
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		
		System.out.println("Concatenation: first concatenated: " + s3 + " second concatenated: " + s4);
		
		//Uwaga! Rodzaj szczegolnej promocji do stringow
		//We wanna to print the result 5 + 8
		System.out.println();
		System.out.println(5);
		System.out.println("Concatenation of result " + 5 + 8);//Zle
		System.out.println("Concatenation of result " + (5 + 8));//Dobrze
		System.out.println(5+8);
		
		//Przejrzec inne metody split, concat, indexof, contains, etc....
		
		
		System.out.println();
	}

	private static void demonstrateSystem() {
		System.out.println("Tak");
		
		long time = System.currentTimeMillis();
		System.out.println("Time: " + time);
		
		long nanoTime = System.nanoTime();
		System.out.println("Nano time: " + nanoTime);
		
	}

	private static void demonstrateRandom() {
		System.out.println("\nRandom");
		Random random = new Random();
		System.out.println("Random: " + random.nextInt());
		int int10 = random.nextInt(10);
		System.out.println("Random: " + random.nextInt(10));
		System.out.println("Random: " + random.nextInt()%6);
		
		for(int i=0;i<20;i++) {
			System.out.print(" " + random.nextInt(15) + " ");
		}
		
		System.out.println();
		
		for(int i=0;i<10;i++) {
			int randomized = random.nextInt(10);
			if(randomized < 3) {//Hello -> 0.3, On -> 0.4 Ona -> 0.3
				//0.3
				System.out.print(" Hello ");
			} else {
				if(randomized < 7) {
					System.out.print(" On ");
				} else {
					System.out.print(" Ona ");
				}
			}
			
		}
		System.out.println();
		for(int i=0;i<10;i++) {
			int randomized = random.nextInt(10);
			if(randomized < 3) {
				//0.4
				System.out.print(" Hello ");
			} else {
				if(random.nextBoolean()) {
					System.out.print(" On ");
				} else {
					System.out.print(" Ona ");
				}
			}
			
		}
		
		random.nextExponential();
		random.nextGaussian();
		//etc
		
		//Przejrzec inne metody
		
		System.out.println("\nRandom end\n");
	}

	private static void demonstrateMath() {
		//Mnostwo statcnych metod realizujacych funkcje matematyczne
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sin(Math.PI/2.0));
		//Przejrzec inne metody
		
	}

	private static void demonstrateBigDecimal() {
		
		//long myLong1 = 10000000000;//Nie skompuluje sie bo za duza wartosc
		
		BigDecimal bigDecimal1 = new BigDecimal("10000000000");
		BigDecimal bigDecimal2 = new BigDecimal("10000000000");
	
		System.out.println(bigDecimal1.add(bigDecimal2));
		System.out.println(bigDecimal1.multiply(bigDecimal2));
		
		//Zaokraglanie
		BigDecimal bigDecimal = new BigDecimal(5/9.0);
		System.out.println("Scaled: " + bigDecimal.setScale(4, RoundingMode.HALF_DOWN).toString());
		
		//Wazne!!!
		System.out.println(" 5/9 " + 5/9 + " 11/9 " + 11/9);
		System.out.println(" 5/9 " + 5/9.0 + " 11/9 " + 11/9.0);
		System.out.println(" 5/9 " + 5/9.0d + " 11/9 " + 11/9d);
		int factor = 9;
		System.out.println(" 5/9 " + 5/(factor * 1.0) + " 11/9 " + 11/(factor * 1.0));
		
		//Przejrzec inne metody
		
	}

	private static void demonstrateTypeWrappers() {
		int i;
		Integer myInteger;
		
		double d;
		Double myDouble;
		
		String valueAsString = "123";
		myInteger = Integer.valueOf(valueAsString);
		
		System.out.println("MyInteger: " + myInteger);
		
		String doubleValueAsString = "123.67";
		
		//Integer.valueOf(doubleValueAsString);//Poleci wyjatek
		
		myDouble = Double.valueOf(doubleValueAsString);
		System.out.println("MyDouble: " + myDouble);
		
		String doubleValueAsStringWithDifferentSeparator = "123.67";
		
		myDouble = Double.valueOf(doubleValueAsStringWithDifferentSeparator);//Poleci wyjatek
		
		
		//Mozna konwertowac w druga strone
		String stringVaue = myInteger.toString();
		
		int intValue = myInteger.intValue();
		
		System.out.println("Values: " + stringVaue + " " + intValue);
		
		//Kazdy prymityw ma swoj obiekt opakowujacy
		Boolean bool;
		Float myFloat;
		Short myShort;
		
		//Przejrzec inne metody
		
	}

	private static void demonstrateAutoboxingMechanism() {
		Integer integer;
		int primitiveInteger = 10;
		
		integer = primitiveInteger;
	
		System.out.println("Integer wrapper from int: " + integer);
		
		Integer nextInteger = Integer.valueOf(17);
		int nextPrimitiveInt = nextInteger;
		
		System.out.println("Primitive int from Integer object: " + nextPrimitiveInt);
		
		int deprecated = new Integer(100);//
		
	}

}