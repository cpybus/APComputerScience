
package Module05._02WhileLoops;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Chris
 * @version Nov 4, 2011
 * @packageName Module5._02WhileLoops
 * @fileName GuessingGame_V1.java
 * 
 * @purpose is to make a guessing game using Math.random and while loops.
 * 
 */
public class GuessingGame_V1
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String start;
		int randomNumber;
		int guess;
		int numOfGuesses = 1;
		Random randomGenerator = new Random();

		System.out.println("Hello, today we're going to be playing a guessing game. ");
		System.out.print("When you're ready to start, type \"start\" ");
		do
		{
			start = in.nextLine();
		}
		while (!start.equalsIgnoreCase("start"));
		System.out.println();
		randomNumber = randomGenerator.nextInt(101);
		System.out.println("Ok, I've Picked a number between 1 and 100");
		do
		{
			System.out.print("Guess #" + numOfGuesses + ": ");
			guess = in.nextInt();
			if(guess > randomNumber)
			{
				System.out.println("Sorry, that was too high");
				numOfGuesses++;
			}
			else if(guess < randomNumber)
			{
				System.out.println("Sorry, that was too low");
				numOfGuesses++;
			}
			else if(guess == randomNumber)
			{
				System.out.println("Congradulations!!");
				System.out.println("Total Number Of Guesses: " + numOfGuesses);
			}
			else
			{
				System.out.println("Error.");
			}
			System.out.println();
		}while(guess != randomNumber);

	}
}
