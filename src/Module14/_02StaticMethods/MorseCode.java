package Module14._02StaticMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @date Mar 4, 2012
 * @file MorseCode.java
 * @package Module14._02StaticMethods
 * 
 * @purpose 
 */

public class MorseCode
{
	MorseCode()
	{
		
	}
	
	public static String convertLetterToMorseCode(char letter) throws FileNotFoundException
	{
		ArrayList<String> codes = getMorseCode();
		return matchLetterWithMorseCode(letter, codes);
		
	}
	
	private static ArrayList<String> getMorseCode() throws FileNotFoundException
	{
		ArrayList<String> codes = new ArrayList<String>();
		File fileName = new File("morsecode.txt");
		Scanner inFile = new Scanner(fileName);
		while(inFile.hasNext())
		{
			String letterAndCode = inFile.next();
			codes.add(letterAndCode);
		}
		inFile.close();
		return codes;
	}
	
	private static String matchLetterWithMorseCode(char letter, ArrayList<String> codes)
	{
		String morseCode = "";
		for(String line : codes)
		{
			if(letter == line.charAt(0))
			{
				morseCode = line.split(":")[1];
			}
			
		}
		return morseCode;
	}
}
