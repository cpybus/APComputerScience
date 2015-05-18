package Module13._06GridWorldPart2;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file BoxBug.java
 * @package Module13._06GridWorldPart2
 * 
 * @purpose 
 */


public class BoxBug extends Bug
{
	
    int sideLength;
	int steps = 0;
	Location loc1 = new Location(4,3);
	Location loc2 = new Location(3,3);
	Location loc3 = loc2.getAdjacentLocation(Location.SOUTH);
	
	
	public BoxBug(int length)
	{
		sideLength = length;
	}
	
	public void act()
	{
		System.out.println(loc1.getDirectionToward(new Location(6,5)));
		if (steps < sideLength && canMove())
		{
			move();
			steps++;
		}
		else
		{
			turn();
			turn();
			steps = 0;
		}
	}
}
