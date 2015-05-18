package Module13._04OverridingClasses;

/**
 * @author Christopher Pybus
 * @date Jan 28, 2012
 * @file Rectangle.java
 * @package Module13._01ExtendingClasses
 * 
 * @purpose 
 */

public class Rectangle
{
	// instance variables 
	private int length;
	private int width;

	public Rectangle(int l, int w)
	{
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "Rectangle - " + length + " X " + width;
	}
	
	public String equals(Rectangle r)
	{
		if(getLength() == r.getLength() && getWidth() == r.getWidth())
		{
			return toString() + " is the same size as " + r.toString();
		}
		else
		{
			return toString() + " is NOT the same size as " + r.toString();
		}
	}
	   
}