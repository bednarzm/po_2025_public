package pl.edu.pw.mini.po.extension.examples.animals;

public abstract class Zwierze {

	public abstract void dajGlos();//Nie ma potrzeby tworzenie domyslej implementacji, bo nie istnieje generalny dziek wydawany przez zwierzeta.
	protected abstract String nazwaGatunkowa();

	@Override
	public String toString() {
		return nazwaGatunkowa();
	}

}
