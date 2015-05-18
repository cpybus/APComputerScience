
package Module05._06WritingTextFiles;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Chris
 * @version Nov 5, 2011
 * @packageName Module5._06WritingTextFiles
 * @fileName BottleCapPrize.java
 * 
 * @purpose
 * 
 */
public class BottleCapPrize
{

	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		Random randomGenerator = new Random();
		int randomNum;
		int trials;
		int counter = 0;
		int counter2 = 0;
		int sum = 0;
		double averageBottles;
		String token = "";

		PrintWriter outFile = new PrintWriter(new File("ChrisIsAwesome.txt"));
		System.out.print("How many trials would you like to do?: ");
		trials = in.nextInt();
		for (int index = 1; index <= trials; index++)
		{
			do
			{
				randomNum = randomGenerator.nextInt(5) + 1;
				if (randomNum == 1)
				{
					counter++;
					outFile.println(counter);
					counter = 0;
				}
				else
				{
					counter++;
				}
			}
			while (randomNum != 1);
		}
		outFile.close(); // close the file when finished

		
		File fileName = new File("C:\\Users\\Chris\\workspace\\Computer Programming\\ChrisIsAwesome.txt");
		if (!fileName.exists())
		{
			System.out.println("Wheres the file?");
		}
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext())
		{
			token = inFile.next();
			sum = sum + (Integer.parseInt(token));
			counter2++;
			
		}
		averageBottles = sum/counter2;
		System.out.println("You have to drink an average of " + averageBottles + " bottles to win a prize.");
		inFile.close();
	}
}
