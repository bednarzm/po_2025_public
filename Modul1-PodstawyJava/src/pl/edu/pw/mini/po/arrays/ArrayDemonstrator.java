package pl.edu.pw.mini.po.arrays;

import java.util.Random;

public class ArrayDemonstrator {

	public static void main(String[] args) {
		// demonstrateSimpleArray();
		// demonstrateMultiDimensionArray();
		// demonstrateNonTrivialArrayStructures();
		// demonstrateNonTrivialArrayStructures();
		// demonstrateOther();
	}

	private static void demonstrateSimpleArray() {
		// int[10] intArray;//Tak nie robimy

		int[] myIntArray = new int[10];
		System.out.println("Length: " + myIntArray.length);

		myIntArray[0] = 5;

		myIntArray[2] = 11;

		myIntArray[5] = 22;

		System.out.println(myIntArray[0] + " " + myIntArray[1] + " " + myIntArray[2] + " " + myIntArray[5]);

		// int k = myIntArray[10];// Wyjcie poza zakres = wyjatek

		// Iteracja
		System.out.println("Iterate");
		for (int i = 0; i < myIntArray.length; i++) {
			System.out.println("Elem at index " + i + " = " + myIntArray[i]);
		}

		int[] randomedArray = new int[20];
		Random random = new Random();
		System.out.println("Init by random");
		for (int i = 0; i < randomedArray.length; i++) {
			randomedArray[i] = random.nextInt(100);
		}
		System.out.println("Iterate");
		for (int i = 0; i < randomedArray.length; i++) {
			System.out.println("Elem at index " + i + " = " + randomedArray[i]);
		}

	}

	private static void demonstrateMultiDimensionArray() {
		int[][] multi = new int[10][10];

		// Init
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi.length; j++) {
				multi[i][j] = 3;
			}
		}

		// Weak
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi.length; j++) {
				System.out.println(multi[i][j]);
			}
		}

		// Weak 
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi.length; j++) {
				System.out.print(multi[i][j] + " ");
			}
		}

		System.out.println();

		// Better 
		for (int i = 0; i < multi.length; i++) {
			System.out.println();
			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + " ");
			}
		}

	}

	private static void demonstrateNonTrivialArrayStructures() {
		int[][] multi = new int[10][];

		for (int i = 0; i < multi.length; i++) {
			if (i % 2 == 0) {
				multi[i] = new int[2 * i];
			}
		}

		// better iterate
		for (int i = 0; i < multi.length; i++) {
			System.out.print("[" + i + "]");
			if (multi[i] != null) {
				for (int j = 0; j < multi[i].length; j++) {
					System.out.print(multi[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

	private static void demonstrateOther() {
		int[][][] threeDim = new int[10][10][10];

		int[] array = new int[] { 1, 2, 3 };
		int[][] array2 = new int[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] matrix = new int[][] { { 1, 4, 5 }, { 2, 2, 8 }, { 4, 1, 0 } };

		String[] strings = new String[5];
		strings[0] = "Ja";
		strings[1] = "Ty";
		strings[2] = "On";
		strings[3] = "Ona";
		strings[4] = "Ono";

	}

}
