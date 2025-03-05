package pl.edu.pw.mini.po.extension.examples.mail.postman;

import pl.edu.pw.mini.po.extension.examples.mail.mailbox.Mailbox;

public abstract class GradedPostman extends Postman {
	
	protected int grade;

	public GradedPostman(Mailbox[] mailboxes) {
		super(mailboxes);
	}
	
}
