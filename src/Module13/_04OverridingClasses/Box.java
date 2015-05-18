package Module13._04OverridingClasses;

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
	
	public String toString()
	{
	    return "Box - " + getLength() + " X " + getWidth() + " X " + height;
	}
	
	public String equals(Box b)
	{
		if(getLength() == b.getLength() && getWidth() == b.getWidth() && getHeight() == b.getHeight())
		{
			return toString() + " is the same size as " + b.toString();
		}
		else
		{
			return toString() + " is NOT the same size as " + b.toString();
		}
	}

}
