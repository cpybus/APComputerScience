package Module13._06GridWorldPart2;

import info.gridworld.actor.Bug;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file SpiralBug.java
 * @package Module13._06GridWorldPart2
 * 
 * @purpose 
 */

public class SpiralBug extends Bug
{
	int sideLength;
	int steps = 0;
	
	public SpiralBug(int firstLength)
	{
		sideLength = firstLength;
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
			turn();
			steps = 0;
			sideLength++;
		}
	}
}
