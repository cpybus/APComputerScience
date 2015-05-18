
package Module05._04ForLoops;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Chris
 * @version Nov 5, 2011
 * @packageName Module5._04ForLoops
 * @fileName Lottery.java
 * 
 * @purpose
 * 
 */
public class Lottery
{
	public static void main(String[] args)
	{
		// declare and initialized variables and objects
		Random randomGenerator = new Random();
		Scanner in = new Scanner(System.in);

		
		String userGuess = "";
		String playAgain = "";
		int randomNum;
		do
		{
			String lotteryNum = "";
			for (int index = 0; index < 3; index++)
			{
				randomNum = randomGenerator.nextInt(10);
				lotteryNum = lotteryNum + "" + randomNum;
			}
			System.out.println("For program testing purposes only, the lotto number is... " + lotteryNum);
			System.out.println("");
			System.out.println("================Pybus Lotto================");
			System.out.println("");
			System.out.print("Please enter your three numbers (ie 456): ");
			userGuess = in.next();
			if (userGuess.equalsIgnoreCase(lotteryNum))
			{
				System.out.println("Winner: " + lotteryNum);
				System.out.println("Congratulations! You got guessed all three correct!");
			}
			else if ((userGuess.substring(0, 2)).equals(lotteryNum.substring(0, 2)))
			{
				System.out.println("Winner: " + lotteryNum);
				System.out.println("Congratulations! You got guessed the first two correct!");
			}
			else if ((userGuess.substring(1, 3)).equals(lotteryNum.substring(1, 3)))
			{
				System.out.println("Winner: " + lotteryNum);
				System.out.println("Congratulations! You got guessed the last two correct!");
			}
			else
			{
				System.out.println("Winner: " + lotteryNum);
				System.out.println("Sorry, you didnt guess any of them correctly. ");
			}
			System.out.println("");
			System.out.print("Play Again? (yes/no): ");
			playAgain = in.next();
			System.out.println("");
		}
		while (playAgain.equalsIgnoreCase("yes"));
	}
}
