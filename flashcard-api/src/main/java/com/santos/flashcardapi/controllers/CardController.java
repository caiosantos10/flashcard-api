package com.santos.flashcardapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santos.flashcardapi.domain.Card;
import com.santos.flashcardapi.services.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {
	@Autowired
	private CardService service;
	
	@GetMapping(value="")
	public ResponseEntity<?> findAll() {
		List<Card> obj = service.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	
}
