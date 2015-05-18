package Module13._04OverridingClasses;

/**
 * @author Christopher Pybus
 * @date Jan 28, 2012
 * @file Cube.java
 * @package Module13._01ExtendingClasses
 * 
 * @purpose 
 */

public class Cube extends Box
{
	
	public Cube(int l)
	{
		super(l, l, l);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
	    return "Cube - " + getLength() + " X " + getHeight() + " X " + getWidth();
	}


}
