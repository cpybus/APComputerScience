
package Module05._07ChallangeProgram;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Chris
 * @version Nov 8, 2011
 * @packageName Module5._07ChallangeProgram
 * @fileName Passwords.java
 * 
 * @purpose
 * 
 */
public class Passwords
{

	public static void main(String[] args)
	{
		// ==============
		// Variables
		// ==============
		Random randomGenerator = new Random();
		Scanner in = new Scanner(System.in);
		int userSelection;
		int passwordLength;
		int randomChar;

		int stuff;

		String password = "";

		// ==============
		// Intro and Menu
		// ==============
		System.out.println("             Chris' Password Generator             ");
		System.out.println("===================================================");
		System.out.println(" Please Select One Of The Below:                   ");
		System.out.println(" [1] Only Lowercase Letters ");
		System.out.println(" [2] Lowercase and Uppercase Letters ");
		System.out.println(" [3] Lowercase, Uppercaser, and Numbers ");
		System.out.println(" [4] Lowercase, Uppercaser, Numbers, and Puntuation ");
		System.out.println(" [5] Quit ");
		System.out.println("===================================================");

		// ==============
		// User Input
		// ==============
		System.out.print("Please Enter Your Selection (1-5): ");
		userSelection = in.nextInt();
		System.out.println();

		System.out.print("Please Enter Desired Passworld Length (1-20): ");
		passwordLength = in.nextInt();
		System.out.println();

		// ==============
		// Calculations
		// ==============
		if (userSelection == 1)
		{
			for (int index = 0; index < passwordLength; index++)
			{
				randomChar = randomGenerator.nextInt(26) + 97;
				password = password + (char) (randomChar);

			}
		}
		else if (userSelection == 2)
		{
			for (int index = 0; index < passwordLength; index++)
			{
				stuff = randomGenerator.nextInt(2);
				if (stuff == 0)
				{
					randomChar = randomGenerator.nextInt(26) + 97;
					password = password + (char) (randomChar);
				}
				else if (stuff == 1)
				{
					randomChar = randomGenerator.nextInt(26) + 65;
					password = password + (char) (randomChar);
				}
			}
		}
		else if (userSelection == 3)
		{
			for (int index = 0; index < passwordLength; index++)
			{
				stuff = randomGenerator.nextInt(3);
				if (stuff == 0)
				{
					randomChar = randomGenerator.nextInt(26) + 97;
					password = password + (char) (randomChar);
				}
				else if (stuff == 1)
				{
					randomChar = randomGenerator.nextInt(26) + 65;
					password = password + (char) (randomChar);
				}
				else if (stuff == 2)
				{
					randomChar = randomGenerator.nextInt(9) + 48;
					password = password + (char) (randomChar);
				}
			}
		}
		else if (userSelection == 4)
		{
			for (int index = 0; index < passwordLength; index++)
			{
				stuff = randomGenerator.nextInt(4);
				if (stuff == 0)
				{
					randomChar = randomGenerator.nextInt(26) + 97;
					password = password + (char) (randomChar);
				}
				else if (stuff == 1)
				{
					randomChar = randomGenerator.nextInt(26) + 65;
					password = password + (char) (randomChar);
				}
				else if (stuff == 2)
				{
					randomChar = randomGenerator.nextInt(9) + 48;
					password = password + (char) (randomChar);
				}
				else if (stuff == 3)
				{
					randomChar = randomGenerator.nextInt(17) + 41;
					password = password + (char) (randomChar);
				}
			}
		}
		else if (userSelection == 5)
		{
			System.out.println("Bye!");
		}
		else
		{
			System.out.println("You entered a wrong value. Sorry. ");
		}

		// ==============
		// Output
		// =============='
		if (password != null)
		{
			System.out.println("Your Password: " + password);
		}

	}
}
