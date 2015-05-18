package Module08._03DefaultConstructors;

/**
 * Name: Christopher Pybus 
 * Date: Nov 20, 2011 
 * File: CarV3.java 
 * 
 * Purpose:
 */

public class CarV3
{
	
	// ----------------
	//  MAIN METHOD
	// ----------------
	public static void main(String[] args)
	{
		String type = "HondaOdyssey06";
		
		int sMiles1 = 43755;
		int sMiles2 = 44000;
		int sMiles3 = 44309;
		int sMiles4 = 44605;
		int sMiles5 = 44871;
		
		int eMiles1 = 44000;
		int eMiles2 = 44309;
		int eMiles3 = 44605;
		int eMiles4 = 44871;
		int eMiles5 = 45144;
		
		double gals1 = 16.75;
		double gals2 = 18.00;
		double gals3 = 16.30;
		double gals4 = 18.00;
		double gals5 = 17.00;
		
		Calculations car = new Calculations();
		
		int distance1 = car.calcDistance(sMiles1, eMiles1);
		int distance2 = car.calcDistance(sMiles2, eMiles2);
		int distance3 = car.calcDistance(sMiles3, eMiles3);
		int distance4 = car.calcDistance(sMiles4, eMiles4);
		int distance5 = car.calcDistance(sMiles5, eMiles5);
		
		double MPG1 = car.calcMPG(distance1, gals1);
		double MPG2 = car.calcMPG(distance2, gals2);
		double MPG3 = car.calcMPG(distance3, gals3);
		double MPG4 = car.calcMPG(distance4, gals4);
		double MPG5 = car.calcMPG(distance5, gals5);
		
		System.out.println("                            Gas Mileage Calculations                            ");
		System.out.println("===============================================================================");
		System.out.println("  Type of Car    Start Miles    End Miles    Distance    Gallons    Miles/Gal");
		System.out.printf (" %-15s %8d %13d %10d %12.2f %11.2f \n", type, sMiles1, eMiles1, distance1, gals1, MPG1);
		System.out.printf (" %-15s %8d %13d %10d %12.2f %11.2f\n", type, sMiles2, eMiles2, distance2, gals2, MPG2);
		System.out.printf (" %-15s %8d %13d %10d %12.2f %11.2f\n", type, sMiles3, eMiles3, distance3, gals3, MPG3);
		System.out.printf (" %-15s %8d %13d %10d %12.2f %11.2f\n", type, sMiles4, eMiles4, distance4, gals4, MPG4);
		System.out.printf (" %-15s %8d %13d %10d %12.2f %11.2f\n", type, sMiles1, eMiles5, distance5, gals5, MPG5);
	}
}

class Calculations
{
	Calculations()
	{
		
	}
	
	public int calcDistance(int sMiles, int eMiles)
	{
		int distance = 0;
		distance = eMiles-sMiles;
		return distance;
	}
	
	public double calcMPG(int distance, double gals)
	{
		double MPG = 0;
		MPG = distance/gals;
		return MPG;
	}
}


