package Module14._04Randomness;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @date Mar 15, 2012
 * @file ChrisPybusDecipher.java
 * @package Module14._04Randomness
 * 
 * @purpose 
 */

public class ChrisPybusDecipher
{
	String fileName = "";
	
	ChrisPybusDecipher(String filename)
	{
		fileName = filename;
	}
	
	public void decipherMsg() throws FileNotFoundException
	{
		File file = new File(fileName);
		Scanner inFile = new Scanner(file);
		while(inFile.hasNextLine())
		{
			String line = inFile.nextLine();
			String[] msgAndCipher = line.split(":");
			String[] letterKey = msgAndCipher[1].split("; ");
			
			System.out.println("For Message: " + msgAndCipher[0]);
			System.out.println("Decoded: " + decode(msgAndCipher[0], letterKey));
			System.out.println("Cipher Used: " + msgAndCipher[1]);
		}
		
	}
	
	private String decode(String msg, String[] key)
	{
		String decodedMsg = "";
		for(int index = 0; index < msg.length(); index++)
		{
			char letter = msg.charAt(index);
			char replacement = ' ';
			for(String letterKey : key)
			{
				if(letterKey.substring(2, 3).equals(Character.toString(letter)))
				{
					replacement = letterKey.charAt(0);
				}
			}
			decodedMsg += Character.toString(replacement);
		}
		return decodedMsg;
	}
}
