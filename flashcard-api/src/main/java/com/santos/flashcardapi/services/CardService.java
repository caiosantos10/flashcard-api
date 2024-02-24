package com.santos.flashcardapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santos.flashcardapi.domain.Card;
import com.santos.flashcardapi.repositories.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository repo;
	
	public Card findById(Integer id){
		Optional<Card> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
