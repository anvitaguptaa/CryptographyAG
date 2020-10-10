/**
 * Allows the user to select which encryption they would like to perform
 * Author: Anvita Gupta 
 * Created on: 24/05/18
 */

import java.util.Scanner;

public class UserPrompt 
{
	public static void main(String[] args)
	{
		//constructs a scanner
	    	Scanner kb = new Scanner(System.in);
	    	int n;
	
	    	// tells the user a value that is given to each encryption option
	    	System.out.println("To Choose Substitution Cipher, Enter  1");
		System.out.println("To Choose Caesar Cipher, Enter 2");
		System.out.println("To Choose Enigma Machine Cipher, Enter 3");
		System.out.println();
		
		// the user enters the number according to the encryption they would like to perform
		System.out.println("Please enter the number for the option that you would like to perform: ");
		n = kb.nextInt();
	
		// if user enters 1 then the main object is called from SubstitutionCipher
		if (n == 1)
		{
			SubstitutionCipher.main(args); 
		}
	
		// if user enters 2 then the main object is called from ShiftCipher
		if (n == 2)
		{
			ShiftCipher.main(args);
		}
		
		// if user enters 1 then the main object is called from EnigmaMachine
		if (n == 3)
		{
			EnigmaMachine.main(args);
		}
	
		// the keyboard is closed
		kb.close();
	}
}
