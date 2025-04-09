package pl.edu.pw.mini.po.part2collections.equals.model.figure;

import java.util.Objects;

public class InnyTrojkat2D {

	protected Punkt2D srodek;
	protected Integer podstawa;
	protected Integer wysokosc;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InnyTrojkat2D other = (InnyTrojkat2D) obj;
		return Objects.equals(podstawa, other.podstawa) && Objects.equals(srodek, other.srodek)
				&& Objects.equals(wysokosc, other.wysokosc);
	}

}
