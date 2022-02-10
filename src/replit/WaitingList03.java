package replit;

public class WaitingList03 {

	public static void main(String[] args) {
		/*
		 Write a complete Java program in a class named Spikey that prints the following output:
		   	  \/
 			 \\//
			\\\///
			///\\\
 			 //\\
  			  /\
  			   
		 */

		String designOne = "\\";
		String designTwo = "/";
		
		for (int i = 1; i <= 3; i++) {
			for (int k = 1; k <= 3 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(designOne);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(designTwo);
			}
			System.out.println();
		}

		for (int i = 3; i >= 1; i--) {
			for (int k = 1; k <= 3 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(designTwo);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(designOne);
			}
			System.out.println();
		}



	}

}
