package Module17._05ChallengeProgram;

/**
 * @author Christopher Pybus
 * @date Apr 10, 2012
 * @file Item.java
 * @package Module17._05ChallengeProgram
 * 
 * @purpose 
 */

public class Item
{
	String itemID;
	String itemName;
	int inStore;
	double Price;
	
	public Item(String itemID, String itemName, int inStore, double Price)
	{
		this.itemID = itemID;
		this.itemName = itemName;
		this.inStore = inStore;
		this.Price = Price;
		
	}

	public String getItemID()
	{
		return itemID;
	}
	
	public void setItemID(String itemID)
	{
		this.itemID = itemID;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public int getInStore()
	{
		return inStore;
	}
	
	public void setInStore(int inStore)
	{
		this.inStore = inStore;
	}
	
	public double getPrice()
	{
		return Price;
	}
	
	public void setPrice(double price)
	{
		Price = price;
	}

	@Override
	public String toString()
	{
		return String.format("%-8s%-15s%-8d$%6.2f ", itemID, itemName, inStore, Price);
	}
	
	
	
}
