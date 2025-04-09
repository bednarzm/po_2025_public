package pl.edu.pw.mini.po.part2collections.equals.model.figure;

public class Punkt2D {

	protected int x, y;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punkt2D other = (Punkt2D) obj;
		return x == other.x && y == other.y;
	}

}
