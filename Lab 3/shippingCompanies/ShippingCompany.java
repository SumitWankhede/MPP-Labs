package shippingCompanies;

public class ShippingCompany {
	private String carrierName;
	protected double noOfPounds;
	private Zones zone;
	
	public ShippingCompany(CompanyList carrier, double noOfPounds, Zones zones) {
		super();
		this.carrierName = carrier.toString();
		this.noOfPounds = noOfPounds;
		this.zone = zones;
	}
	
	public double getNoOfPounds() {
		return noOfPounds;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public double calculateShippingCost(){
		switch(carrierName){
		
		case "UPS" :
			UPS ups = new UPS(noOfPounds);
			return ups.calculateShippingCost();
			
		case "USMail" :
			USMail usmail  = new USMail(noOfPounds);
			return usmail.calculateShippingCost();
			
		case "FedEx" :
			FedEx fedEx  = new FedEx(noOfPounds,zone);
			return fedEx.calculateShippingCost();
			
		}
		return 0;
	}
}
