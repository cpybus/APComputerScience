package Module07._04StaticMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Name: Christopher Pybus
 * Date: Nov 23, 2011
 * File: GravityV1.java
 * Package: Module7._04StaticMethods
 * 
 * Purpose: 
 */

public class GravityV1
{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		String[] Planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };
		int[] PDiameter = { 4880, 12104, 12756, 6794, 142984, 120536, 51118, 49532, 2274 };
		double[] PMass = { (3.30 * Math.pow(10, 23)), (4.87 * Math.pow(10, 24)), (5.97 * Math.pow(10, 24)), (6.42 * Math.pow(10, 23)), (1.90 * Math.pow(10, 27)), (5.68 * Math.pow(10, 26)), (8.68 * Math.pow(10, 25)), (10.24 * Math.pow(10, 25)), (1.25 * Math.pow(10, 22)) };
		double[] Gravity = calculateGravity(PDiameter, PMass);
		double[] PercentGravity = calculatePercentGravity(Gravity);
		printOut(Planets, PDiameter, PMass, Gravity, PercentGravity);
		writeOut("gravity1.txt", PercentGravity);
	}
	
	public static void printOut(String[] planets, int[] diameter, double[] mass, double[] gravity, double[] percentG)
	{
		System.out.println("                              Planetary Data                              ");
		System.out.println("  Planet   Diameter(km)  Mass(kg)  Gravity(m/s^2)  Gravity(% of Earth's)  ");
		System.out.println("--------------------------------------------------------------------------");
		for(int index = 0; index<planets.length; index++)
		{
			System.out.printf("  %-10s %6d %13.2e %10.2f %11.2f \n", planets[index], diameter[index], mass[index], gravity[index], percentG[index]);
		}
	}
	
	// Finds Gravity of planet.
	public static double[] calculateGravity(int[] diameter, double[]mass)
	{
		double[] gravity = new double[mass.length];
		double radius = 0;
		for (int index = 0; index<mass.length; index++)
		{
			radius = (diameter[index]*1000)/2.0;
			gravity[index] = ((6.67*Math.pow(10, -11))*(mass[index]))/((double)radius*(double)radius);
			
		}
		return gravity;
	}
	
	//Finds % of planet's gravity compared to earth. (ie. Mercury's gravity is .38% of earth's)
	public static double[] calculatePercentGravity(double[] gravity)
	{
		double[] percentGravity = new double[gravity.length];
		for (int index = 0; index<gravity.length; index++)
		{
			percentGravity[index] = (gravity[index]/9.81);
		}
		return percentGravity;
		
	}
	
	public static void writeOut(String fileName, double[] gravity) throws FileNotFoundException
	{
		PrintWriter outFile = new PrintWriter(new File(fileName));
		for (double myValue : gravity)
		{
			outFile.printf("%-1.2f \n", myValue);
		}
		outFile.close(); // close the file when finished
	}
}
