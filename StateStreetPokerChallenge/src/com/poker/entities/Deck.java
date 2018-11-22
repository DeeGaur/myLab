package com.poker.entities;

import java.util.HashSet;
import java.util.Set;

public class Deck {

	private Set<Card> cardSet= new HashSet<>();
	
	public Set<Card> getCardSet() {
		return cardSet;
	}

	public void setCardSet(Set<Card> cardSet) {
		this.cardSet = cardSet;
	}

	public String toString()
	{
		String deckString="[";
		for(Card card : this.getCardSet())
		{
			deckString=deckString+"{"+card.toString()+"}";
		}
		return deckString+"]";
	}
	
}
