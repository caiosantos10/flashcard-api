package com.santos.flashcardapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santos.flashcardapi.domain.Card;
import com.santos.flashcardapi.repositories.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository repo;
	
	public List<Card> findAll(){
		List<Card> obj = repo.findAll();
		return obj;
	}
}
