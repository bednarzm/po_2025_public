package pl.edu.pw.mini.po.part2collections.equals.model.figure;

import java.util.Objects;

public class Trojkat2D {
	
	protected Punkt2D srodek;
	protected int podstawa;
	protected int wysokosc;

	@Override
	public int hashCode() {
		return Objects.hash(podstawa, srodek, wysokosc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trojkat2D other = (Trojkat2D) obj;
		return podstawa == other.podstawa && Objects.equals(srodek, other.srodek) && wysokosc == other.wysokosc;
	}
	
	
	
}
