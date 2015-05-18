package Module08._10ArrayLists;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Dec 11, 2011
 * @file CO2FromElectricity.java
 * @package Module8._10ArrayLists
 * 
 * @purpose 
 */

public class CO2FromElectricity
{
	/**
     * Default constructor to create an object from the CO2FromElectricity class.  
     */
	public CO2FromElectricity()
	{
		
	}
	
	/**
     * A mutator method that calculates the average annual electricity bill
     * @param monthlyBill - an Arraylist containing the monthly bills for home electricity use.  
     * @return The average monthly electricity bill
     */
	public double calcAverageBill(ArrayList<Double> monthlyBill)
	{
		double avgBill = 0;
		double total = 0;
		for(double myValue : monthlyBill)
		{
			total += myValue;
		}
		avgBill = total/monthlyBill.size();
		return avgBill;
	}
	
	/**
     * A mutator method that calculates the average annual price of electricity. 
     * @param monthlyPrice - an Arraylist containing the monthly price of electricity per kilowatthour.    
     * @return The average monthly price of electricity
     */
	public double calcAveragePrice(ArrayList<Double> monthlyPrice)
	{
		double avgPrice = 0;
		double total = 0;
		for(double myValue : monthlyPrice)
		{
			total += myValue;
		}
		avgPrice = total/monthlyPrice.size();
		return avgPrice;
	}
	
	/**
     * A mutator method that calculates the annual home CO2 emission from electricity.  
     * @param avgBill - The average monthly home electricity bill.
     * @param avgPrice - The average monthly price of home electricity.
     * @return The annual home CO2 emission from home electricity use
     */
	public double calcElectrictyCO2(double avgBill, double avgPrice)
	{
		double emissions;
		emissions = (avgBill/avgPrice) * 1.37 * 12;
		return emissions;
	}
	
}
