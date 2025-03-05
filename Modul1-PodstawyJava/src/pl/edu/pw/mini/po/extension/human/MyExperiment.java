package pl.edu.pw.mini.po.extension.human;

public class MyExperiment {

	public static void main(String[] args) {
		String imie = "pIotRek";
		String firstLetter = String.valueOf(imie.charAt(0)).toUpperCase();
		String restOfStringWithoutFirst = imie.substring(1).toLowerCase();
		String result = firstLetter + restOfStringWithoutFirst;
		System.out.println(" >>> " + result);
	}

}
