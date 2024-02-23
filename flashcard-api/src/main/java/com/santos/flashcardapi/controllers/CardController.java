package com.santos.flashcardapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santos.flashcardapi.domain.Card;

@RestController
public class CardController {
	
	@GetMapping("cards")
	public Card getCards() {
		Card newCard = new Card("Test", "Teste");
		return newCard;
	}

}
