package com.mercury.inc;

public class Card implements Comparable<Card>{
	public static enum Color {SPADE, HEART, DIAMOND, CLUB};
	private int value;
	private Color color;
	
	public Card(int m, Color color1)
	{
		this.value=m;
		this.color=color1; 
	}
	public int getValue(){
		return this.value;
	}
	
	public Color getColor(){
		return this.color;
	}
	@Override
	public int compareTo(Card c) {
		// TODO Auto-generated method stub
		if(this.color.compareTo(c.getColor())>0){
			return 1;
		}else if(this.color.compareTo(c.getColor())==0){
			if(this.value>c.getValue()){
				return 1;
			}else if(this.value==c.getValue()){
				return 0;
			}else{
				return -1;
			}
		}else{
			return -1;
		}
		
	}
	
}
