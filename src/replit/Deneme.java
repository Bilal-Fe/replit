package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Deneme {	
	 	 public static void main(String args[]){    
//	 		/**
//	          * Q11-
//	          *  ask user to enter his blood group (only A, B, O or AB)
//	          *  if a user is AB blood group print on the console "You can get blood from A,B,O and AB"
//	          *  if a user is A blood group print on the console "You can receive blood from A and O"
//	          *  if a user is B blood group print on the console "You can receive blood from B and O"
//	          *  if a user is O blood group print on the console "Sorry, you can receive only O"
//	          */
//	 		 Scanner scan = new Scanner(System.in);
//	 		 System.out.println("Enter your blood group \nA\nB\nAB\nO...");
//	 		 String blood = scan.next().toUpperCase();
//	 		 
//	 		 if(blood.equals("AB")) {
//	 			 System.out.println("You can get blood from A,B,O and AB");
//	 		 }else if(blood.equals("A")) {
//	 			System.out.println("You can get blood from A and O");
//	 		 }else if(blood.equals("B")) {
//		 			System.out.println("You can get blood from B and O");
//		 		 }else if(blood.equals("O")||blood.equals("0")) {
//			 			System.out.println("Sorry, you can receive only O");
//			 		 }else {
//			 			 System.err.println("we need a real blood type");
//			 		 }
	 	 
	 		 
//	 		 switch (blood) {
//			case "AB":
//				System.out.println("You can get blood from A,B,O and AB");
//				break;
//			case "A":
//				System.out.println("You can get blood from A and O");
//				break;
//			case "B":
//				System.out.println("You can get blood from B and O");
//				break;
//			case "O":
//			case "0":
//				System.out.println("Sorry, you can receive only O");				
//				break;
//
//			default:
//				System.err.println("we need a real blood type");
//				break;
//			}
	 		/**
	          * Q12-
	          * Ask a user to enter his "name" and age.
	          * Ask a user to enter how long he has been staying in USA "year only"
	          *
	          * if a user stays in USA less than 3 years print on the console "name, You are not eligible to apply Green Card"
	          * if a user stays in USA more than 3 years proceed following conditions
	          * {
	          *      if a user is younger than 18, print on the console "name, Parent signature is required for application"
	          *      if a user is older than 18, print on the screen " name, you are eligible to apply for Green Card TOEFL is required"
	          *      if a user is older than 50, print on the screen "name, You are eligible to apply for Green card, and TOEFL is not required"
	          * }
	          */
//	 		 Scanner scan = new Scanner(System.in);
//	 		 System.out.println("Enter your full name");
//	 		 String name = scan.nextLine();
//	 		int age;
//	 		 System.out.println("enter how long he has been staying in USA (year only)");
//	 		 int year = scan.nextInt();
//	 		do { 
//	 		 System.out.println("Enter your age");
//	 		 age = scan.nextInt();
//	 		 age =Math.abs(age);
//	 		System.err.println(age<0?"please enter positive value":"");
//	 		}while(age<0);
//	 		
//	 		if (year<3) {
//				System.out.println(name+" You are not eligible to apply Green Card");
//			}else {
//				if(age<18) {
//					System.out.println(name+" Parent signature is required for application");
//				}else if(age>=18 && age<=50) {
//					System.out.println(name+" you are eligible to apply for Green Card TOEFL is required");
//				}else {
//					System.out.println(name+" You are eligible to apply for Green card, and TOEFL is not required");
//				}
//				}
//			}
	 		/*
	 		 Q13 - registrationList {Abdrurrahman, Bilal, Hatice, Esen, Emrah, Huseyin, Olcay, Mustafa}
	         Ask user to enter a name, and check if the name is in the registrationList
	         if so, print "You are team 1 member, brighter future is very close"
	         if not, print on the console "Contact with Team leader for registration"
	         */
//	 		 List<String> registrationList = new ArrayList<>(Arrays.asList("Abdrurrahman", "Bilal", "Hatice", "Esen", "Emrah", "Huseyin", "Olcay", "Mustafa"));
//	 		
//	 		 
//	 		 Scanner scan = new Scanner (System.in);
//	 		 System.out.println("enter your name");
//	 		 String name = scan.nextLine();
//	 		 
//	 		 if(registrationList.contains(name)) {
//	 			 System.out.println("You are team 1 member, brighter future is very close");
//	 		 }else {
//	 			 System.out.println("Contact with Team leader for registration");
//	 			registrationList.add(name);
//	 			System.out.println("you are added Team 1");
//	 		 }
//	 		 Collections.sort(registrationList);
//	  System.out.println(registrationList); 
	  /**
      Q14 - ask user to enter a year, and check if it is leap year
      Leap year : a year that has 29 days in a february

 
	 	Ask user to enter year
		Type java code by using if-else if() statement.
		Write a program to check if a year is leap year or not.
		if the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
    */
//Scanner scan = new Scanner(System.in);
//System.out.println("enter a year");
//int year = scan.nextInt();
//if(year%100==0&&year%400==0) {
//	System.out.println(year+" is a leap year");
//}else if(year%100!=0 && year%4==0) {
//	System.out.println(year+" is a leap year");
//}else {
//	System.out.println(year+" is not a leap year");
//}
      
//System.out.println(year%100==0?year%400==0?"leap year":"not leap" : year%4==0?"leap":"not leap");
	 	 
	 	 
	 	/**
	 	 Write a Java program to find the number of days in a month.
	 	 (Use Switch Case) (Interview Question / Leak Year)
	 	 */
//	 	 Scanner scan = new Scanner(System.in);
//	 	 System.out.println("Enter a mounth and year to find find number of days ");
//	 	 String month = scan.next().toLowerCase();
//	 	 int year = scan.nextInt();
//	 	 
//	 	 switch (month) {
//		case "january":
//		case "march":
//		case "may":
//		case "july":
//		case "august":
//		case "october":
//		case "december":
//		System.out.println(year+" "+month+" have 31 days... ");
//			break;
//		case "april":
//		case "june":
//		case "september":
//		case "november":
//			System.out.println(year+" "+month+" have 30 days... ");
//			break;
//		case "february":
//			System.out.println(year%100==0?year%400==0?year+" "+month+" have 29 days... ":year+" "+month+" have 28 days... " : year%4==0?year+" "+month+" have 29 days... ":year+" "+month+" have 28 days... ");
//			break;
//
//		default:
//			System.out.println("enter valid month");
//			break;
//		}
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 
	 	 }   
}
		