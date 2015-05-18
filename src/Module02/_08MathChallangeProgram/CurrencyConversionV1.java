package Module02._08MathChallangeProgram;

/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another countyr given the current
 * exchange rate.
 * 
 * 
 * ©CSA/FLVS 2011
 * 
 * @author Maria Vieta Jacquard
 * @version 06/01/11
 * 
 *          ------------------------ Modified by: Chris Pybus Date: 09/07/2011
 *          ------------------------
 */

public class CurrencyConversionV1
{
	
	public static void main(String[] args)
	{
		double startingUSD = 5000.00;
		double remainingUSD;
		
		// Mexico
		double pesoSpent = 7210.25;
		double pesoExchangeRate = 12.52110;
		double dollarsSpentInMexico;
		
		// Japan
		double yenSpent = 99939.75;
		double yenExchangeRate = 77.31110;
		double dollarsSpentInJapan;
		
		// France
		double euroSpent = 624.95;
		double euroExchangeRate = 0.711238;
		double dollarsSpentInFrance;
		
		// purpose of program
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("This program converts an amount of money");
		System.out.println("from a specific country into the equivalent");
		System.out.println("currency of another country given the current");
		System.out.println("exchange rate.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		System.out.println("Starting US Dollars:    $ " + startingUSD);
		
		// convert US dollars to Mexican pesos
		dollarsSpentInMexico = pesoSpent / pesoExchangeRate;
		remainingUSD = startingUSD - dollarsSpentInMexico;
		System.out.println("Mexico---");
		System.out.println("  Pesos Exchange Rate:  $ " + pesoExchangeRate + " For $1");
		System.out.println("  Pesos Spent:          $ " + pesoSpent);
		System.out.println("  USD Equivalent:       $ " + dollarsSpentInMexico);
		System.out.println("  USD Remaining:        $ " + remainingUSD);
		System.out.println();
		
		// convert Mexican pesos to Japanese yen
		dollarsSpentInJapan = yenSpent / yenExchangeRate;
		remainingUSD = remainingUSD - dollarsSpentInJapan;
		System.out.println("Japan---");
		System.out.println("  Yen Exchange Rate:    ¥ " + yenExchangeRate + " For $1");
		System.out.println("  Yen Spent:            ¥ " + yenSpent);
		System.out.println("  USD Equivalent:       $ " + dollarsSpentInJapan);
		System.out.println("  USD Remaining:        $ " + remainingUSD);
		System.out.println();
		
		// convert Japanese yen to Euros
		dollarsSpentInFrance = euroSpent / euroExchangeRate;
		remainingUSD = remainingUSD - dollarsSpentInFrance;
		System.out.println("France---");
		System.out.println("  Euro Exchange Rate:   € " + euroExchangeRate + " For $1");
		System.out.println("  Euros Spent:          € " + euroSpent);
		System.out.println("  USD Equivalent:       $ " + dollarsSpentInFrance);
		System.out.println("  USD Remaining:        $ " + remainingUSD);
		System.out.println();
		
		// print output to the screen
		System.out.println("Final US Dollars Remaining: " + remainingUSD);
		
		// Complete the code below. Replace the 0's for totalItem and
		// fundsRemaining
		// with the proper calculations. Casting, integer division and the
		// modulus
		// operator are needed. Do not worry about extra decimal places for the
		// dollar amounts.
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// Calculations for Souvenir #1
		int costItem1 = 4;  						// cost per item of first souvenir
		int budget1 = 50;   						// budget for first item
		int totalItem1 = (int) (budget1 / costItem1); 		// how many items can be
														// purchased
		int price1 = totalItem1 * costItem1;
		int fundsRemaining1 = budget1 - price1;  // how much of the budget is
												// left
		
		System.out.println();
		System.out.println("Item 1---");
		System.out.println("   Cost per item: $" + costItem1);
		System.out.println("   Budget: $" + budget1);
		System.out.println("   Total items purchased: " + totalItem1);
		System.out.println("   Funds remaining: $" + fundsRemaining1);
		System.out.println();
		
		// Calculations for Souvenir #2
		double costItem2 = 32.55;  						// cost per item of second souvenir
		int budget2 = 713;   							// budget for second item
		int totalItem2 = (int) (budget2 / costItem2); 	// how many items can be
														// purchased
		double price2 = totalItem2 * costItem2;
		double fundsRemaining2 = budget2 - price2;  	       // how much of the budget is
													// left
		
		System.out.println("Item 2---");
		System.out.println("   Cost per item: $" + costItem2);
		System.out.println("   Budget: $" + budget2);
		System.out.println("   Total items purchased: " + totalItem2);
		System.out.println("   Funds remaining: $" + fundsRemaining2);
		
	} // end of main method
} // end of class
