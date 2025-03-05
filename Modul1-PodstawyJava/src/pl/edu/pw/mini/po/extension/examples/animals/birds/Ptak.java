package pl.edu.pw.mini.po.extension.examples.animals.birds;

import java.util.Random;

import pl.edu.pw.mini.po.extension.examples.animals.Zwierze;

public abstract class Ptak extends Zwierze {
	protected Random random = new Random();//Mozna rozwazyc prywatne pole z getterem o zasiegu protected, co jest nawet lepsze
}
