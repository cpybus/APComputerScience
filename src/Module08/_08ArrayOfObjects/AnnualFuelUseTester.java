package Module08._08ArrayOfObjects;

/**
 * Name: Christopher Pybus
 * Date: Dec 4, 2011
 * File: AnnualFuelUseTester.java
 * Package: Module8._08ArrayOfObjects
 * 
 * Purpose: 
 */

public class AnnualFuelUseTester
{	
	public static void main(String[] args)
	{
		int[] sMiles = { 43755, 44000, 44309, 44605, 44871 };
		int[] eMiles = { 44000, 44309, 44605, 44871, 45144 };
		double[] gallons = { 16.75, 18.00, 16.30, 18.00, 17.00 };
		double[] price = { 2.75, 3.02, 2.54, 2.85, 3.23 };
		int[] days = { 1, 8, 15, 21, 31 };
		int[] distance = new int[days.length];
		double[] MPG = new double[days.length];
		double[] totalCostArray = new double[days.length];
		
		System.out.println("Array Objects - Car FillUps");
		System.out.println("");
		System.out.println(" FillUp# Days StartMiles  EndMiles  Distance  GallonsUsed   MPG   Price    Cost");
		System.out.println("--------------------------------------------------------------------------------");
		AnnualFuelUse[] fillUps = new AnnualFuelUse[sMiles.length];
		
		for (int index = 0; index < sMiles.length; index++)
		{
			fillUps[index] = new AnnualFuelUse(index + 1, sMiles[index], eMiles[index], gallons[index], days[index], price[index]);
			distance[index] = fillUps[index].calcDistance();
			MPG[index] = fillUps[index].calcMPG();
			totalCostArray[index] = fillUps[index].calcCost();
			fillUps[index].printOut();
		}
		
		int maxDist = Integer.MIN_VALUE;
		int minDist = Integer.MAX_VALUE;
		int totalDist = 0;
		double annualDist;
		double totalGallons = 0;
		double maxMPG = Double.MIN_VALUE;
		double minMPG = Double.MAX_VALUE;
		double annualGallons;
		double totalMPG = 0;
		double annualMPG;
		double maxPrice = Double.MIN_VALUE;
		double minPrice = Double.MAX_VALUE;
		double totalCosts = 0;
		double annualCosts;
		for(int index = 0; index<5; index++)
		{
			//DISTANCE STUFF
			int distValue = distance[index];
			if (distance[index] > maxDist)
			{
				maxDist = distValue;
			}
			if (distValue < minDist)
			{
				minDist = distValue;
			}
			totalDist = totalDist + distValue;
			
			//GALLONS STUFF
			double gallValue = gallons[index];
			totalGallons = totalGallons + gallValue;
			
			//MPG STUFF
			double MPGValue = MPG[index];
			totalMPG = totalMPG + MPGValue;
			if (MPGValue > maxMPG)
			{
				maxMPG = MPGValue;
			}
			if (MPGValue < minMPG)
			{
				minMPG = MPGValue;
			}
			
			//PRICE STUFF
			double priceValue = price[index];
			if (priceValue > maxPrice)
			{
				maxPrice = priceValue;
			}
			if (priceValue < minPrice)
			{
				minPrice = priceValue;
			}
			
			//COST STUFF
			double costValue = totalCostArray[index];
				totalCosts = totalCosts + costValue;
		}
		annualDist = totalDist * (365.0 / days[4]);
		annualGallons = totalGallons * (365.0 / days[4]);
		annualMPG = totalMPG / MPG.length;
		annualCosts = totalCosts * (365.0 / days[4]);
		
		System.out.println();
		System.out.printf("Minimums: %31d %22.2f %6.2f \n", minDist, minMPG, minPrice);
		System.out.printf("Maximums: %31d %22.2f %6.2f \n", maxDist, maxMPG, maxPrice);
		System.out.println();
		System.out.printf("Totals:   %31d %12.2f %24.2f \n", totalDist, totalGallons, totalCosts);
		System.out.printf("AnnualProjections: %22.0f %12.2f %9.2f %14.2f", annualDist, annualGallons, annualMPG, annualCosts);
	}
	
}
