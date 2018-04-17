package Lab2;

public class Star1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*");
		for(int i = 0; i < 4; ++i){
			System.out.printf("*");
			for(int j = 0; j <= i-1; ++j){
				System.out.printf("%-3s", " ");		
			}
			System.out.printf("*");
			System.out.println();
		}
		for(int j = 0; j <= 4; ++j){
			System.out.printf("%-3s", "*");		
		}
	}

}
