package Module13._02ClassHierarchies;

/**
 * @author Christopher Pybus
 * @date Feb 18, 2012
 * @file Mountains.java
 * @package Module13._02ClassHierarchies
 * 
 * @purpose 
 */

public class Mountains extends Terrain
{
	private int NumOfMountains;
	
	public Mountains(int l, int w, int mountains)
	{
		super(l, w);
		NumOfMountains = mountains;
	}

	
	public int getMountains()
	{
		return NumOfMountains;
	}
}
