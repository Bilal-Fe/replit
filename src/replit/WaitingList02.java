package replit;

import java.util.Scanner;

public class WaitingList02 {

	public static void main(String[] args) {
		/*
		 Ask use to enter firstname and lastname under given conditions;
          
          1)If user uses space characters at the beginning or at the end remove them.
          2)If user enters nothing or just space character, give a message like
            "Just space characters or nothing is not valid"
          3)If user does not use space character between first and last name 
            give a message like "One of the lastname and first name is not entered 
            or space is not used between firstname and lastname"
          4)If user uses multiple space characters between firstname and lastname 
            make it single  
          5)Initials of firstname and lastname should be uppercase, 
            other characters should be lowercases.
            If user does not enter the name in this format fix it.

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first and last name...");
		String name=scan.nextLine();
		
		//1)
		name = name.trim();
		System.out.println(name);
		
		//2 
		//*************I need to change this part. Find more suitable String manipulation
		if(name.equals("")||name.equals(" ")) {
			System.out.println("Just space characters or nothing is not valid");
		}
		//3
		if(!name.contains(" ")) {
			System.out.println("One of the lastname and first name is not entered or space is not used between firstname and lastname");
		}
		//4             Bilal      Demir
		// *******maybe we can put if statement and we can write more clear (readable)
		/*
		 * replace
		 *indexOf lastIndexOf
		 *substring 
		 * 
		 */
		String name1= name.replace(name.substring(name.indexOf(" "), name.lastIndexOf(" ")+1)," ");
		 
		System.out.println(name1);
		
		//5 Bilal Demir
		//*************try to write more readable!!!!!!!!!!!!!!!!!!!!!!
		/*
		 * toUpperCase
		 * toLowerCase
		 * substring
		 * indexOf lastIndexOf
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		String name2 = name1.substring(0, 1).toUpperCase()+name1.substring(1, name1.indexOf(" ")).toLowerCase()+" "+
		name1.substring(name1.indexOf(" ")+1, name1.indexOf(" ")+2).toUpperCase()+name1.substring(name1.indexOf(" ")+2).toLowerCase();
		
		System.out.println(name2);
		
		
		
		scan.close();

	}

}
