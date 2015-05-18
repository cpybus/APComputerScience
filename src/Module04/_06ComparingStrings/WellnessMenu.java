package Module04._06ComparingStrings;

/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @ChristopherPybus  
 * @10/23/11
 * 
 */
import java.util.Scanner;

public class WellnessMenu
{
	public static void main(String[] args)
	{
		String userChoice;
		Scanner in = new Scanner(System.in);

		System.out.println("Please select one of the following options from the menu for more information.");
		System.out.println();
		System.out.println("Select a letter corresponding to a menu option.");
		do
		{
			System.out.println("[A] BMI");
			System.out.println("[B] BMR");
			System.out.println("[C] Healthy Eating");
			System.out.println("[D] Food Pyramid");
			System.out.println("[E] Fitness Training");
			System.out.println("[F] To Exit.");
			System.out.println();
			System.out.print("Choice: ");
			userChoice = in.next();
			System.out.println();

			if (userChoice.equalsIgnoreCase("A"))
			{
				System.out.println("-------------BMI-------------");
				System.out.println("|   You chose \"A\" for BMI   |");
				System.out.println("-----------------------------");
				System.out.println();
				System.out.println("=======================================================");
				System.out.println();
				System.out.println("Here, try a different letter...");
			}
			else if (userChoice.equalsIgnoreCase("B"))
			{
				System.out.println("-------------BMR-------------");
				System.out.println("|   You chose \"B\" for BMR   |");
				System.out.println("-----------------------------");
				System.out.println();
				System.out.println("=======================================================");
				System.out.println();
				System.out.println("Here, try a different letter...");
			}
			else if (userChoice.equalsIgnoreCase("C"))
			{
				System.out.println("-------------Healthy Eating-------------");
				System.out.println("|   You chose \"C\" for Healthy Eating   |");
				System.out.println("----------------------------------------");
				System.out.println();
				System.out.println("=======================================================");
				System.out.println();
				System.out.println("Here, try a different letter...");
			}
			else if (userChoice.equalsIgnoreCase("D"))
			{
				System.out.println("-------------Food Pyramid-------------");
				System.out.println("|   You chose \"C\" for Food Pyramid   |");
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println("=======================================================");
				System.out.println();
				System.out.println("Here, try a different letter...");
			}
			else if (userChoice.equalsIgnoreCase("E"))
			{
				System.out.println("-------------Fitness Training-------------");
				System.out.println("|   You chose \"C\" for Fitness Training   |");
				System.out.println("------------------------------------------");
				System.out.println();
				System.out.println("=======================================================");
				System.out.println();
				System.out.println("Here, try a different letter...");
			}
			else if (userChoice.equalsIgnoreCase("F"))
			{
				System.out.println("Thank you, and goodbye.");
			}
			else
			{
				System.out.println("Im sorry, but \"" + userChoice + "\" is not a valid choice.");
				System.out.println();
				System.out.println("=======================================================");
				System.out.println();
				System.out.println("Here, try a different letter...");
			}
		}
		while (!userChoice.equalsIgnoreCase("F"));

	}
}