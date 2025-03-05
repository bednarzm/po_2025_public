package pl.edu.pw.mini.po.constructors;

public class SelfInitiatingClass {

	private static int counter = 10;
	private static int anyOtherCommonValue;
	
	private int age = 16;
	private String name = new String("Ann");
	private double bloodOxygeneContent;
	private boolean healthy;
	
	static {
		anyOtherCommonValue = 15;
	}
	
	{
		bloodOxygeneContent = 95.5;
	}
	
	public SelfInitiatingClass() {
		healthy = true;
	}

}
