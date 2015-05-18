package Module14._04Randomness;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Christopher Pybus
 * @date Mar 15, 2012
 * @file ChrisPybusCipher.java
 * @package Module14._04Randomness
 * 
 * @purpose 
 */

public class ChrisPybusCipher
{
	public String cipher = "";
	private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	ChrisPybusCipher()
	{
		cipher = generateCipher();
	}
	
	public String cipherMsg(String msg)
	{
		String encodedMsg = "";
		msg = msg.toLowerCase();
		msg = msg.replaceAll("[^a-zA-Z0-9 ]", "");
		for(int index = 0; index<msg.length(); index++)
		{
			char letter = msg.charAt(index);
			if(letter != ' ')
			{
				char replacedLetter = cipher.charAt(ALPHABET.indexOf(letter));
				encodedMsg += replacedLetter;
			}
			else
			{
				encodedMsg += " ";
			}
			
		}
		return encodedMsg;
	}
	
	private String generateCipher()
	{
		ArrayList<Character> code = new ArrayList<Character>();
		String cipher = "";
		for(int index = 0; index<26; index++)
		{
			Random rd = new Random();
			Character letter;
			boolean contains = false;
			do
			{
				int ranNum = rd.nextInt(26);
				letter = ALPHABET.charAt(ranNum);
				if(code.contains(letter))
				{
					contains = true;
				}
				else if(!code.contains(letter))
				{
					code.add(letter);
					contains = false;
				}
				
			}while(contains == true);
			
		}
		
		for(Character chara : code)
		{
			cipher = cipher + chara.toString();
		}
		return cipher;
	}
	
	public String getUsedCipher()
	{
		String cipherUsed = "";
		for(int index = 0; index<ALPHABET.length(); index++)
		{
			char regularLetter = ALPHABET.charAt(index);
			char replaceLetter = cipher.charAt(index);
			cipherUsed = cipherUsed + regularLetter + "=" + replaceLetter + "; ";
		}
		return cipherUsed;
	}
	
	
}
