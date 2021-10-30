package com.meme.managemarkets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meme.managemarkets.model.SuperMarket;
import com.meme.managemarkets.service.SuperMarketService;

@RestController
public class SuparMarketController {

	@Autowired
	private SuperMarketService superMarketService;
	@GetMapping(path="/test")
	public String test(){
		return "It's working :D";
	}
	
	//creating a get mapping that retrieves all the supermarkets detail from the database   
	@GetMapping("/superMarket")  
	private List<SuperMarket> getAllSuperMarkets()   
	{  
	return superMarketService.allSupermarkets();
	}  
	
	//creating a post mapping that create a new supermarkets
	@PostMapping("/supermarket")
	public void addSupermarket(@RequestBody SuperMarket superMarket){
		superMarketService.addSuperMarket(superMarket);
	}
	//Edit supermarket
	@PutMapping("/supermarket/{id}")
	public void updateSupermarket(@RequestBody SuperMarket superMarket , @PathVariable Integer id){
		superMarketService.updateSuperMarket(superMarket, id);
	}
	
	//Delete supermarket
	@DeleteMapping("/supermarket/{id}")
	public void deleteSupermarket(@PathVariable Integer id){
		superMarketService.deleteSuperMarket(id);
	}
	//activate and deactivate supermarket
	@PutMapping("/supermarket/changestatus/{id}")
	public void activateAndDeactivateSupermarket(@PathVariable Integer id){
		superMarketService.activateAndDeactivateSuperMarket(id);
	}
	
}
