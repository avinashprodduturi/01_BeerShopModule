/**
 * 
 */
package com.avi.bar.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.avi.bar.POJO.Beer;

/**
 * @author avinashprodduturi
 *
 */
public class BeerService {
	static HashMap<Integer,Beer> beerIdMap = getBeerIdMap(); 

	public BeerService() {
		super();
		if(beerIdMap==null) {
			beerIdMap = new HashMap<Integer, Beer>();
			
			Beer budLight = new Beer(101,"Bud Light", 4.2);
			Beer guinness = new Beer(201, "Guinness", 4.27);
			Beer budweiser = new Beer(301, "Budweiser", 5);
			Beer peroni = new Beer(401, "Peroni", 5.1);
			Beer corona = new Beer(501,"corona",4.8);
			
			beerIdMap.put(1, budLight);
			beerIdMap.put(2, guinness);
			beerIdMap.put(3, budweiser);
			beerIdMap.put(4, peroni);
			beerIdMap.put(5, corona);
			
		}
	}
	
	public List getBeers() {
		List beerList = new ArrayList(beerIdMap.values());
		return beerList;
	}
	
	public Beer getBeerByName(String beerName) {
		Beer beer = new Beer();
		for(int i=1; i<=beerIdMap.size();i++) {
			beer = beerIdMap.get(i);
			if (beerName.equalsIgnoreCase(beer.getName())) {
				return beer;
			}
		}
		return beer;
	}
	
	public String createBeer(Beer beer) {
		beerIdMap.put(beerIdMap.size()+1, beer);
		return "Sucessfully added Beer: "+beer.getName();
	}

	
	public String updateBeer(Beer beer) {
		String message = "No Beer to Update!!";
		for(int i = 1; i<= beerIdMap.size(); i++) {
			if(beer.getId() == beerIdMap.get(i).getId()) {
				beerIdMap.put(i, beer);
				message = "Updated Beer Sucessfully";
			}
		}
		return message;
	}
	/**
	 * @return the beerIdMap
	 */
	public static HashMap<Integer, Beer> getBeerIdMap() {
		return beerIdMap;
	}
}