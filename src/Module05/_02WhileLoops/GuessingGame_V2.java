
package Module05._02WhileLoops;

import java.util.Scanner;

/**
 * @author Chris
 * @version Nov 4, 2011
 * @packageName Module5._02WhileLoops
 * @fileName GuessingGame_V2.java
 * 
 * @purpose
 * 
 */
public class GuessingGame_V2
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String start;
		String guess;
		int numGuess = 0;
		int numOfGuesses = 1;
		int lowNum;
		int highNum;
		int randomNum;
		double randomDouble;

		System.out.println("Hello, today we're going to be playing a guessing game. ");
		System.out.println("If you just can't figure out a number, just type \"end\"");
		System.out.print("When you're ready to start, type \"start\" ");
		start = in.nextLine();
		while (!start.equalsIgnoreCase("start"))
		{
			System.out.print("Try Again: ");
			start = in.nextLine();
		}

		System.out.println();
		System.out.println("Now, you get to pick the range of numbers (i.e. 130 - 170)");
		System.out.print("Pick your low number: ");
		lowNum = in.nextInt();
		System.out.print("Pick your high number: ");
		highNum = in.nextInt();
		while (highNum <= lowNum)
		{
			if (highNum == lowNum)
			{
				System.out.println("Your high number cannot equal your low number.");
			}
			if (highNum < lowNum)
			{
				System.out.println("Your high number cannot be smaller than your low number.");
			}
			System.out.print("Pick your high number: ");
			highNum = in.nextInt();
		}
		System.out.println();
		randomDouble = Math.random();
		randomDouble = (randomDouble * (highNum-lowNum + 1));
		randomNum = (int)(randomDouble+lowNum);
		while (!(randomNum >= lowNum));

		do
		{
			System.out.print("Guess #" + numOfGuesses + ": ");
			guess = in.next();
			if (guess.equalsIgnoreCase("end"))
			{
				System.out.println();
				System.out.println("Sorry you had to stop...");
				System.out.println("The number was: " + randomNum);
				break;
			}
			numGuess = Integer.parseInt(guess);

			if (numGuess < lowNum)
			{
				System.out.println("Sorry, that number was out of the range. Try again. (This guess wont be counted.)");
			}
			else if (numGuess > highNum)
			{
				System.out.println("Sorry, that number was out of the range. Try again. (This guess wont be counted.)");
			}
			else if (numGuess > randomNum)
			{
				System.out.println("Sorry, that was too high");
				numOfGuesses++;
			}
			else if (numGuess < randomNum)
			{
				System.out.println("Sorry, that was too low");
				numOfGuesses++;
			}
			else if (numGuess == randomNum)
			{
				break;
			}
			else
			{
				System.out.println("Error.");
			}

			
		}
		while (numGuess != randomNum);
		System.out.println();
		System.out.println("Congratulations!!");
		System.out.println("Total Number Of Guesses: " + numOfGuesses);
	}
}
