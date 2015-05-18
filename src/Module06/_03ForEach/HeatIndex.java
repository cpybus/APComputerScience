
package Module06._03ForEach;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @version Nov 12, 2011
 * @packageName Module6._03ForEach
 * @fileName HeatIndex.java
 * 
 * @purpose
 * 
 */
public class HeatIndex
{

	public static void main(String[] args) throws IOException
	{
		String token = "";
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		int[] humid = new int[12];
		double[] temp = new double[12];
		double[] heatIndex = new double[12];
		int index = 0;
		File KeyWestHumid = new File("KeyWestHumid.txt");
		File KeyWestTemp = new File("KeyWestTemp.txt");
		PrintWriter outFile = new PrintWriter(new File("HeatIndex.txt"));

		// Key West Temperature
		Scanner temperature = new Scanner(KeyWestTemp);
		while (temperature.hasNext())
		{
			token = temperature.next();
			temp[index] = Double.parseDouble(token);
			index++;
		}
		temperature.close();

		
		// Key West Humid
		index = 0;
		Scanner humidity = new Scanner(KeyWestHumid);
		while (humidity.hasNext())
		{
			token = humidity.next();
			humid[index] = Integer.parseInt(token);
			index++;
		}
		humidity.close();
		
		index = 0;
		int R = 0;
		for(double T : temp)
		{
			if(T >= 80)
			{
				R = humid[index];
				heatIndex[index] =  -42.379 + (2.04901523 * T) + (10.14333127 * R) - (0.22475541 * T * R) - ((6.83783*Math.pow(10,-3)) * (T*T)) - ((5.481717*Math.pow(10,-2)) * (R*R)) + ((1.22874*Math.pow(10,-3)) * (T*T) * R) + ((8.5282*Math.pow(10,-4)) * T * (R*R)) - ((1.99*Math.pow(10,-6)) * (T*T) * (R*R));
				heatIndex[index] = Double.valueOf(twoDForm.format(heatIndex[index]));
			}
			else
			{
				heatIndex[index] = T;
			}
			index++;
		}
		System.out.println("                                 Heat Index Key West Florida                                ");
		System.out.println("");
		System.out.println("                                             Months                            ");
		System.out.println("                  Jan    Feb    Mar    Apr    May    Jun    Jul    Aug    Sep    Oct    Nov    Dec  ");
		System.out.println("****************************************************************************************************");
		System.out.print("      Temp (F)");
		
		outFile.println("                                 Heat Index Key West Florida                                ");
		outFile.println("");
		outFile.println("                                             Months                            ");
		outFile.println("                  Jan    Feb    Mar    Apr    May    Jun    Jul    Aug    Sep    Oct    Nov    Dec  ");
		outFile.println("****************************************************************************************************");
		outFile.print("      Temp (F)");
		
		for(index = 0; index<temp.length; index++)
		{
			System.out.printf("%7s", temp[index]);
			outFile.printf("%7s", temp[index]);
		}
		System.out.print("\n  Humidity (%)");
		outFile.println();
		outFile.print("  Humidity (%)");
		for(index = 0; index<humid.length; index++)
		{
			System.out.printf("%7s", humid[index]);
			outFile.printf("%7s", humid[index]);
		}
	
		System.out.print("\nHeat Index (F)");
		outFile.println();
		outFile.print("Heat Index (F)");
		for(index = 0; index<heatIndex.length; index++)
		{
			System.out.printf("%7s", heatIndex[index]);
			outFile.printf("%7s", heatIndex[index]);
		}
		outFile.close();
		
		
	}

}
