package Module08._10ArrayLists;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Dec 11, 2011
 * @file C02FromElectricityMain.java
 * @package Module8._10ArrayLists
 * 
 * @purpose 
 */

public class C02FromElectricityMain
{
	
	public static void main(String[] args)
	{
		ArrayList<Double> monthlyBill = new ArrayList<Double>();
		monthlyBill.add(88.94);
		monthlyBill.add(86.43);
		monthlyBill.add(87.61);
		monthlyBill.add(89.97);
		ArrayList<Double> monthlyPrice = new ArrayList<Double>();
		monthlyPrice.add(.1457);
		monthlyPrice.add(.1475);
		monthlyPrice.add(.1487);
		monthlyPrice.add(.1465);
		double averageBill;
		double averagePrice;
		double emissions;
		
		CO2FromElectricity co2 = new CO2FromElectricity();
		averageBill = co2.calcAverageBill(monthlyBill);
		averagePrice = co2.calcAveragePrice(monthlyPrice);
		emissions = co2.calcElectrictyCO2(averageBill, averagePrice);
		
		System.out.println("      _____________");
		System.out.println("_____/  Emissions  \\_____________________________________________");
		System.out.printf("| Average Monthly Electricty Bill ($): %-24.2f | \n", averageBill);
		System.out.printf("| Average Monthly Electricty Price ($): %-23.4f | \n", averagePrice);
		System.out.printf("| Annual CO2 Emissions from Electricty Usage (lbs): %-11.2f | \n", emissions);
		System.out.println("|_______________________________________________________________|");
	}
	
}
