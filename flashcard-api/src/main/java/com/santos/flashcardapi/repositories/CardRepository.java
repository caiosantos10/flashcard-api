package com.santos.flashcardapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santos.flashcardapi.domain.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer>{

}
