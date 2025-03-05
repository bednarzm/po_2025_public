package pl.edu.pw.mini.po.enums;

public class University {

	public static int getFacultyStudents(String faculty) {
		int result = 0;
		
		switch(faculty) {
		case "MiNI":
			result = 500;
			break;
		case "Elka":
			result = 700;
			break;
		default:
			//Co zwrocic? Wyjatek?
		}
		
		return result;
	}

	public static int getFacultyStudents(Faculty faculty) {
		int result = 0;

		System.out.println("Officially: " + faculty.getFullName() + " Inofficially: " + faculty.getInofficialName());

		switch(faculty) {
			case EL:
				result = 500;
				break;
			case FTIMS:
				result = 700;
				break;
			case MINI:
				result = 700;
				break;
		}

		return result;
	}

}
