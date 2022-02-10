package replit;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers to find even numbers between them ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();

       int start= Math.min(num1, num2);
       int end= Math.max(num1, num2);
       for (int i=start; i<=end; i++) {
           if (i % 2 == 0) {
               System.out.print(i + " ");
           }
       }if (num1==num2&&num1%2==1) {
    	   System.out.println("There is no even number...........");
       }
       
       
    }

}
