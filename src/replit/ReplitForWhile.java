package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitForWhile {

	public static void main(String[] args) {
		/** 1.
		 Ask user to enter a name and a character, 
		 then check how many times the character is repeated 
		 in the name using loops in the name

		e.g:

		char ch1= 'a' ;

		String name =“John came late"

		Expected Output: Number of a = 2
		 **/
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String name=scan.nextLine().toLowerCase();
//		System.out.println("Enter a character");
//		char letter=scan.next().toLowerCase().charAt(0);
//		
//		int count=0;
//		
//		for(int i=0;i<name.length(); i++) {
//			if(letter==name.charAt(i)) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		
//		
//		
//		scan.close();
		
	
		
		
		
		
		
		/** 2.
	 Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120	
	 **/
		
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter 2 integers");
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		int gcd=0;
//		int lcm=0;
//			for(int i=1; i<=a&&i<=b;i++) {
//				if(a%i==0&&b%i==0) {
//					gcd=i;	
//				}			
//			}		
//		for(int i=a*b; i>=a&&i>=b; i--) {
//			if(i%a==0&&i%b==0) {
//				lcm=i;
//			}
//		}
//		System.out.println("GCD for "+a+" and "+b+" = "+gcd);
//		System.out.println("LCM for "+a+" and "+b+" = "+lcm);		
//		scan.close();
		

		/******* 3.

		Write a Program to find the sum of natural numbers from 1 to 100.

		OUTPUT : Sum of Natural Numbers 5050

		*******/
		
//		int sum=0;
//		
//		for(int i=1; i<101; i++) {
//			sum+=i;
//		}
//		System.out.println("Sum of Natural Numbers "+sum);
		
		
		/** 4.
		Write a code that returns the duplicate chars in a String array.
		(interview Question)
		Input : String str=“Javaisalsoeasy”
		Output: [a, s]
		 **/
	
//	    String str = "Javaisalsoeasy"; 
//	    String[] arr = str.split("");
//	    String duplicate = "";
//
//	    for(int i=0; i<arr.length; i++){
//	        for(int j=arr.length-1; j>i; j--){
//	            if(arr[i].equals(arr[j])){
//	                if(!(duplicate.contains(arr[i]))) {
//		            		duplicate+=arr[i];
//		            	}
//	            }
//	        }
//	    }
//	    String brr[] = duplicate.split("");
//	    System.out.println(Arrays.toString(brr));
		
		
//		 String str="Javaisalsoeasy";
//		 String[]arr=str.split("");
//		 String duplicate="";
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i].equals(arr[j])) {
//					if(!(duplicate.contains(arr[i]))) {
//						duplicate+=arr[i];
//					}
//				}
//			}
//		}
//		 String[] brr=duplicate.split("");
//		 System.out.println(Arrays.toString(brr));
		
		/** 5.
		 Write a return method that accepts an integer as input and calculates factorial and prints like output.
		 Input : 6
		 Output: 6!=65432*1=720
		 **/
		
//		public class Replit2 {
//			
//			public static void main(String[] args) {
//				/**
//				 Write a return method that accepts an integer as input and calculates factorial and prints like output.
//				 Input : 6
//				 Output: 6!=65432*1=720
//				 **/
//				factorial(6);
//				
//				
//			}
//			public static void factorial(int a) {
//				
//				int f=1;
//				for(int i=1; i<=a; i++) {
//					f=f*i;
//				}
//				System.out.println("6!=654321="+f);
//			}
//		}

		/** 6.
		 Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
		 **/
//		 System.out.print("Even Numbers from 20 to 0 are: ");
//		 for(int i=20; i>=0; i-=2) {
//		 System.out.print(i+" ");
//		 }
		 
		 
		 /** 7.
		  	Print Alphabet on the console.
			OUTPUT : a b c .. .. .. .. y z
		  **/
		 
//		 for(char i='a'; i<='z';i++) {
//			 System.out.print(i+" ");
//		 }
		 
		 /** 8.
		  	Write java code checking the number is Perfect number or not. 
			Any number can be a Java Perfect Number 
			if the sum of its positive divisors excluding the number itself is equal to that number. 

			Input :6
			Output:6 is Perfect Number
			Input :7
			Output:7 is not Perfect Number

		  **/
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a number");
//		  int a=scan.nextInt();
//		int sum=0;
//		for(int i=1; i<a; i++) {
//			if(a%i==0) {
//				sum+=i;
//			}
//		}
//		if(sum==a) {
//			System.out.println(a+" is Perfect Number");
//		}else {
//			System.out.println(a+" is not Perfect Number");
//		}
		 
		/** 9.
		 Write a Java program that prints ascii values of characters from ‘a’ to ‘z’

Expected Output:

Ascii value of a = 97
Ascii value of b = 98
Ascii value of c = 99
Ascii value of d = 100
Ascii value of e = 101
Ascii value of f = 102
Ascii value of g = 103
Ascii value of h = 104
Ascii value of i = 105
Ascii value of j = 106
Ascii value of k = 107
Ascii value of l = 108
Ascii value of m = 109
Ascii value of n = 110
Ascii value of o = 111
Ascii value of p = 112
Ascii value of q = 113
Ascii value of r = 114
Ascii value of s = 115
Ascii value of t = 116
Ascii value of u = 117
Ascii value of v = 118
Ascii value of w = 119
Ascii value of x = 120
Ascii value of y = 121
Ascii value of z = 122 
		 */
		 
//		 char i=' ';
//		 int k=0;
//		 for( i='a'; i<='z'; i++) {
//			 k=i;
//			 System.out.println("Ascii value of "+i+" = "+k);
//		 }
		 
	/** 10.
	 Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321	 
	 */
		 
//	Scanner scan=new Scanner(System.in);
//	System.out.println("Enter a number");
//	String a=scan.next();
//	String str="";
//	for(int i=a.length()-1;i>=0; i--) {
//		str+=a.charAt(i);
//	}
//	System.out.print("Reverse Of The Number: "+str);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}