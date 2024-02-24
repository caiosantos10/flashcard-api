package com.santos.flashcardapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.santos.flashcardapi.domain.Card;
import com.santos.flashcardapi.repositories.CardRepository;

@SpringBootApplication
public class FlashcardApiApplication implements CommandLineRunner{
	@Autowired
	private CardRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(FlashcardApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Card card1 = new Card("Teacher", "Professor(a)");
		Card card2 = new Card("People", "Pessoas");
		Card card3 = new Card("Sink", "Pia");
		Card card4 = new Card("Word", "Palavra");
		
		repo.saveAll(Arrays.asList(card1, card2, card3, card4));
		
	}

}
