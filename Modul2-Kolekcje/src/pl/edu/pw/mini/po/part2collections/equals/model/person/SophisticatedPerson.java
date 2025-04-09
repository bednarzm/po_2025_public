package pl.edu.pw.mini.po.part2collections.equals.model.person;

import java.util.Objects;

public class SophisticatedPerson {

	protected String name;
	protected String lastName;
	protected int bloodSugarContent;
	protected int bloodOxygenContent;
	protected int waistCircumference;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SophisticatedPerson other = (SophisticatedPerson) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}
	
}
