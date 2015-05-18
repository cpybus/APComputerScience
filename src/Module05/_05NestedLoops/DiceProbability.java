
package Module05._05NestedLoops;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Chris
 * @version Nov 5, 2011
 * @packageName Module5._05NestedLoops
 * @fileName DiceProbability.java
 * 
 * @purpose
 * 
 */
public class DiceProbability
{

	public static void main(String[] args)
	{
		// Declare and initialize variables and objects
		Scanner in = new Scanner(System.in);
		Random randomGenerator = new Random();

		int[] sums; // Number of times sum of dice matches the current sum
		int die1, die2; // Random generated numbers
		int rolls;
		int sidesOnDie;
		int possibleSums = 0;
		int sumOfDie;
		int counter;

		// Input: ask user for number of rolls and number of sides on a die
		System.out.println("Hello, today we're going to be throwing dice. ");
		System.out.print("How many rolls would you like to make?: ");
		rolls = in.nextInt();
		System.out.print("How many sides are on each die?: ");
		sidesOnDie = in.nextInt();

		possibleSums = sidesOnDie * 2;
		sums = new int[possibleSums];

		// Print heading for output table
		System.out.println("Number of rolls: " + rolls);
		System.out.println(" Sum | Probability(%) | # Of Times");

		
		for (int index = 0; index < rolls; index++)
		{
			die1 = randomGenerator.nextInt(sidesOnDie) + 1;
			die2 = randomGenerator.nextInt(sidesOnDie) + 1;
			sumOfDie = die1 + die2;
			counter = sums[sumOfDie - 1];
			sums[sumOfDie - 1] = counter + 1;
		}
		
		for (int index = 1; index<sums.length; index++) {
			 
			//double gah = sums[index]/((double)rolls/100);
			double gah = (sums[index]/(double)(rolls))*100.0;
			gah = (double)(((int)(gah*100))/100.0);
			String num = "" + gah;
			String count = "" + (index+1);
			String sum = "" + sums[index];
		    System.out.printf("%3s  | %9s      | %7s \n", count, num, sum );
		    
		} 
		System.out.println(); 
		

	}

}
