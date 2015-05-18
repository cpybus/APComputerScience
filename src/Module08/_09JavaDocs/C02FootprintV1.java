package Module08._09JavaDocs;

/**
 * @author ChristopherPybus
 * @version Dec 10, 2011
 * @file C01FootprintV1Main.java
 * @package Module8._09JavaDocs
 * 
 * Purpose: 
 */

public class C02FootprintV1
{
	private double myGallonsUsed;
	private double myTonsC02;
	private double myPoundsC02;
	
	/**
     * Default constructor for ojbects of type ShapesV9
     */
	C02FootprintV1(double gals)
	{
		myGallonsUsed = gals;
	}
	
	/**
     * Calculates how many tons of C02 are produced 
     */
	public void calcTons()
	{
		myTonsC02 = (.00878 * myGallonsUsed);
	}
	
	/**
     * Calculates how many pounds of C02 are produced 
     */
	public void calcPounds()
	{
		double tons = (.00878 * myGallonsUsed);
		myPoundsC02 = 2204.62262 * tons;
	}
	
	/**
     * Returns the tons of C02 produced
     * @return double TonsC02
     */
	public double getTonsC02()
	{
		return myTonsC02;
	}
	
	/**
     * Returns the pounds of C02 produced
     * @return double PoundsC02
     */
	public double getPounds()
	{
		return myPoundsC02;
	}
}
