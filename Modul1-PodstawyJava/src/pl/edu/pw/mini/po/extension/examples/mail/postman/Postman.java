package pl.edu.pw.mini.po.extension.examples.mail.postman;

import pl.edu.pw.mini.po.extension.examples.mail.letter.Letter;
import pl.edu.pw.mini.po.extension.examples.mail.mailbox.Mailbox;

public abstract class Postman {
	
	private static final int MAILBOX_SIZE = 10;
	private static final int LETTERS_SIZE = 10;
	
	protected Mailbox[] mailboxes = new Mailbox[MAILBOX_SIZE];
	protected Letter [] letters = new Letter[LETTERS_SIZE];
	protected PostManType postManType;//Tak nie robimy!!!
	private int currentIndex; 
	
	public Postman(Mailbox[] mailboxes) {
		super();
		this.mailboxes = mailboxes;
	}
	
	public boolean addLetter(Letter letter) {
		boolean result = false;
		
		if(currentIndex < 10) {
			letters[currentIndex++] = letter;
			result = true;
		}
		
		return result;
	}
	
	public void deliver() {
		
		for(int i=0;i<currentIndex;i++) {
			if(letters[i] != null) {
				mailboxes[letters[i].getAddress().getIndex()].putMail(letters[i]);
			}
		}
//		
	}
	
}
