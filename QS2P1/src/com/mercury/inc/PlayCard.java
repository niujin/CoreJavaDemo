package com.mercury.inc;

import java.util.ArrayList;
import java.util.Collections;

public class PlayCard {

	/**
	 * @param args
	 */
	static ArrayList<Card> cards = new ArrayList<Card>();
	//static ArrayList<Player> players = new ArrayList<Player>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=0;i<4;i++){
			for(j=1;j<14;j++){
				switch(i){
				case 0:	cards.add(new Card(j,Card.Color.valueOf("SPADE"))); continue;
				case 1:	cards.add(new Card(j,Card.Color.valueOf("HEART"))); continue;
				case 2:	cards.add(new Card(j,Card.Color.valueOf("DIAMOND"))); continue;
				case 3:	cards.add(new Card(j,Card.Color.valueOf("CLUB"))); 
				}
			}			
		}
		Collections.shuffle(cards);
		Player A = new Player();
		Player B = new Player();
		Player C = new Player();
		Player D = new Player();
		for(j=0;j<13;j++){
			A.addCard(cards.get(j));
		}
		for(j=13;j<26;j++){
			B.addCard(cards.get(j));
		}
		for(j=26;j<39;j++){
			C.addCard(cards.get(j));
		}
		for(j=39;j<52;j++){
			D.addCard(cards.get(j));
		}
//		for(Card c:cards){
//			System.out.println(c.getColor().toString()+c.getValue());
//		}
		A.printCard();
		B.printCard();
		C.printCard();
		D.printCard();
		
	}

}
