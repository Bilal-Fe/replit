package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReplitList {
/**1.
 Write a Java program to get a String from user as input and find 
 the maximum occurring character in that string. (Ignore case sensitivity)

input : Learning java is easy 
output: maximum occurring character is : a
 */
	static final int ASCII_SIZE = 256;	
    static char getMaxOccuringChar(String str){
    	// Create array to keep the count of individual characters and initialize the array as 0
    	int count[] = new int[ASCII_SIZE]; 	
    	// Create array to keep the count of individual characters and initialize the array as 0
    	int len = str.length();
    	for(int i=0; i<len; i++) 
    		count[str.charAt(i)]++;
    		
    	int max = -1;  // Initialize max count
        char result = ' ';   // Initialize result
    	
     // Traversing through the string and maintaining the count of each character
        for(int i = 0; i<len; i++) {
        	if (max<count[str.charAt(i)]) {
        		max=count[str.charAt(i)];
        		result = str.charAt(i);
        	}
        }
    	return result;   	
    }
    /**3.
    Get a sentence from the user. Accept the sentence received from the user as a parameter, 
    Invert sentence using Array and write a Method that returns the result as a 
    String to the main method.
Note: Upper and lower case letters, spaces and special characters will not be changed.
Input : It is very nice to write code.
Output : .edoc etirw ot ecin yrev si tI
    */
    public static String reverseSentences(String str) {

        String revSent="";
        String[] sentArray=str.split("");

        for (int i = sentArray.length-1; i >=0 ; i--) {
            revSent+=sentArray[i];
        }

        return revSent;
    }
    /**5.
    Write a program that accepts an integer as input and prints first 10 prime 
      numbers greater than input 
		Check numbers if they are even or not in a return method.
	Input : 5
	Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41] 
     */
    static boolean isPrime(int num) {
        if (num != 2) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;      
}
    
    
  /////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter a Text...");
//	String str=scan.nextLine().toLowerCase();
//	System.out.println("Max occurring character is:... "+getMaxOccuringChar(str));
	
		
		/**2
	     Create a 10-element list. Swap the 8th element with the 3rd element.
	INPUT :String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
	Output: [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
	     */
//		String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
//    	List<String> list = Arrays.asList(names);
//    	//System.out.println(list);
//    	 List<String> list2=new ArrayList<>();
//         //System.out.println(list2);
//         for (String w : names) {
//             list2.add(w);
//         }
//         //System.out.println(list2);
//
//         String eleman3= list2.get(2);
//         String eleman8=list2.get(7);
//         //System.out.println(list2);
//
//         list2.remove(2);
//         list2.remove(6);
//         //System.out.println(list2);
//         list2.add(2, eleman8);
//         list2.add(7, eleman3);
//
//         System.out.println(list2);
         
         /**3.
          Get a sentence from the user. Accept the sentence received from the user as a parameter, 
          Invert sentence using Array and write a Method that returns the result as a 
          String to the main method.
Note: Upper and lower case letters, spaces and special characters will not be changed.
Input : It is very nice to write code.
Output : .edoc etirw ot ecin yrev si tI
          */
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a sentence");
//         String str = scanner.nextLine();
//         String []arr=str.split(" ");
//         String [] reversedArr=new String[arr.length];		
//         for (int i =arr.length-1; i>=0; i--) {
//           String str1="";
//           for(int j=arr[i].length()-1; j>=0; j--) {			
//             str1+= arr[i].charAt(j);
//             reversedArr[i]=str1;			
//           }		
//           System.out.print(reversedArr[i]+ " ");		
//           scanner.close();			
//     	  }
         
//		//@SuppressWarnings("resource")
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a sentences to convert its reverse");
//        String str = scan.nextLine();
//
//        System.out.println(reverseSentences(str));
/**4.
 Write a program that deletes the letters 'a' from the names in the list given as input.
INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
OUTPUT : [Veli,Omer]
 */
//        List<String> list1 = new ArrayList<>();
//
//        list1.add("Ali");
//        list1.add("Veli");
//        list1.add("Ayse");
//        list1.add("Fatma");
//        list1.add("Omer");
//
//        List<String> list2 = new ArrayList<>();
//
//        for (String w : list1) {
//
//            if (w.toLowerCase().contains("a")) {
//                continue;
//            }else list2.add(w);
//        }
//        System.out.println(list2);
    /**5.
      Write a program that accepts an integer as input and prints first 10 prime 
      numbers greater than input 
		Check numbers if they are even or not in a return method.
	Input : 5
	Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]    
     */
//			  int input = 5;
//		        int count = 0;
//		        List<Integer> first10Primes = new ArrayList<>();
//		        while (count < 10) {
//
//		            input++;
//		            if (isPrime(input)) {
//		                count++;
//		                first10Primes.add(input);
//		            }
//		        }
//		        System.out.println(first10Primes);
		
		/**6.
	 	Write a program to find the common elements between two String Arrays (without case sensitivity) 
		Input1 : {John,Brad,Ange,Sofia,Emily}
		Input2 : {sofia,brad,grace,emily,hazel}
		Output : [sofia,brad,emily] 
		 */
//		String input1[] = { "John", "Brad", "Ange", "Sofia", "Emily" };
//        String input2[] = { "sofia", "brad", "grace", "emily", "hazel" };
//        List<String> output = new ArrayList<>();
//        for (int i = 0; i < input1.length; i++) {
//            for (int j = 0; j < input2.length; j++) {
//                // 2)add the common elements to a list
//                if (input1[i].equalsIgnoreCase(input2[j])) {
//                    output.add(input1[i]);
//                }
//            }
//        }
//        System.out.println("Common elements from given two Arrays : "+ output);
		/**7.	 
		write a Java program to removes a specific element from an array 
		and put the remaining elements in a new array and prints the new 
		array
		Input :{1,2,3,4,5,6} 
		element:6
		Output : [1,2,3,4,5]
		 */
//		int input[] = { 1, 2, 3, 4, 5, 6 };
//        int remove = 6;
//
//        List<Integer> outputList = new ArrayList<>();
//
//        for (int each : input) {
//            if (each != remove) {
//                outputList.add(each);
//            }
//        }
//
//        int output[] = new int[outputList.size()];
//
//        for (int i = 0; i < output.length; i++) {
//
//            output[i] = outputList.get(i);
//        }
//
//        Integer output2[] = new Integer[outputList.size()];
//        output2 = outputList.toArray(output2);
//
//        System.out.println(Arrays.toString(output));
//        System.out.println(Arrays.toString(output2));
        

        /**7.	 
		write a Java program to removes a specific element from an array 
		and put the remaining elements in a new array and prints the new 
		array
		Input :{1,2,3,4,5,6} 
		element:6
		Output : [1,2,3,4,5]
		 */
//        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("1","2","3","4","5","6"));
//		list1.remove(list1.size()-1);
//    System.out.print("[");
//		for(int i=0;i<list1.size();i++) {
//		    System.out.print(list1.get(i));
//		    if(i+1 != list1.size())
//		    	System.out.print(",");
//		}
//		System.out.print("]");
		/**8.
		 Write a java program which accept a sentence as parameter, 
		 than reverses sentence by using StringBuilder and checks 
		 if sentence is palindrome or not (without case sensitivity).  
		 Use StringBuilder.
     Eg :Input : I love Java.
Output: Reversed sentence : avaJ evol I. It is not a palindrome"
		 */
		String input = "I love Java";

        StringBuilder str = new StringBuilder();
        str.append(input);

        String reverseInput= str.reverse().toString();



        if(input.equalsIgnoreCase(reverseInput)) {
            System.out.println(" Reversed sentence : " + reverseInput +"  It is a palindrome");
        } else System.out.println(" Reversed sentence : '" + reverseInput +"'  It is not a palindrome");

    }
				
		    }


