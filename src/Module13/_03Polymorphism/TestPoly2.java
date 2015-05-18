package Module13._03Polymorphism;


import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Feb 19, 2012
 * @file TestPoly2.java
 * @package Module13._03Polymorphism
 * 
 * @purpose 
 */

public class TestPoly2
{
	
	public static void main(String[] args)
	{
		ArrayList<Circle2> circles = new ArrayList<Circle2>();
		circles.add(new Circle2(2,4,6));
		circles.add(new Cylinder2(3,4,5,6));
		circles.add(new Oval2(2,3,4,5));
		circles.add(new OvalCylinder2(2,3,4,5,6));
		
		for(Circle2 cir : circles)
		{
			showCenter(cir);
		}
	}
	
	public static void  showCenter(Circle2 c)
	{
		System.out.println(c.getClass().getSimpleName() + " has a center at " + c.getCenter());
	}
}
