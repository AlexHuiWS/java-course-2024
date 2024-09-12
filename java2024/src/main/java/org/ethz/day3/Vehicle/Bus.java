package org.ethz.day3.Vehicle;

public final class Bus extends Vehicle {
    private int standingCapacity;
	private int sittingCapacity;
    private double length;
    private String company;

    public Bus(String id, int standingCapacity, int sittingCapacity, double length, String company) {
		super(id);
		this.standingCapacity = standingCapacity;
		this.sittingCapacity = sittingCapacity;
		this.length = length;
		this.company = company;
	}

	public int getStandingCapacity() {
		return standingCapacity;
	}

	public int getSittingCapacity() {
		return sittingCapacity;
	}

	public double getLength() {
		return length;
	}

	public String getCompany() {
		return company;
	}
}
