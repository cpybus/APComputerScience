package Module08._08ArrayOfObjects;

/**
 * Name: Christopher Pybus
 * Date: Dec 4, 2011
 * File: AnnualFuelUse.java
 * Package: Module8._08ArrayOfObjects
 * 
 * Purpose: 
 */

public class AnnualFuelUse
{
	
	private int		sMiles;
	private int		eMiles;
	private double	gallsUsed;
	private int		dayCount;
	private double	PPG;
	private int		distance;
	private double	MPG;
	private double	totalCost;
	private int		dayNumber;
	
	AnnualFuelUse(int fillUpNum, int startMiles, int endMiles, double gallonsUsed,
			int dayNum, double pricePerGallon)
	{
		dayNumber = fillUpNum;
		sMiles = startMiles;
		eMiles = endMiles;
		gallsUsed = gallonsUsed;
		dayCount = dayNum;
		PPG = pricePerGallon;
	}
	
	public int calcDistance()
	{
		distance = eMiles - sMiles;
		return distance;
	}
	
	public double calcMPG()
	{
		MPG = distance / gallsUsed;
		return MPG;
	}
	
	public double calcCost()
	{
		totalCost = PPG * gallsUsed;
		return totalCost;
	}
	
	public void printOut()
	{
		System.out.printf("  %3d %6d %8d %11d %7d %12.2f %9.2f %6.2f %7.2f \n", dayNumber, dayCount, sMiles, eMiles, distance, gallsUsed, MPG, PPG, totalCost);
	}
}
