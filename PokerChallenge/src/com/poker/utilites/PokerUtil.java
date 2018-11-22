package com.poker.utilites;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.poker.entities.Card;
import com.poker.entities.CardType;
import com.poker.entities.Deck;

public class PokerUtil {

	public Deck generateDeck()
	{
		Set<Card> set= new HashSet<>();
		for(CardType type:CardType.values())
		{
			for(int i=1;i<=13;i++)
			{
				set.add(new Card(type,String.valueOf(i)));
			}
		}
		Deck deck= new Deck();
		deck.setCardSet(set);
		return deck;
	}
	
	public Set<Deck> generateRandomDecks(int n)
	{
		Set<Deck> decks= new HashSet<>();
		for(int i=1;i<=n;i++)
		{
			decks.add(this.generateDeck());
			System.out.println("Deck Number "+i+" ready");
		}
		return decks;
	}
}
