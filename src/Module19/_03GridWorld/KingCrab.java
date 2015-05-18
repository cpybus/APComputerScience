package Module19._03GridWorld;

/**
 * @author Christopher Pybus
 * @date May 6, 2012
 * @file KingCrab.java
 * @package Module19._03GridWorld
 * 
 * @purpose 
 */

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;


public class KingCrab extends CrabCritter
{
	
	public KingCrab()
	{
		setColor(Color.RED);
	}
	
	public void processActors(ArrayList<Actor> actors)
	{
		for (Actor a : actors)
		{
			if (!moveOneMoreAway(a))
				a.removeSelfFromGrid();
		}
	}
	
	public int distanceFrom(Location l1, Location l2)
	{
		double dist = Math.sqrt((l1.getRow() - l2.getRow()) * (l1.getRow() - l2.getRow()) + (l1.getCol() - l2.getCol()) * (l1.getCol() - l2.getCol())) + .5;
		return (int) Math.floor(dist);
	}
	
	private boolean moveOneMoreAway(Actor a)
	{
		ArrayList<Location> locs = getGrid().getEmptyAdjacentLocations(a.getLocation());
		
		for (Location loc : locs)
		{
			if (distanceFrom(getLocation(), loc) > 1)
			{
				a.moveTo(loc);
				return true;
			}
		}
		return false;
	}
	
	
}