package replit;

import java.util.Arrays;

public class ReplitMethodArray {
	/* 1.
Write a return method to reverse number.
Input : 12345
Output : 54321
	 */
	public static String reverseNumber(String str) {
		String reverseStr="";
		for(int i=str.length()-1; i>=0; i--) {
		reverseStr+=str.charAt(i)+"";
		}
		return reverseStr;
	}
	/* 2.
	 Write a Java program that reverse a sentence by using Array 
	 (with all spaces and special characters).
	Input : Coding is great.
	Output : .taerg si gnidoC
	 */
	public static String[] reverseSentenceByUsingArray(String str) {
		String [] reverseStr=new String[str.length()];
		for(int i=reverseStr.length-1; i>=0;i--) {
			reverseStr[i]=str.charAt(i)+"";	
			System.out.print(reverseStr[i]);
		}
		return reverseStr;
	}
	/*3.
	 Write a method which accepts a String as parameter and 
	 prints the sum of the digits, present in the given string.
	input : ade1r4d3
	output : 8
     Hint :
     Use Character.isDigit()
     Integer.valueOf(
	 */
	 public static int sumOfTheDigits(String str) {
		int sum=0;
		String digits="0"; 
	for (int i = 0; i < str.length(); i++) {
	     char ch = str.charAt(i);
	   if (Character.isDigit(ch))
	          digits += ch;
	   else {
	        sum += Integer.valueOf(digits);
	          digits = "0";
	      }
			}
		return sum + Integer.valueOf(digits);
		}
		/*4.
	 Create a custom return type method accepts a name as 
	 parameter and prints the name as a char array. 
	 (do not use toCharArray() method)
	 Input : John
	 Output :[J, o, h, n]
	 		 */
	 	static String convertToArray(String name) {
	 		char[] arr=new char[name.length()];
	 		for(int i=0; i<name.length(); i++) {
	 			arr[i]=name.charAt(i);	 			
	 		}	
	 		return Arrays.toString(arr);	 		
	 	}
	 	/*5.
	 	 Write a java program that calculates 
	 	 the average value of array elements
	 	input[]= {1,2,3,4,5,6,7}
	 	Output : 4
	 	 */
	 	public static double avarageOfArray(int[] arr) {
	 		double avarage=0.0;
	 		int sum=0;
	 		for(int i=0; i<arr.length; i++) {
	 			sum+=arr[i];		
	 		}		
	 		return avarage=sum/arr.length; 	
	 	}
	 	/*6.
	Write a method that accepts an integer array as input and 
	prints the minimum and the maximum numbers from given array
Input : {3,2,5,4,1,6}
Output :min: 1 
		max: 6
	 	 */

	 	public static String maxAndMin(int[] arr) {

	 		 Arrays.sort(arr);

	 		return ("min: "+arr[0]+"\nmax: "+arr[arr.length-1]);
	 	}
	 	/*7.
	 	 Write a method that accepts array as parameter and returns sum off all elements
	 	 in the array then print the result in the main method
	 	 
	 	 input: {1,2,3,4,5,6,7,8};
	 	 output: 36
	 	 */
	 	public static int sumOfArray(int[] arr) {
			int sum=0;
	 		for(int w:arr) 
				sum+=w;				 		
	 		return sum;	 		
	 	}
	 	/*8.
	 	 Write a return method that accepts 2 integer Arrays 
	 	 as parameters and  adds 2 array into a new Array and prints it
	 	 input1: {1,2,3,4}
	 	 input2: {5,6}
	 	 output: {1,2,3,4,5,6}
	 	 */
	 	public static String combineTwoArray(int[] arr, int[] brr) {
	 		
	 		int sum=0;
	 		int[] crr = new int[arr.length+brr.length];
	 		for(int i=0; i<arr.length; i++) {
	 			crr[i]=arr[i];
	 		}
	 		for(int i=0, j=arr.length; j<arr.length+brr.length; i++, j++) {
	 			crr[j]=brr[i];
	 		}
	 	return Arrays.toString(crr);	
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	
	 	
	public static void main(String[] args) {

//		System.out.println(reverseNumber("12345"));
//		reverseSentenceByUsingArray("Coding is great.");
//		System.out.println(sumOfTheDigits("ade1r4d3"));
//		System.out.println(convertToArray("John"));
		
//		int[] arr= {1,2,3,4,5,6,7};
//		System.out.println(avarageOfArray(arr));
		
//		System.out.println(maxAndMin(new int [] {3,2,5,4,1,6}));
		
//		System.out.println(sumOfArray(new int [] {1,2,3,4,5,6,7,8}));
		
//		System.out.println(combineTwoArray(new int[] {1,2,3,4},new int[]{5,6}));
	}
	
}

