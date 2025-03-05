package pl.edu.pw.mini.po.enums;

public enum PrimeNumberProcessable {

	ONE(1), TWO(2), THREE(3), FIVE(5), SEVEN(7);

	private int value;

	private PrimeNumberProcessable(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
