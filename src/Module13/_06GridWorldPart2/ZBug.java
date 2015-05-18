package Module13._06GridWorldPart2;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file ZBug.java
 * @package Module13._06GridWorldPart2
 * 
 * @purpose 
 */

public class ZBug extends Bug
{
	
	private int sideLength; 
	private int steps; 
	private int piece;  
	
	public ZBug(int length)
	{
		setDirection(Location.EAST);
		steps = 0;
		piece = 1;
		sideLength = length;
	}
	
	public void act()
	{
		if (piece <= 3 && steps < sideLength)
		{
			if (canMove())
			{
				move();
				steps++;
			}
		}
		else if (piece == 1)
		{
			setDirection(Location.SOUTHWEST);
			steps = 0;
			piece++;
		}
		else if (piece == 2)
		{
			setDirection(Location.EAST);
			steps = 0;
			piece++;
		}
	}
}
