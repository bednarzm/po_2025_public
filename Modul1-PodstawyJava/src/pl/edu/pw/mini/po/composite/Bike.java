package pl.edu.pw.mini.po.composite;

public class Bike {

	private String ownerName;
	private Wheel frontWheel = new Wheel();
	private Wheel rearWheel = new Wheel();
	private Rack rack;
	private Seat seat = new Seat();
	private Ring ring;

	public Bike(String ownerName) {
		this.ownerName = ownerName;
		this.ring = new Ring(this);
	}

	public String getOwnerName() {
		return ownerName;
	}

	@Override
	public String toString() {
		return "Bike [frontWheel=" + frontWheel + ", rearWheel=" + rearWheel + ", rack=" + rack + ", seat=" + seat
				+ ", ring=" + ring + "]";
	}
	
}
