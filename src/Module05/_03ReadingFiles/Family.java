
package Module05._03ReadingFiles;

/**
 * @author Chris
 * @version Nov 4, 2011
 * @packageName Module5._03ReadingFiles
 * @fileName Family.java
 *
 * @purpose to read text from files. 
 *
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
	public static void main(String[] args) throws IOException
	{
		String token = "";
		double twoBoys = 0;
		double twoGirls = 0;
		double boyAndGirl = 0;
		double total;
		File fileName = new File("MaleFemaleInFamily.txt");
		if (!fileName.exists())
		{
			System.out.println("Wheres the file?");
		}
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext())
		{
			token = inFile.next();
			if (token.equalsIgnoreCase("BB"))
			{
				twoBoys++;
			}
			else if (token.equalsIgnoreCase("GG"))
			{
				twoGirls++;
			}
			else if ((token.equalsIgnoreCase("BG")) || (token.equalsIgnoreCase("GB")))
			{
				boyAndGirl++;
			}
			else
			{
				System.out.println("Error.");
			}
		}
		inFile.close();
		total = twoBoys + twoGirls + boyAndGirl;
		double boysPercent = ((twoBoys / total)*100);
		boysPercent = (double)(((int)(boysPercent*100))/100.0);
		double girlsPercent = ((twoGirls/ total)*100);
		girlsPercent = (double)(((int)(girlsPercent*100))/100.0);
		double bothPercent = ((boyAndGirl/ total)*100);
		bothPercent = (double)(((int)(bothPercent*100))/100.0);

		System.out.println("File Name: " + fileName);
		System.out.println("Sample Size: " + total);
		System.out.println("Two Boys: " + twoBoys + " (" + boysPercent + "%)");
		System.out.println("Two Girls: " + twoGirls + " (" + girlsPercent + "%)");
		System.out.println("Boy and Girl: " + boyAndGirl + " (" + bothPercent + "%)");
	}
}
