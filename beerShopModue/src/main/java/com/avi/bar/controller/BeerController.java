/**
 * 
 */
package com.avi.bar.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.avi.bar.POJO.Beer;
import com.avi.bar.service.BeerService;

/**
 * @author avinashprodduturi
 *
 */

@Path("/beers")
public class BeerController {
	
	BeerService beerService = new BeerService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getBeers() {
		List beerlist = beerService.getBeers();
		return beerlist;
	}
	
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Beer getBeerbyName(@PathParam("name") String name) {
		return beerService.getBeerByName(name);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String createBeer(Beer beer) {
		return beerService.createBeer(beer);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public String updateBeer(Beer beer) {
		return beerService.updateBeer(beer);
	}

}
