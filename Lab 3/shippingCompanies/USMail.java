package shippingCompanies;

public class USMail{

	private double noOfPounds;
	private double price = 0.0;
	
	public USMail(double noOfPounds) {
		this.noOfPounds = noOfPounds;
	}
	
	public double calculateShippingCost(){
		if(noOfPounds < 3){
			price = noOfPounds;
		}
		else{
			price = 0.55 * noOfPounds;
		}
		return price;
	}
}
