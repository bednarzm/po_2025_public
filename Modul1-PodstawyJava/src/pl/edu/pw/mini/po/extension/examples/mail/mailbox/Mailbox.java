package pl.edu.pw.mini.po.extension.examples.mail.mailbox;

import pl.edu.pw.mini.po.extension.examples.mail.letter.Letter;

public abstract class Mailbox {
	
	public void putMail(Letter letter) {
		letter.readMe();
	}
	
}
