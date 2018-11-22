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
		
		
		PokerUtil util = new PokerUtil(10);
		MyRunnable r=new MyRunnable(util);
		Thread t1=new Thread(r, "t1");
		Thread t2=new Thread(r, "t2");
		Thread t3=new Thread(r, "t3");
		t3.start();
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}catch(Exception ex)
		{
			System.out.println("Exception occured."+ex);
		}
		
		double finishTime= System.nanoTime();
		System.out.println("start="+startTime);
		System.out.println("finish="+finishTime);
		double timeElapsed=(finishTime-startTime)/1000000000;
		System.out.println("Time taken for the processin seconds="+timeElapsed);
		
	}

}
