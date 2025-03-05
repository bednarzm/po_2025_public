package pl.edu.pw.mini.po.extension.examples.mail.postman;

import pl.edu.pw.mini.po.extension.examples.mail.mailbox.Mailbox;

public class ErrandBoy extends Postman {

	public ErrandBoy(Mailbox[] mailboxes) {
		super(mailboxes);
		postManType = PostManType.ERRAN_BOY;;//Tak nie robimy!!!
	}
	
}
