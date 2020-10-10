/**
 * Allows the user to replace letters within a message of their choice
 * Author: Anvita Gupta 
 * Created on: 24/05/18
 */

import java.util.Scanner;

public class SubstitutionCipher
{
	public static void main(String[] args)
	{
		// constructs a scanner
	    Scanner kb = new Scanner(System.in);
	   
	    // declares strings
	    String userMessage;
	    String n;
	    String newLetter;
	      
	    // displays a message asking the user to input a message 
	    System.out.print("Enter a Message: ");
	    userMessage = kb.nextLine();
	      
	    // displays a message asking the user to choose a character within the message to replace 
	    System.out.print("What letter would you like to replace: ");
	    n = kb.nextLine();
		      
	    // asks the user to choose a new letter to replace their previously selected character with
	    System.out.print("What letter would you like to replace it with: ");
	    newLetter = kb.nextLine();
	    
	    // closes the scanner
	    kb.close();
	      
	    // string str takes the userMessage (input), finds all occurrences of n and replaces it with newLetter
	    String str = userMessage.replace(n, newLetter);
	    		  
	    // the string str is displayed as a result
	    System.out.println("Cipher: " + str);
	}
}
