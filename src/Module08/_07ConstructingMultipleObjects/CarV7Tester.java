package Module08._07ConstructingMultipleObjects;

/**
 * Name: Christopher Pybus
 * Date: Nov 27, 2011
 * File: CarV7Tester.java
 * Package: Module8._07ConstructingMultipleObjects
 * 
 * Purpose: 
 */

public class CarV7Tester
{
	
	public static void main(String[] args)
	{
		int distanceDriven = 350;
		
		System.out.println("                                     Gas Mileage Calculations                                  ");
		System.out.println("         Car        StartMiles  EndMiles  Distance  Gallons  Price   Cost    Miles/Gal  Gal/Mile");
		System.out.println("=================================================================================================");
		
		CarV7 car1 = new CarV7("\'12 Ford F-150", 34832, 32182, 26.88, 2.50);
		double GPM1 = car1.calcGPM(distanceDriven);
		double cost1 = car1.totalCost();
		double MPG1 = car1.calcMPG(distanceDriven);
		car1.printOut(cost1, distanceDriven, MPG1, GPM1);
		
		CarV7 car2 = new CarV7("\'06 Honda Oddessy", 44000, 44350, 18.48, 2.50);
		double GPM2 = car2.calcGPM(distanceDriven);
		double cost2 = car2.totalCost();
		double MPG2 = car2.calcMPG(distanceDriven);
		car2.printOut(cost2, distanceDriven, MPG2, GPM2);
		
		CarV7 car3 = new CarV7("\'12 Toyota Prius", 24474, 24854, 8.4, 2.50);
		double GPM3 = car3.calcGPM(distanceDriven);
		double cost3 = car3.totalCost();
		double MPG3 = car3.calcMPG(distanceDriven);
		car3.printOut(cost3, distanceDriven, MPG3, GPM3);
		
		
		
	}
	
}
