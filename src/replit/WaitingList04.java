package replit;

import java.util.Scanner;

public class WaitingList04 {

	public static void main(String[] args) {
		/*
		 Write a program that do the following:
It will  ask user to convert a random number created by program, from binary number to decimal or from decimal to binary .
You may google to learn more about converting numbers from one to other
2.the random decimal number created by program  should be between 100 - 1000
3. the random binary number created by program should have digits between 5-7
So the program first randomize wether it will create binary or decimal number, then randomize the number accordingly.
For example, program asks user :What is decimal equivalent of 010010 or what is binary equivalent of 367 etc..
4. If user answers correctly he gets 1 point
5. The program quits only if user answered 5 correct answers in total.
		 */

		/*
		 * HINT
		 * 
		 * Generating a random number between desired values: 
		 (int) (Math.random() * (upper - lower)) + lower;
		 */

		Scanner scan = new Scanner(System.in);


		int score = 0;
		System.out.println("The Game Begins...");
		System.out.println("Your score: " + score);

		do {

			int type = (int) Math.round(Math.random()); // to "convert" type. will be 0 or 1
			
			if(type == 0) {
				System.out.println("Question Type ==> decimal to binary");
			} else {
				System.out.println("Question Type ==> binary to decimal");
			}
			

			if (type == 0) {
				int random = (int) (Math.random() * (1000 - 100)) + 100; // it will generate [100, 1000]

				String result = Integer.toBinaryString(random);

				System.out.println("Please convert " + random + " to binary.");

				String answer = scan.next();

				if (answer.equals(result)) {
					score++;
					System.out.println("Congrats!");
					System.out.println("Your score: " + score);
				} else {
					System.err.println("Wrong answer...");
					System.out.println("Your score is still " + score);
				}

			} else if (type == 1) {

				/*
				 * Decimal value of smallest 5 digit binary number: 0 => (00000)
				 * 
				 * Decimal value of largest 7 digit binary number : 127 => (1111111)
				 */

				int random = (int) (Math.random() * (127)); // it will generate [0, 127]

				System.out.println("Please convert " + Integer.toBinaryString(random) + " to decimal.");

				int answer = scan.nextInt();

				if (answer == random) {
					score++;
					System.out.println("Congrats!");
					System.out.println("Your score: " + score);
				} else {
					System.err.println("Wrong answer...");
					System.out.println("Your score is still " + score);
				}

			}

		} while (score != 5);

		System.out.println("Mission completed! Congrats!");
		
	}

}
