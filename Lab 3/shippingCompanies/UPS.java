package shippingCompanies;

public class UPS{
	
	private double rate = 0.45;
	private double noOfPounds;
	
	public UPS(double noOfPounds) {
		this.noOfPounds = noOfPounds;
	}
	
	public double calculateShippingCost(){
		return rate * noOfPounds;
	}
}
