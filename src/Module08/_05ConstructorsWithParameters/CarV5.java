package Module08._05ConstructorsWithParameters;

/**
 * Name: Christopher Pybus
 * Date: Nov 25, 2011
 * File: CarV5.java
 * Package: Module8._05ConstructorsWithParameters
 * 
 * Purpose: 
 */

public class CarV5
{
	
	String	carModel1;
	int		eMiles1;
	int		sMiles1;
	double	gallons1;
	double	PPG1;
	
	public CarV5(String carType1, int endMiles1, int startMiles1, double gallonsUsed1, double pricePerGallon1)
	{
		carModel1 = carType1;
		eMiles1 = endMiles1;
		sMiles1 = startMiles1;
		gallons1 = gallonsUsed1;
		PPG1 = pricePerGallon1;
	}
	
	public static void main(String[] args)
	{
		CarV5 car1 = new CarV5("Honda Oddessy06", 44000, 43755, 16.75, 2.74);
		//double GPM = car1.calcGPM(358);
		double cost = car1.totalCost();
		double MPG = car1.calcMPG(358);
		car1.printOut(cost, 358, MPG, MPG);
		
	}
	
	public double calcGPM(int dist)
	{
		double GPM = gallons1 / dist;
		return GPM;
		
	}
	
	public double calcMPG(int dist)
	{
		double MPG = dist / gallons1;
		return MPG;
	}
	
	public double totalCost()
	{
		double totalCost = PPG1 * gallons1;
		return totalCost;
	}
	
	public void printOut(double totalCost, int dist, double MPG, double GPM)
	{
		System.out.println("                                     Gas Mileage Calculations                                  ");
		System.out.println("       Car        StartMiles  EndMiles  Distance  Gallons  Price   Cost    Miles/Gal  Gal/Mile");
		System.out.println("=================================================================================================");
		System.out.printf("%10s %9d %10d %8d %10.2f %7.2f %7.2f %8.2f %10.2f", carModel1, sMiles1, eMiles1, dist, gallons1, PPG1, totalCost, MPG, GPM);
	}
}
