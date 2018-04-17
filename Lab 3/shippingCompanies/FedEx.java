package shippingCompanies;

public class FedEx{
	
	private Zones zone;
	private double cost = 0;
	private double noOfPounds;
	
	public FedEx(double noOfPounds, Zones zone) {
		this.noOfPounds = noOfPounds;
		this.zone = zone;
	}
	
	public double calculateShippingCost(){
		switch(zone){
			case IA:
			case MT:
			case OR:
			case CA: 
				cost = 0.35 * noOfPounds;
				break;
			case TX:
			case UT:
				cost = 0.30 * noOfPounds;
				break;
			case FL:
			case MA:
			case OH:
				cost = 0.55 * noOfPounds;
				break;
			default:
				cost = 0.43 * noOfPounds;
		}
		
		return cost;
	}
}
