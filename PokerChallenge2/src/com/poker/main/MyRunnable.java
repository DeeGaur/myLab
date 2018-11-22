package com.poker.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.poker.entities.Deck;
import com.poker.utilites.PokerUtil;

public class MyRunnable implements Runnable{

	private PokerUtil util;
	public MyRunnable(PokerUtil util)
	{
		this.util=util;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Set<Deck> deckSet = util.generateRandomDecks();
		List<Deck> decks= new ArrayList<>(deckSet);
		for(int i=0;i<decks.size();i++)
		{
			System.out.println("Deck Number"+i+"="+decks.get(i).toString());
		}
		
	}

}
