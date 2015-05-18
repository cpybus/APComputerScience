package Module08._07ConstructingMultipleObjects;

/**
 * Name: Christopher Pybus
 * Date: Nov 27, 2011
 * File: CarV5.java
 * Package: Module8._05ConstructorsWithParameters
 * 
 * Purpose: 
 */

public class CarV7
{
	
	String	carModel;
	int		eMiles;
	int		sMiles;
	double	gallons;
	double	PPG;
	
	public CarV7(String carType, int endMiles, int startMiles, double gallonsUsed, double pricePerGallon)
	{
		carModel = carType;
		eMiles = endMiles;
		sMiles = startMiles;
		gallons = gallonsUsed;
		PPG = pricePerGallon;
	}
	
	public double calcGPM(int dist)
	{
		double GPM = gallons / dist;
		return GPM;
		
	}
	
	public double calcMPG(int dist)
	{
		double MPG = dist / gallons;
		return MPG;
	}
	
	public double totalCost()
	{
		double totalCost = PPG * gallons;
		return totalCost;
	}
	
	public void printOut(double totalCost, int dist, double MPG, double GPM)
	{
		
		System.out.printf("%18s %8d %10d %8d %10.2f %7.2f %7.2f %9.2f %10.3f \n", carModel, sMiles, eMiles, dist, gallons, PPG, totalCost, MPG, GPM);
	}
}
