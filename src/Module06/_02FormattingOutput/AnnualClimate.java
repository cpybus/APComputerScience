
package Module06._02FormattingOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Chris
 * @version Nov 9, 2011
 * @packageName Module6._02FormattingOutput
 * @fileName AnnualClimate1.java
 * 
 * @purpose
 * 
 */
public class AnnualClimate
{

	public static void main(String[] args)
	{
		//=============
		// Variables
		//=============
		Scanner in = new Scanner(System.in);
		String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		double[] StartingTemperatures = { 51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7 };
		double[] StartingPrecipitation = { 5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1 };
		
		double[] FinalTemperatures = new double[StartingTemperatures.length];
		double[] FinalPrecipitation = new double[StartingPrecipitation.length];
		DecimalFormat oneDForm = new DecimalFormat("#.#");
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		double sumTemp = 0;
		double sumPerc = 0;
		double avgTemp = 0;
		double annualPerc = 0;
		String FahOrCel = "F";
		String InchOrCen = "In.";
		
		//=============
		// User Input
		//=============
		System.out.print("Choose the temperature scale (F = Fahrenhiet, C = Celcisus):  ");
		FahOrCel = in.next();
		
		System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
		InchOrCen = in.next();
		
		System.out.println("");
		System.out.println("");

		//=============
		// Calculations
		//=============
		
		if(FahOrCel.equalsIgnoreCase("F") || FahOrCel.equalsIgnoreCase("Fahrenhiet"))
		{
			FahOrCel = "F";
			for (int index = 0; index < StartingTemperatures.length; index++)
			{
				FinalTemperatures[index] = StartingTemperatures[index];
			}
		}
		else if(FahOrCel.equalsIgnoreCase("C") || FahOrCel.equalsIgnoreCase("Celsius"))
		{
			FahOrCel = "C";
			for (int index = 0; index < StartingTemperatures.length; index++)
			{
				double temporaryValue = (StartingTemperatures[index] - 32)*(double)(5.0/9.0);
				temporaryValue = Double.valueOf(oneDForm.format(temporaryValue));
				FinalTemperatures[index] = temporaryValue;
			}
		}
		else
		{
			System.out.println("Im Sorry, but " + FahOrCel + " was not a valid choice. ");
			System.out.println("Using Fahrenhiet for tempurature values. ");
			System.out.println();
			FahOrCel = "F";
			for (int index = 0; index < StartingTemperatures.length; index++)
			{
				FinalTemperatures[index] = StartingTemperatures[index];
			}
		}
		
		if(InchOrCen.equalsIgnoreCase("I") || InchOrCen.equalsIgnoreCase("Inches"))
		{
			InchOrCen = "In";
			for (int index = 0; index < StartingPrecipitation.length; index++)
			{
				FinalPrecipitation[index] = StartingPrecipitation[index];
			}
		}
		else if(InchOrCen.equalsIgnoreCase("C") || InchOrCen.equalsIgnoreCase("Centimeters"))
		{
			InchOrCen = "cm";
			for (int index = 0; index < StartingPrecipitation.length; index++)
			{
				double temporaryValue = (StartingPrecipitation[index] * 2.54);
				temporaryValue = Double.valueOf(twoDForm.format(temporaryValue));
				FinalPrecipitation[index] = temporaryValue;
			}
		}
		else
		{
			System.out.println("Im Sorry, but " + InchOrCen + " was not a valid choice. ");
			System.out.println("Using Inches for Precipitation values. ");
			System.out.println();
			InchOrCen = "In";
			for (int index = 0; index < StartingPrecipitation.length; index++)
			{
				FinalPrecipitation[index] = StartingPrecipitation[index];
			}
		}
		
			
		for (int index = 0; index < FinalTemperatures.length; index++)
		{
			sumTemp = sumTemp + FinalTemperatures[index];
			sumPerc = sumPerc + FinalPrecipitation[index];
		}
		avgTemp = sumTemp / FinalTemperatures.length;
		avgTemp = Double.valueOf(twoDForm.format(avgTemp));
		for (int index = 0; index < FinalPrecipitation.length; index++)
		{
			annualPerc = annualPerc + FinalPrecipitation[index];
		}
		annualPerc = Double.valueOf(twoDForm.format(annualPerc));

		//=============
		// Outputs
		//=============
		System.out.println("                     Climate Data              ");
		System.out.println("                Tallahassee, Florida. ");
		System.out.println(""); 
		System.out.println("     Month   Temperature (" + FahOrCel + ")   Percipitation (" + InchOrCen + ") ");
		System.out.println("   *************************************************");
		for (int index = 0; index < FinalTemperatures.length; index++)
		{
			System.out.printf("   %6s %12.1f %17.2f \n", months[index], FinalTemperatures[index], FinalPrecipitation[index]);
			
		}
		System.out.println("   *************************************************");
		System.out.println("");
		System.out.printf("        Average: %5s    Annual: %6s", Double.toString(avgTemp), Double.toString(annualPerc));
	}
	
	
	

}
