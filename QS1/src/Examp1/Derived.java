package Examp1;

public class Derived extends Base{
	Derived(){
		addValue();
	}
	static void addValue(){
		value+=20;
	}
}
