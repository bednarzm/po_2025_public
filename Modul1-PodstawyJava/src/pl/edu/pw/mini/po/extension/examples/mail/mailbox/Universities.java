package pl.edu.pw.mini.po.extension.examples.mail.mailbox;

public enum Universities {
	
	UW("Uniwersytet "), UJ(""), PW("aaaaaaaa dds"), AGH("dsdsd");
	
	private Universities(String value) {
		this.value = value;
	}

	private String value;

	public String getValue() {
		return value;
	}
	
	
}
