package pl.edu.pw.mini.po.files;

import java.io.File;
import java.io.IOException;

public class FilesDemonstrator {

	public static void main(String[] args) throws IOException {
		//demonstrateFileWithNonRelativePath();
		//demonstratePathDifferences();
		//demonstrateNamedFile();
		demonstrateFileWithGeneralRelativePath();
		//demonstrateFileWithRelativePathToFile();
	}

	private static void demonstratePathDifferences() {

		File file1 = new File("myFile1.txt");
		System.out.println("\\n1: Sciezka ustawiona przez uzytkownika: " + "myFile1.txt");
		demonstratePathDifferences(file1);

		File file2 = new File("");
		System.out.println("\n2: Sciezka ustawiona przez uzytkownika: " + "\"\"");
		demonstratePathDifferences(file2);

		File file3 = new File(".");
		System.out.println("\n3: Sciezka ustawiona przez uzytkownika: " + "\".\"");
		demonstratePathDifferences(file3);

		File file4 = new File("./../..");
		System.out.println("\n4: Sciezka ustawiona przez uzytkownika: " + "\"./../..\"");
		demonstratePathDifferences(file4);

		File file5 = new File("../../../");
		System.out.println("\n5: Sciezka ustawiona przez uzytkownika: " + "\"../../../\"");
		demonstratePathDifferences(file5);

		File file6 = new File(
				"C:/maciekfiles/teaching/PO/robo/myprivatedirectory/myFavouriteFile.txt");
		System.out.println("\n6: Sciezka ustawiona przez uzytkownika: " + "\"C:/maciekfiles/teaching/PO/robo/myprivatedirectory/myFavouriteFile.txt\"");
		demonstratePathDifferences(file6);

		File file7 = new File(
				"C:/maciekfiles/teaching/PO/robo/myprivatedirectory/myFavouriteFile.txt/../../../");
		System.out.println("\n7: Sciezka ustawiona przez uzytkownika: " + "\"C:/maciekfiles/teaching/PO/robo/myprivatedirectory/myFavouriteFile.txt/../../../\"");
		demonstratePathDifferences(file7);
		
		//TO MOZE UZYJEMY POPRAWNYCH ZNAKOW SEPARACYJNYCH?
		
		/*// To sie nie skompiluje bo \ jest znakiem specjalnym wiec musi bys zastapionym znakiem \\
		File file8 = new File(
				"C:\maciekfiles\teaching\PO\robo\myprivatedirectory\myFavouriteFile.txt\..\..\");
		System.out.println("\nSciezka ustawiona przez uzytkownika: " + "\"C:\\\\maciekfiles\\\\teaching\\\\PO\\\\robo\\\\myprivatedirectory\\\\myFavouriteFile.txt\"");
		demonstratePathDifferences(file7);
		*/
		
		File file9 = new File(
				"C:\\maciekfiles\\teaching\\PO\\robo\\myprivatedirectory\\myFavouriteFile.txt");
		System.out.println("\n8: Sciezka ustawiona przez uzytkownika: " + "\"C:\\maciekfiles\\teaching\\PO\\robo\\myprivatedirectory\\myFavouriteFile.txt\"");
		demonstratePathDifferences(file9);
		
		
		File file10 = new File(
				"C:" + File.separator + "maciekfiles" + File.separator + "teaching" + File.separator + "PO" + File.separator + "robo" 
							+ File.separator + "myprivatedirectory" + File.separator + "myFavouriteFile.txt");//Oczywiscie najlepiej jest kleic Stringi StringBufferem lub StringBuilderem 
		System.out.println("\n9: Sciezka ustawiona przez uzytkownika: " + "\"C:\" + File.separator + \"maciekfiles\" + File.separator + \"teaching\" + File.separator + \"PO\" + File.separator + \"robo\" \r\n"
				+ "							+ File.separator + \"myprivatedirectory\" + File.separator + \"myFavouriteFile.txt\"");
		demonstratePathDifferences(file10);

		
		//UWAZAMY ZEBY NIE PRZEDOBRZYC I NIE POPRZEDZAMY NASZEJ SCIEZKI SEPARATORAMI
		
		File file11 = new File("/myFile1.txt");
		System.out.println("\nSciezka ustawiona przez uzytkownika ale z dodatkowym separatorem: " + "/myFile1.txt");
		System.out.println("Path (/ jest traktowane jako root dir): " + file11.getPath());
		System.out.println("Absolute path (juz bez working dira): " + file11.getAbsolutePath());
		try {
			System.out.println("Canonical path (obliczona \"skompilowana\" siezka finalna: " + file11.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Absolute path (juz bez working dira): " + file11.exists());
		
		
		File file12 = new File("\\myFile1.txt");
		System.out.println("\nSciezka ustawiona przez uzytkownika ale z dodatkowym separatorem: " + "/myFile1.txt");
		System.out.println("Path (/ jest traktowane jako root dir): " + file12.getPath());
		System.out.println("Absolute path (juz bez working dira): " + file12.getAbsolutePath());
		try {
			System.out.println("Canonical path (obliczona \"skompilowana\" siezka finalna: " + file12.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Absolute path (juz bez working dira): " + file12.exists());
	}

	private static void demonstrateNamedFile() {
		File file = new File("myFile1.txt");
		System.out.println("Sciezka ustawiona przez uzytkownika: " + "myFile1.txt");
		demonstrateBasicFileInformation(file);
	}

	/**
	 * Sciezka bezwzgledna - powinna byc dostarczana spoza aplikacji.
	 */
	private static void demonstrateFileWithNonRelativePath() {
		File fileWithNonRelativePath = new File(
				"C:\\maciekfiles\\teaching\\PO\\robo\\myprivatedirectory\\myFavouriteFile.txt");//Sciezka charakterystyczna dla mojej lokalizacji
		demonstrateBasicFileInformation(fileWithNonRelativePath);
	}

	private static void demonstrateFileWithGeneralRelativePath() {
		File currentWorkingDirectoryfile = new File(".");
		System.out.println("Demonstrate for the current working directory: '.'");
		demonstrateBasicFileInformation(currentWorkingDirectoryfile);

		System.out.println("\n##############################################################\n");
		//File subfolderfile = new File("./files-resource"); //Uzywamy separatora systemowego jak w linijce nizej
		File subfolderfile = new File("." + File.separator + "myResource");
		System.out.println("Demonstrate for the subfolder of current working directory: './myResource'");
		demonstrateBasicFileInformation(subfolderfile);

		System.out.println("\n##############################################################\n");
		File oneLevelHigherfile = new File("..");
		System.out.println("Demonstrate for the one level higher than current working directory: '..'");
		demonstrateBasicFileInformation(oneLevelHigherfile);

	}

	public static void demonstrateFileWithRelativePathToFile() {
		//File currentWorkingDirectoryfile = new File("./myFile1.txt");//Uzywamy separatora systemowego jak w linijce nizej
		File currentWorkingDirectoryfile = new File("." + File.separator + "myNiceFile1.txt");

		System.out.println("Demonstrate for the file in the current working directory: './myNiceFile1.txt'");
		demonstrateBasicFileInformation(currentWorkingDirectoryfile);//currentWorkingDirectoryfile.getCanonicalPath()

		System.out.println("\n##############################################################\n");
		//File subfolderfile = new File("./files-resource/myFile2.txt");//Uzywamy separatora systemowego jak w linijce nizej
		File subfolderfile = new File("." + File.separator + "my-files-resources" + File.separator + "myFile5.txt");
		System.out.println("Demonstrate for the file located in a subfolder of the current working directory: './my-files-resources/myFile2.txt'");
		demonstrateBasicFileInformation(subfolderfile);

		//myFile3.txt trzeba wstawic poza katalogiem roboczym 
		System.out.println("\n##############################################################\n");
		//File oneLevelHigherfile = new File("../additional-resources/myFile3.txt");//Uzywamy separatora systemowego jak w linijce nizej
		File oneLevelHigherfile = new File(".." + File.separator + "additional-resources" + File.separator + "myFile3.txt");
		System.out.println("Demonstrate for the one level higher than the current working directory: '../additional-resources/myFile3.txt'");
		demonstrateBasicFileInformation(oneLevelHigherfile);
	}

	/**
	 * Metoda prezentuje co ciekawsze informacje ktore mozna wydobyc z instancji klasy File.
	 */
	private static void demonstrateBasicFileInformation(File file) {
		
			System.out.println("DOES IT EXIST: " + file.exists());
			demonstratePathDifferences(file);
			System.out.println("Is it a Directory: " + file.isDirectory());
			System.out.println("Is it a File: " + file.isFile());
			
			System.out.println("Listed files: ");
			if (file.listFiles() != null) {
				for (File listedFile : file.listFiles()) {
					System.out.println(listedFile.getName());
				}
			}
			
			System.out.println("Path separator: " + File.pathSeparator);
			System.out.println("File separator: " + File.separator);// Linux
			
			System.out.println("Wazne!!! Punkt odniesienia wzgledem uruchomienia: user.dir: " + System.getProperty("user.dir"));

	}

	private static void demonstratePathDifferences(File file) {
		System.out.println("Path (sciezka z korektami separatorow): " + file.getPath());
		System.out.println("Absolute path (working dir + nasza sciezka): " + file.getAbsolutePath());
		try {
			System.out.println("Canonical path (obliczona \"skompilowana\" siezka finalna: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void demonstrateBasicFileAbilities(File file) {
		
		try {
			System.out.println("Create new file: " + file.createNewFile());
			System.out.println("Path: " + file.mkdir());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
