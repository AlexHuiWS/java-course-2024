package org.ethz.day3.Vehicle;

public class Vehicle {
    private String id;
	
	public Vehicle() {		
	}
	
	public Vehicle(String id) {
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
