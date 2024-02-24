package com.santos.flashcardapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santos.flashcardapi.domain.Card;

@RestController
public class CardController {
	
	@GetMapping("cards")
	public List<Card> getCards() {
		Card card1 = new Card("Test", "Teste");
		Card card2 = new Card("Good", "Bom");
		Card card3 = new Card("Bla bla bla", "Teste bla bla bla");
		
		List<Card> list = new ArrayList<>();
		list.add(card1);
		list.add(card2);
		list.add(card3);
		
		return list;
	}

}
