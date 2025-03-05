package pl.edu.pw.mini.po.extension.examples.mail.letter;

public class LoveLetter extends Letter {

	public LoveLetter(String text, Address address) {
		super(text, address);
	}

	@Override
	public String getAuthor() {
		return "Piotrek";
	}
	
}
