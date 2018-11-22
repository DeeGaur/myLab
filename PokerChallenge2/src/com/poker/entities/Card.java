package com.poker.entities;

public class Card {
	
	private CardType type;
	private String value;
	
	public Card(CardType type, String value)
	{
		this.type=type;
		this.value=value;
	}
	
	public CardType getType() {
		return type;
	}


	public void setType(CardType type) {
		this.type = type;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public String toString()
	{
		return ""+this.value+", "+this.type;
	}

}
