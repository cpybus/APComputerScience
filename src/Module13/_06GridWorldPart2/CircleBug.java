package Module13._06GridWorldPart2;

import info.gridworld.actor.Bug;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file CircleBug.java
 * @package Module13._06GridWorldPart2
 * 
 * @purpose 
 */

public class CircleBug extends Bug
{
	
    int sideLength;
	int steps = 0;
	
	public CircleBug(int length)
	{
		sideLength = length;
	}
	
	public void act()
	{
		
		if (steps < sideLength && canMove())
		{
			move();
			steps++;
		}
		else
		{
			turn();
			steps = 0;
		}
	}
}
