package pl.edu.pw.mini.po.extension.examples.mail.postman;

import pl.edu.pw.mini.po.extension.examples.mail.mailbox.Mailbox;

public class NormalPostman extends GradedPostman {
	 
	public NormalPostman(Mailbox[] mailboxes) {
		super(mailboxes);
		postManType = PostManType.NORMAL_POSTMAN;;//Tak nie robimy!!!
	}
	
}
