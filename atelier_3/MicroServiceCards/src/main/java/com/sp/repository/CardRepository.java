package com.sp.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.sp.model.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {

	public Card findById(int id);
	public List<Card> findByOrderByIdAsc();
	public List<Card> findByUserid(int userid);
}