package pl.edu.pw.mini.po.composite;

public class Tyre {

	private double pressure;

	public Tyre(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "Tyre [pressure=" + pressure + "]";
	}

}
