package Module07._06StaticMethods;

import java.util.Random;
import java.util.Scanner;

/**
 * Name: Christopher Pybus
 * Date: Nov 24, 2011
 * File: Darts.java
 * Package: Module7._06StaticMethods
 * 
 * Purpose: 
 */

public class Darts
{
	
	//----------------
	// MAIN METHOD
	//----------------
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How Many Darts/Trial?: ");
		int numOfDarts = in.nextInt();
		System.out.print("How Many Trials?: ");
		int numOfTrials = in.nextInt();
		double[] trials = trials(numOfDarts, numOfTrials);
		printOut(trials);
	}
	
	//----------------
	// OTHER METHODS
	//----------------
	public static double[] trials(int dartsPerTrial, int numOfTrials)
	{
		double[] trials = new double[numOfTrials];
		Random randomGenerator = new Random();
		for (int index = 0; index < numOfTrials; index++)
		{
			int hits = 0;
			//int misses = 0;
			for (int i = 0; i < dartsPerTrial; i++)
			{
				int x = randomGenerator.nextInt(10000001)-5000000;
				int y = randomGenerator.nextInt(10000001)-5000000;
				//System.out.println(x + ", " + y);
				double distance = Math.sqrt(Math.pow((x-0),2) + Math.pow((y-0), 2));
				if (distance <= 5000000)
				{
					hits++;
				}
				else
				{
					//misses++;
				}
			}
			trials[index] = 4 * ((double)hits / (double)dartsPerTrial);
		}
		
		return trials;
		
	}
	
	public static void printOut(double[] trials)
	{
		double total = 0;
	    for(double myValue : trials)
		{
			total += myValue; 
		}
	    double avg = total/(double)trials.length;
		for(int index = 0; index<trials.length; index++)
		{
			System.out.printf("%10s %-10.4f \n", ("Trial #" + (index+1) + ":"), trials[index]);
		}
		System.out.printf("  Average: %-10.4f ", avg);
	}
}
