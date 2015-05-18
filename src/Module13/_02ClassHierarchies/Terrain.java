package Module13._02ClassHierarchies;

/**
 * Blank terrain.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */

public class Terrain
{
	// instance variables 
	private int length, width;

	/**
	 * Constructor for objects of class terrain
	 */
	public Terrain(int l, int w)
	{
		length = l;
		width = w;
	}


	public String terrainSize()
	{
		return "has dimensions of " + length + " X " + width;
	}
}
