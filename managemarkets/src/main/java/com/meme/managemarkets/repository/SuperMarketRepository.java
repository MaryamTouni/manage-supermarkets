package com.meme.managemarkets.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meme.managemarkets.model.SuperMarket;

@Repository
public interface SuperMarketRepository extends CrudRepository<SuperMarket, Integer> {
}
