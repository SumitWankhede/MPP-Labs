package shippingCompanies;

public class DHL{
	private double noOfPounds;
	
	public DHL(double noOfPounds) {
		this.noOfPounds = noOfPounds;
	}
	
	public double calculateShippingCost(){
		return 0;
	}

	public double getNoOfPounds() {
		return noOfPounds;
	}
}
