package com.meme.managemarkets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meme.managemarkets.model.SuperMarket;
import com.meme.managemarkets.repository.SuperMarketRepository;

@Service
public class SuperMarketService {

	@Autowired
	private SuperMarketRepository superMarketRepository;

	// Retrieve all supermarkets from DB...
	public List<SuperMarket> allSupermarkets() {
		return (List<SuperMarket>) superMarketRepository.findAll();
	}

	//Add new supermarket...
	public void addSuperMarket(SuperMarket superMarket) {
		superMarketRepository.save(superMarket);
	}

	//Update supermarket....
	public void updateSuperMarket(SuperMarket superMarket, Integer id) {
		SuperMarket s = superMarketRepository.findOne(id);
		s.setArabicName(superMarket.getArabicName());
		s.setEnglishName(superMarket.getEnglishName());
		s.setAddress(superMarket.getAddress());
		s.setStatus(superMarket.isStatus());
		s.setPhoto(superMarket.getPhoto());
		superMarketRepository.save(s);
	}

	//Delete supermarket...
	public void deleteSuperMarket(Integer id) {
		superMarketRepository.delete(id);
	}

	//Activate and deactivate supermarket...
	public void activateAndDeactivateSuperMarket(Integer id) {
		SuperMarket s = superMarketRepository.findOne(id);
		if(s.isStatus()==Boolean.TRUE){
			s.setStatus(Boolean.FALSE);
		}else{
			s.setStatus(Boolean.TRUE);
		}
		superMarketRepository.save(s);
	}
}
