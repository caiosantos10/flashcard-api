package com.santos.flashcardapi.domain;

public class Card {
	private String front;
	private String verse;
	
	public Card () {
		
	}
	
	public Card(String front, String verse) {
		super();
		this.front = front;
		this.verse = verse;
	}

	public String getFront() {
		return front;
	}
	public void setFront(String front) {
		this.front = front;
	}
	public String getVerse() {
		return verse;
	}
	public void setVerse(String verse) {
		this.verse = verse;
	}

	@Override
	public String toString() {
		return "Card [front=" + front + ", verse=" + verse + "]";
	}
	
	
}
