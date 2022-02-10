package replit;

import java.util.Scanner;

public class WaitingList05 {

	public static void main(String[] args) {
		/*
		 Well there is not a question. 
		 I made a game that guess your birthday. 
		 If you run the code it will surprise you. 
		 Make sure to get a calculator you might need one.
		 */

		// While loop exploration.
				String answer="";
				do {
					System.out.println("Do you want to play a mind-reading game?(Y/N)");
					Scanner scan=new Scanner(System.in);
					answer=scan.nextLine().substring(0,1).toUpperCase();
				}
				while(!answer.equals("Y"));
				System.out.println("I am going to guess your birthday but I need you to do some operations for me.");
				do {
					System.out.println("Is that ok?(Y/N)");
					Scanner scan=new Scanner(System.in);
					answer=scan.nextLine().substring(0,1).toUpperCase();
				}
				while(!answer.equals("Y"));
				System.out.println("Let's agree on some info about your birthday.");
				System.out.println("For example, if your birthday is 14 April 1979, 14 is your day number, 4 is month number and 79 is year number.");
				do {System.out.println("Is that clear?(Y/N)");
				Scanner scan=new Scanner(System.in);
				answer=scan.nextLine().substring(0,1).toUpperCase();
				}
				while(!answer.equals("Y"));
				System.out.println("Great! Let's go on then.");
				System.out.println("Multiply your day number by 400 and then add 3.");
				System.out.println("Now, multiply the result you get by 25.");
				System.out.println("Please write down this result somewhere we will need it for later.");
				do {
					System.out.println("Are you ready?(Y/N)");
					Scanner scan=new Scanner(System.in);
					answer=scan.nextLine().substring(0,1).toUpperCase();
				}while(!answer.equals("Y"));
				System.out.println("Brilliant! Let's move on then.");
				System.out.println("Multiply your month number by 5 and then add 7.");
				System.out.println("Now, multiply the result you get by 20.");
				System.out.println("Please write down this result somewhere we will need it for later.");
				do {
					System.out.println("Type Yes when you are ready?");
					Scanner scan=new Scanner(System.in);
					answer=scan.nextLine().substring(0,1).toUpperCase();
				}while(!answer.equals("Y"));
				System.out.println("Now, add your year number(last two digits of your birth year!) to the two results you got previously.");
				do {
					System.out.println("Type Yes when you are ready?");
					Scanner scan=new Scanner(System.in);
					answer=scan.nextLine().substring(0,1).toUpperCase();
				}while(!answer.equals("Y"));
				System.out.println("What is the final result?");
				Scanner scan=new Scanner(System.in);
				int res=scan.nextInt();
				res=res-215;
				int day=res/10000;
				int year=res%100;
				int month=(res-year)/100%100;
				System.out.println("Your birthday is "+ day +"/"+month+"/"+year+ " (DD/MM/YY)");
	
	scan.close();
	}

}
