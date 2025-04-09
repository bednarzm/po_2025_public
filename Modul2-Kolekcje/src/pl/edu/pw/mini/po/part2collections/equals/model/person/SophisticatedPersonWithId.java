package pl.edu.pw.mini.po.part2collections.equals.model.person;

import java.util.Objects;

public class SophisticatedPersonWithId {
	protected int id;//Artificial key added additionally - good idea
	
	protected String name;
	protected String lastName;
	protected int bloodSugarContent;
	protected int bloodOxygenContent;
	protected int waistCircumference;

	public SophisticatedPersonWithId(int id, String name, String lastName, int bloodSugarContent,
			int bloodOxygenContent, int waistCircumference) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.bloodSugarContent = bloodSugarContent;
		this.bloodOxygenContent = bloodOxygenContent;
		this.waistCircumference = waistCircumference;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SophisticatedPersonWithId other = (SophisticatedPersonWithId) obj;
		return id == other.id;
	}

}
