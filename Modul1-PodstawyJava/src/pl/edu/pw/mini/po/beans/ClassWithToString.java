package pl.edu.pw.mini.po.beans;

public class ClassWithToString {

	private String name;
	private String lastName;
	private String nick;
	private int age;

	public ClassWithToString(String name, String lastName, String nick, int age) {
		this.name = name;
		this.lastName = lastName;
		this.nick = nick;
		this.age = age;
	}
	
	//If needed
	public String getName() {
		return name;
	}

	//If needed
	public String getLastName() {
		return lastName;
	}

	//If needed
	public String getNick() {
		return nick;
	}

	//If needed
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Osoba o imieniu: " + name + " i nazwisku: " + lastName + " oraz nicku: " + nick + " ktora ma " + age + " lat to ja.";
	}

}
