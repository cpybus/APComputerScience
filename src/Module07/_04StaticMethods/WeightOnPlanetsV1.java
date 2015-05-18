package Module07._04StaticMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Christopher Pybus
 * @version Nov 19, 2011
 * @packageName Module7._04StaticMethods
 * @fileName WeightOnPlanetsV1.java
 * 
 * @purpose
 * 
 */
public class WeightOnPlanetsV1
{
	
	// ----------------
	// MAIN
	// ----------------
	public static void main(String[] args) throws IOException // Executes all the other methods.
	{
		Scanner in = new Scanner(System.in);
		double[] PlanetGravity;
		double[] MyWeights;
		String[] Planets =
		{ "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };
		System.out.print("Please enter your weight (lbs): ");
		int weight = in.nextInt();
		System.out.println();
		PlanetGravity = readFile("gravity1.txt");
		MyWeights = calculations(weight, PlanetGravity);
		PrintOut(Planets, PlanetGravity, MyWeights);
		WriteOutFile("Gravity.txt", Planets, PlanetGravity, MyWeights);
	}
	
	// ----------------
	// OTHER METHODS
	// ----------------
	public static void PrintOut(String[] planets, double[] gravity, double[] weight) // Method to print the results out into the console/terminal window.
	{
		int[] index =
		{ 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("         My Weight on the Planets       ");
		System.out.println("   Planet        Gravity     Weight(lbs)");
		System.out.println("----------------------------------------");
		for (int myValue : index)
		{
			System.out.printf("   %-9s %10.2f %13.2f \n", planets[myValue], gravity[myValue], weight[myValue]);
		}
	}
	
	public static double[] readFile(String fileName) throws FileNotFoundException // Reads the file to get the planets' gravity.
	{
		double[] gravityArray = new double[9];
		String token = "";
		File file = new File(fileName);
		int index = 0;
		Scanner inFile = new Scanner(file);
		
		while (inFile.hasNext())
		{
			token = inFile.next();
			gravityArray[index] = Double.parseDouble(token);
			index++;
		}
		inFile.close();
		
		return gravityArray;
	}
	
	public static double[] calculations(int weight, double[] gravity) // Makes all the calculations.
	{
		double mass = weight * 433.59237;
		double[] weightOnPlanets = new double[9];
		int index = 0;
		for (double gravityVariable : gravity)
		{
			weightOnPlanets[index] = (mass * gravityVariable) / 433.59237;
			index++;
		}
		return weightOnPlanets;
	}
	
	public static void WriteOutFile(String fileName, String[] planets, double[] gravity, double[] weight) throws FileNotFoundException // Writes out the final table to a .txt document.
	{
		PrintWriter outFile = new PrintWriter(new File(fileName));
		int[] index = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		outFile.println("         My Weight on the Planets       ");
		outFile.println("   Planet        Gravity     Weight(lbs)");
		outFile.println("----------------------------------------");
		for (int myValue : index)
		{
			outFile.printf("   %-9s %10.2f %13.2f ", planets[myValue], gravity[myValue], weight[myValue]);
			outFile.println();
		}
		
		outFile.close(); // close the file when finished
	}
	
}
