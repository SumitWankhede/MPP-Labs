package shippingCalculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import shippingCompanies.CompanyList;
import shippingCompanies.ShippingCompany;

public class Calculator {
		
	public static void main(String args[]) throws IOException{
		ArrayList<PackageDetails> packages = new ArrayList<PackageDetails>();
		String description;
		double weight;
		String zone;
		PackageDetails pack;
		
		System.out.println("Welcome to shipping calculator:");
		
		for(int i = 0; i < 3; i++){
			
			System.out.println("Enter the shipping details for package " + i+1);
			System.out.print("Description:");
			description = getString();
			System.out.print("Weight:");
			weight = getDouble();
			System.out.print("Zone:");
			zone = getString();
			pack = new PackageDetails(description, weight, zone);
			packages.add(pack);
			
		}
		
		calculatePrices(packages);
		
	}
	
	public static double getDouble() throws IOException // reads an double from the keyboard input
    {
		String s = getString();
		return (Double.valueOf(s)).doubleValue();
    }
	
	public static String getString() throws IOException // reads an double from the keyboard input
    {
		Scanner sc = new Scanner(System.in);
		String output = sc.nextLine();
		sc.close();
		return output;
    }
	
	private static void calculatePrices(ArrayList<PackageDetails> packages) {
		// TODO Auto-generated method stub
		ShippingCompany sc;
		double price = 0;
		String carrierName = "";
		
		for(PackageDetails pack : packages){	
			for(CompanyList carrier : CompanyList.values()){
				sc = new ShippingCompany(carrier, pack.getNoOfPounds(),pack.getZone());
				if(sc.calculateShippingCost() < price){
					carrierName = carrier.toString();
					price = sc.calculateShippingCost();
				}
			}
			System.out.println(carrierName + " : $" + price);
			price = 0;
		}
		
	}
}
