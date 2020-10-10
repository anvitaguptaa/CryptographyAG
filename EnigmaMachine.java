/**
 * Shifts letters down the alphabet in a given message
 * incrementing each shift until shift + 4 is reached
 * Author: Anvita Gupta 
 * Created on: 24/05/18
 */

import java.util.Scanner;

public class EnigmaMachine
{
	public static StringBuffer shiftCipher(String text, int shift)
	{
		// constructs a changeable StringBuffer and initializes key as integer shift
		StringBuffer message= new StringBuffer();
		int key = shift;
	     
		// initializes iteration, completes loop while it is < length of text, increments each loop
		for ( int iteration = 0; iteration < text.length(); iteration++ ) 
		{
			// determines if a letter is upper case and encrypts it using upper case ASCII values
			if ( Character.isUpperCase (text.charAt(iteration) ) )
			{ 
				char ch = ( char )( ( ( int )text.charAt( iteration ) +
	                                  key - 65) % 26 + 65);
				// adds the upper case characters of the message to the string
				message.append( ch );
			}
			
			// if character is not whitespace (lower case) then encrypts using lower case ASCII values
			else if (!Character.isWhitespace (text.charAt(iteration) ))
			{
				char ch = ( char )( ( ( int )text.charAt( iteration ) +
	                                  key - 97 ) % 26 + 97 );
				
				// adds the lower case characters of the message to the string
				message.append( ch );
			}         
			
			// if character is a space it displays this space within the result
			if ( Character.isWhitespace(text.charAt(iteration) ) )
			{
				char ch = ( char )( ( ( int )text.charAt( iteration ) ));
				// adds the white spaces within the string
				message.append( ch );
			}
	       
			// while the loop is running and amount shifted is shift + 4, key becomes the initial shift again 
			if ( key == shift + 4)
			{
				key = shift;
			}
			
			else
			{
				// else the amount shifted is incremented 
				key++;
			}
		}
		
		// returns the message with all shifted characters appended if necessary
		return message;
	}
	 
	public static void main(String[] args)
	{
		//constructs a scanner
	    	Scanner kb = new Scanner(System.in);
	    	String userMessage;
	    	int s;
	    
	    // asks the user to enter a message and enter how many letters they would like to shift   
	    	System.out.print("Enter a Message (remember all spaces are counted as characters!): ");
		      userMessage = kb.nextLine();
		System.out.print("How many letters would you like to shift? ");
              s = kb.nextInt();
		      
              //closes the keyboard
		      kb.close();
		
		// displays the shifted string      
	    	String text = userMessage;
	        System.out.println("Cipher: " + shiftCipher(text, s));
	}
}
	