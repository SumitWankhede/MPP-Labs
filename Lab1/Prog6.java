package labWork;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = "";
		
		for(String in : args) {
			if(!output.contains(in))
				output = output + " " + in; 
		}
		
		System.out.println(output);
	}

}
