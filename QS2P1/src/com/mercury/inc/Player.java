package com.mercury.inc;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
	private ArrayList<Card> cards;
	public Player()
	{
		cards = new ArrayList<Card>();
	}
	public void addCard(Card cc)
	{
		cards.add(cc);
	}
	
	public Card getCard(int x){
		return cards.get(x);
	}
	
	public void printCard()
	{
		Collections.sort(cards);
		for(int i=0;i<cards.size();i++){
			Card card1 = getCard(i);
			System.out.println(card1.getColor().toString()+card1.getValue());
		}
	}
}
