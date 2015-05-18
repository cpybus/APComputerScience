
package Module06._04MinAndMax;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @version Nov 13, 2011
 * @packageName Module6._04MinAndMax
 * @fileName Hurricanes2.java
 * 
 * @purpose
 * 
 */
public class Hurricanes2
{

	public static void main(String[] args) throws FileNotFoundException
	{
		// --------------
		// Variables
		// --------------
		String token = "";
		File fileName = new File("hurcdata2.txt");
		String[] year = new String[59];
		String[] month = new String[59];
		int[] pressure = new int[59];
	    int[] windspeed = new int[59];
		String[] hurcName = new String[59];
		int[] categoryTotals = new int[5];
		int[] category = new int[59];
		int index = 0;
		int totalCat = 0;
		int totalPres = 0;
		//int totalWind = 0;
		int[] average = new int[3];
		int[] maxValues = new int[3];
		int[] minValues = new int[3];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		// --------------
		// In From File
		// --------------
		Scanner inFile = new Scanner(fileName);
		index=0;
		while (inFile.hasNext())
		{
			String[] line = new String[50];
			String[] yearAndMonth = new String[50];
			token = inFile.nextLine();
			line = token.split("	");
			yearAndMonth = line[0].split(" ");
			year[index] = yearAndMonth[0];
			month[index] = yearAndMonth[1];
			pressure[index] = Integer.valueOf(line[1]);
			windspeed[index] = Integer.valueOf(line[2]);
			hurcName[index] = line[3];
			index++;
		}
		inFile.close();

		// --------------
		// Calculations
		// --------------
		index = 0;
		
		for (int windSpd : windspeed)
		{
			// I found the Hurricane scale in knots online.
			if ((windSpd >= 64) && (windSpd <= 82))
			{
				category[index] = 1;
				categoryTotals[0]++;
			}
			else if ((windSpd >= 83) && (windSpd <= 95))
			{
				category[index] = 2;
				categoryTotals[1]++;
			}
			else if ((windSpd >= 96) && (windSpd <= 113))
			{
				category[index] = 3;
				categoryTotals[2]++;
			}
			else if ((windSpd >= 114) && (windSpd <= 135))
			{
				category[index] = 4;
				categoryTotals[3]++;
			}
			else if (windSpd >= 135)
			{
				category[index] = 5;
				categoryTotals[4]++;
			}
			else
			{
				System.out.println("Error.");
			}
			index++;
		}
		//Category
		for(int categoryValue : category)
		{
			totalCat = totalCat + categoryValue;
			if(categoryValue < min)
			{
				min = categoryValue;
			}
			if(categoryValue> max)
			{
				max = categoryValue;
			}
		}
		average[0] = (int)(totalCat/((double)(category.length)));
		minValues[0] = min;
		maxValues[0] = max;
		
		//Pressure
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int pressureValue : pressure)
		{
			totalPres = totalPres + pressureValue;
			if(pressureValue < min)
			{
				min = pressureValue;
			}
			if(pressureValue> max)
			{
				max = pressureValue;
			}
		}
		average[1] = (int)(totalPres/((double)(pressure.length)));
		minValues[1] = min;
		maxValues[1] = max;
		
		//Wind Speed
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for(int windspeedValue : windspeed)
		{
			totalPres = totalPres + windspeedValue;
			if(windspeedValue < min)
			{
				min = windspeedValue;
			}
			if(windspeedValue> max)
			{
				max = windspeedValue;
			}
		}
		average[2] = (int)(totalPres/((double)(windspeed.length)));
		minValues[2] = min;
		maxValues[2] = max;
		
		
		
		

		// --------------
		// Neat Output
		// --------------
		index = 0;
		System.out.println();
		System.out.println("                          Hurricanes 1980 - 2006");
		System.out.println();
		System.out.println("    Year     Hurricane   Category   Pressure(mb)   Wind Speed(kts)");
		System.out.println("  ===================================================================");
		for (String name : hurcName)
		{
			System.out.printf("    %4s      %-9s %5d %13d %14d \n", year[index], name, category[index], pressure[index], windspeed[index]);
			index++;
		}

		System.out.println("  ===================================================================");
		System.out.printf ("               Average: %5d %13d %14d \n", average[0], average[1], average[2]);
		System.out.printf ("               Maximum: %5d %13d %14d \n", maxValues[0], maxValues[1], maxValues[2]);
		System.out.printf ("               Minimum: %5d %13d %14d \n", minValues[0], minValues[1], minValues[2]);
	    System.out.println();
	    index = 0;
	    for(int myValue : categoryTotals)
	    {
	    	System.out.println("    Number of Category " + (index+1) + "s: " + myValue);
	    	index++;
	    }
	
	}
}
