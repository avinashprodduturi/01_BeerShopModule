/**
 * 
 */
package com.avi.bar.POJO;

/**
 * @author avinashprodduturi
 *
 */
public class Beer {
	int id;
	String name;
	double alcoholPercentage;
	
	public Beer() {
		super();
	}
	
	public Beer(int id, String name, double alocholPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.alcoholPercentage = alocholPercentage;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the alcoholPercentage
	 */
	public double getAlcoholPercentage() {
		return alcoholPercentage;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param alcoholPercentage the alcoholPercentage to set
	 */
	public void setAlcoholPercentage(double alcoholPercentage) {
		this.alcoholPercentage = alcoholPercentage;
	}

}
