package Examp1;

public class Base {
	public static int value=0;
	Base(){
		addValue();
	}
	static void addValue(){
		value+=10;
	}
	int getValue(){
		return value;
	}
}
