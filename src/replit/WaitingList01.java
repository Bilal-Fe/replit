package replit;

import java.util.Scanner;

public class WaitingList01 {

	public static void main(String[] args) {
		/*
		  How can you understand a character is used just once in a String by using indexOf() and lastIndex() methods
		   Ex: “HHelloo” ==> indexOf(“H”) --> 0  lastIndexOf(“H”) --> 1
		 					indexOf(“l”) --> 3  lastIndexOf(“l”) --> 4
		  					
		 					indexOf(“e”) --> 2  lastIndexOf(“e”) --> 2  
		 					For non-repeated values indexOf() and lastIndex() methods return same value
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=scan.nextLine();
		
		int a=str.length();
		for(int i=0;i<a;i++) {
		
		if(str.indexOf(str.charAt(i))!= str.lastIndexOf(str.charAt(i))) {
			System.out.println("repeting letters exist");
			break;
			}else {
				
			}
		
		}
		
		
		
		/*
		 Ebay Interview Question:
		 Type code to print non-repeated characters of any given String
		 */
scan.close();
	}

}
