package Module14._04Randomness;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @date Mar 15, 2012
 * @file ChrisPybusTester.java
 * @package Module14._04Randomness
 * 
 * @purpose 
 */

public class ChrisPybusTester
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(System.in);
		ChrisPybusCipher ciph = new ChrisPybusCipher();
		
		String msg = "";
		
		System.out.println("Hello, today we are going to be randomly");
		System.out.println("scrambling a message of yours. ");
		System.out.println();
		System.out.println("=== ENCODE ==================");
		System.out.println("Please enter the message you want scrambaled.");
		System.out.print("Message: ");
		msg = in.nextLine();
		System.out.println("Encoded Message: " + ciph.cipherMsg(msg));
		System.out.println("Cipher Used: " + ciph.getUsedCipher());
		printOut(ciph.cipherMsg(msg), ciph.getUsedCipher());
		System.out.println();
		
		System.out.println("=== DECODE ==================");
		ChrisPybusDecipher deciph = new ChrisPybusDecipher("cipher.txt");
		deciph.decipherMsg();
		
	}
	
	public static void printOut(String msg, String cipherUsed) throws FileNotFoundException
	{
		PrintWriter outFile = new PrintWriter(new File("cipher.txt"));
		outFile.println(msg + ":" + cipherUsed);
		outFile.close();
	}
}
