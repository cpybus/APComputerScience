package Module13._02ClassHierarchies;

/**
 * @author Christopher Pybus
 * @date Feb 18, 2012
 * @file WinterMountains.java
 * @package Module13._02ClassHierarchies
 * 
 * @purpose 
 */

public class WinterMountains extends Mountains
{
	private int temperature; 

	public WinterMountains(int l, int w, int mountains, int temp)
	{
		super(l, w, mountains);
		temperature = temp;
	}
	
	public int getTemperature()
	{
		return temperature;
	}
	
}
