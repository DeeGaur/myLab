package com.poker.utilites;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.poker.entities.Card;
import com.poker.entities.CardType;
import com.poker.entities.Deck;

public class PokerUtil {

	private static volatile int totalDeck;
	private static int i=1 ;
	public PokerUtil(int totalDeck)
	{
		this.totalDeck=totalDeck;
	}

	
	public static int getTotalDeck() {
		return totalDeck;
	}


	public static void setTotalDeck(int totalDeck) {
		PokerUtil.totalDeck = totalDeck;
	}
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
	
	public Set<Deck> generateRandomDecks()
	{
		Set<Deck> decks= new HashSet<>();
		while(totalDeck!=0)
		{	
					Deck d= this.generateDeck();
					System.out.println("Deck Number "+i+" ready by"+Thread.currentThread());
					i++;
					if(totalDeck!=0)
					{
						synchronized (PokerUtil.class) 
						{
							if(totalDeck!=0)
							{
								decks.add(d);
								totalDeck--;
							}
						}
					}
					
			
		}
		return decks;
	}
}
