package com.poker.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.poker.entities.Card;
import com.poker.entities.Deck;
import com.poker.utilites.CardComparator;
import com.poker.utilites.PokerUtil;

public class PokerMain {
	
	public static void main(String[] args)
	{
		//generate 2 decks
		double startTime= System.nanoTime();
		Set<Deck> deckSet = new PokerUtil().generateRandomDecks(1000000);
		List<Deck> decks= new ArrayList<>(deckSet);
//		for(int i=0;i<decks.size();i++)
//		{
//			System.out.println("Deck Number"+i+"="+decks.get(i).toString());
//		}
		double finishTime= System.nanoTime();
		System.out.println("start="+startTime);
		System.out.println("finish="+finishTime);
		double timeElapsed=(finishTime-startTime)/1000000000;
		System.out.println("Time taken for the processin seconds="+timeElapsed);
		
	}

}
