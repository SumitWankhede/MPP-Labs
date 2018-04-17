package prob1;

public class Exponential {
	
	public static void main(String[] args) {
		
		System.out.println("Exponential of 2 to power 10 is: " + power(2,10));
		
	}
	
	public static double power(double x,int n) {
		if(n == 1)
			return x;
		else 
			return x * power(x,n -1);
	}
}
