package com.mercury.inc.q1;

public class Q4 {

	/**
	 * @param args
	 */
	static enum Color {RED, GREEN, YELLOW};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color color = Color.RED;
		switch(color){
		case RED:	System.out.println("A");
		case YELLOW:	System.out.println("B"); break;
		case GREEN:	System.out.println("C");
		}
	}

}
