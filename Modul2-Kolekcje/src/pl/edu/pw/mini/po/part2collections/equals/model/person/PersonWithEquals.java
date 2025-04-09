package pl.edu.pw.mini.po.part2collections.equals.model.person;

import java.util.Objects;

public class PersonWithEquals {

	protected String name;
	protected String lastName;

	public PersonWithEquals(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonWithEquals other = (PersonWithEquals) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(name, other.name);
	}

}
