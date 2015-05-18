package Module13._02ClassHierarchies;

/**
 * @author Christopher Pybus
 * @date Feb 18, 2012
 * @file Forest.java
 * @package Module13._02ClassHierarchies
 * 
 * @purpose 
 */

public class Forest extends Terrain
{
	private int numOfTrees;
	
	public Forest(int l, int w, int trees)
	{
		super(l, w);
		numOfTrees = trees;
	}
	
	public int getTrees()
	{
		return numOfTrees;
	}
}
