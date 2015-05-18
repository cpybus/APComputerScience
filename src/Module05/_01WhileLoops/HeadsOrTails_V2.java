
package Module05._01WhileLoops;

import java.util.Scanner;

/**
 * @author Chris
 * @version Oct 30, 2011
 * @packageName Module5._01WhileLoops
 * @fileName HeadsOrTails_V2.java
 * 
 * @purpose
 * 
 */
public class HeadsOrTails_V2
{

	public static void main(String[] args)
	{
		String answer;
		Scanner in = new Scanner(System.in);
		do
		{
			int numOfFlips = 0;
			int numOfHeads = 0;
			int numOfTails = 0;
			int randomNumber;
			int index = 1;
						
			System.out.println("Hello, today we will be flipping coins.");
			System.out.println("Please enter how many times you want to");
			System.out.print("flip the coin: ");
			numOfFlips = in.nextInt();
			System.out.println();
			while (index <= numOfFlips)
			{
				randomNumber = (int) (Math.random() * 10);
				if (randomNumber < 7)
				{
					System.out.println("Flip #" + index + ": Heads (" + randomNumber + ")");
					numOfHeads++;
				}
				else if (randomNumber >= 7)
				{
					System.out.println("Flip #" + index + ": Tails (" + randomNumber + ")");
					numOfTails++;
				}
				else
				{
					System.out.println("Error.");
				}
				index++;
			}
			System.out.println();
			System.out.println("Out Of " + numOfFlips + " Flips...");
			System.out.println(numOfHeads + " Were Heads");
			System.out.println(numOfTails + " Were Tails");
			System.out.println();
			System.out.print("(yes/no) Run it again? ");
			answer = in.next();
		}
		while (answer.equalsIgnoreCase("yes"));
	}

}
