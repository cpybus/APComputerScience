package Module13._05ChallengeProject;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file BinItem.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

public class BinItem
{
	
	private String mySKU;
	private int myQuantity;
	
	public BinItem(String sku, int quantity)
	{
		mySKU = sku;
		myQuantity = quantity;
	}
	
	public String getSKU()
	{
		return mySKU;
	}
	
	public int getQuantity()
	{
		return myQuantity;
	}
	
	public String toString()
	{
		return "SKU " + getSKU() + ": " + getQuantity();
	}
}
