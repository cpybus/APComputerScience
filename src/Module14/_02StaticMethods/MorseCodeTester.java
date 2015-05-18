package Module14._02StaticMethods;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @date Mar 4, 2012
 * @file MorseCodeTester.java
 * @package Module14._02StaticMethods
 * 
 * @purpose 
 */

public class MorseCodeTester
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("---- Morse Code Converter ---- ");
		System.out.print("Your Message Here (No Punctuation): ");
		String msg = in.nextLine();
		String morseMsg = "";
		for(char letter : msg.toCharArray())
		{
			morseMsg = morseMsg + MorseCode.convertLetterToMorseCode(Character.toLowerCase(letter)) + " ";
		}
		System.out.println("Your Message: " + morseMsg);
	}
	
}
