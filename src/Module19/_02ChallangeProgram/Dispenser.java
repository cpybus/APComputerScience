package Module19._02ChallangeProgram;

/**
 * @author Christopher Pybus
 * @date May 5, 2012
 * @file Dispenser.java
 * @package Module19._02ChallangeProgram
 * 
 * @purpose 
 */

public class Dispenser
{
	
	int numberOfItems;
	int cost;
	
	public Dispenser(int numberOfItems, int cost)
	{
		if (numberOfItems < 0 || cost < 0)
			throw new RuntimeException("Invalid values for numberOfItems and/or cost");
		else
		{
			this.numberOfItems = numberOfItems;
			this.cost = cost;
		}
	}
	
	public Dispenser()
	{
		this.numberOfItems = 50;
		this.cost = 50;
	}
	
	public int getCount()
	{
		return numberOfItems;
	}
	
	public void makeSale()
	{
		this.numberOfItems--;
	}
	
	public int getProductCost()
	{
		return cost;
	}
	
	
}
