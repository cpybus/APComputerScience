package Module13._01ExtendingClasses;

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
	   
}