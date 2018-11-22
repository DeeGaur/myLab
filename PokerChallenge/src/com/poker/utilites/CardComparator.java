package com.poker.utilites;

import java.util.Comparator;

import com.poker.entities.Card;
import com.poker.entities.Deck;

public class CardComparator implements Comparator<Card>{

	@Override
	public int compare(Card o1, Card o2) {
		if(o1.getType().compareTo(o2.getType())==0)
		{
			return o1.getValue().compareTo(o2.getValue());
		}
		else{
			return o1.getType().compareTo(o2.getType());
		}
	}


}
