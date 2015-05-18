package Module13._01ExtendingClasses;

/**
 * @author Christopher Pybus
 * @date Jan 28, 2012
 * @file Box.java
 * @package Module13._01ExtendingClasses
 * 
 * @purpose 
 */

public class Box extends Rectangle
{
	private int height;

	public Box(int l, int w, int h)
	{
		super(l, w);
	    height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}

}
