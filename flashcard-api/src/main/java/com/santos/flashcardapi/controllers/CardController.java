package com.santos.flashcardapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
	
	@GetMapping("hello")
	public String getCards() {
		return "Hello";
	}

}
