package shippingCalculator;

import shippingCompanies.Zones;

public class PackageDetails {
	private String description;
	private double noOfPounds;
	private Zones zone;
	
	public PackageDetails(String description, double noOfPounds, String zone) {
		super();
		this.description = description;
		this.noOfPounds = noOfPounds;
		this.zone = Zones.valueOf(zone);
	}

	public String getDescription() {
		return description;
	}

	public double getNoOfPounds() {
		return noOfPounds;
	}

	public Zones getZone() {
		return zone;
	}
	
	
	
}
