package Module13._04OverridingClasses;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file TestNew.java
 * @package Module13._04OverridingClasses
 * 
 * @purpose 
 */

public class TestNew
{
	
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(5, 20);
		Box b1 = new Box(4,4,4);
		Box b2 = new Box(4,10,4);
		Cube c = new Cube(4);
		
		System.out.println(r.toString());
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(c.toString());
		System.out.println();
		System.out.println(b1.equals(c));
		System.out.println(b2.equals(c));
	}
	
}
