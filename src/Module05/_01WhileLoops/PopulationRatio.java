package Module05._01WhileLoops;

import java.util.Scanner;

/**
 * @author Chris
 * @version Oct 30, 2011
 * @packageName Module5._01WhileLoops
 * @fileName PopulationRatio.java
 *
 * @purpose
 *
 */
public class PopulationRatio
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numOfIterations = 0;
		int numOfMales = 0;
		int numOfFemales = 0;
		int randomNumber;
		int index = 1;
		
		System.out.println("Hello, today we will be working with");
		System.out.println("population ratios (Male/Female)");
		System.out.print("Iterations: ");
		numOfIterations = in.nextInt();
		System.out.println();
		while(index <= numOfIterations)
		{
			randomNumber = (int)(Math.random()*10);
			if(randomNumber<5)
			{
				System.out.println("Iteration #" + index + ": Male (" + randomNumber + ")");
				numOfMales++;
			}
			else if(randomNumber>=5)
			{
				System.out.println("Iteration #" + index + ": Female (" + randomNumber + ")");
				numOfFemales++;
			}
			else
			{
				System.out.println("Error.");
			}
			index++;
		}
		System.out.println();
		System.out.println("Out Of " + numOfIterations + " Iterations...");
		System.out.println(numOfMales + " Were Male");
		System.out.println(numOfFemales + " Were Female");

	}

}
