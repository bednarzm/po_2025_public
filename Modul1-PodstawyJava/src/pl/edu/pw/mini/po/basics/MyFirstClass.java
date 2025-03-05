package pl.edu.pw.mini.po.basics;

public class MyFirstClass {

	public static void main(String... strings) {
		System.out.println("Hello world!");

		boolean myBoolean = true;

		byte myByte = 10;
		byte myByte1 = 0b00000011;
		byte myByte2 = 0x0F;

		System.out.println(" My bytes values: " + myByte + " next: " + myByte1 + " one more: " + myByte2);

		short myShort = 30_000;
		short no_snake_today;// Tak nie

		short myExtendedShort = 128;

		byte myCutByte = (byte) myExtendedShort;

		System.out.println(" cut byte: " + myCutByte);

		short myAdditionalShort = myByte;

		System.out.println("myAdditionalShort: " + myAdditionalShort);

		char myChar = 'a';
		char myChar1 = 201;

		System.out.println(" >>> " + myChar1);

		int myInt = 2000_000_000;

		long myLong = 4_000_000_000l;

		float myFloat = 5.345f;

		double myDouble = 6.999998;
		byte s1 = 10, s2 = 10;
		byte suma = (byte) (s1 + s2);

		System.out.println();

	}
}
