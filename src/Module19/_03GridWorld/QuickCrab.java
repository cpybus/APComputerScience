package Module19._03GridWorld;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date May 5, 2012
 * @file CrabCritter.java
 * @package Module19._03GridWorld
 * 
 * @purpose 
 */

public class QuickCrab extends CrabCritter
{	
	public QuickCrab()
	{
		setColor(Color.BLUE);
	}
	
	private void MoveTwo(ArrayList<Location> locs, int dir)
	{
		Grid grid = getGrid();
		Location loc = getLocation();
		Location temp = loc.getAdjacentLocation(dir);
		
		if (grid.isValid(temp) && grid.get(temp) == null)
		{
			Location loc2 = temp.getAdjacentLocation(dir);
			if (grid.isValid(loc2) && grid.get(loc2) == null)
				locs.add(loc2);
		}
	}
	
	public ArrayList<Location> getMoveLocations()
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		
		MoveTwo(locs, getDirection() + Location.LEFT);
		MoveTwo(locs, getDirection() + Location.RIGHT);
		if (locs.size() == 0)
			return super.getMoveLocations();
		return locs;
	}
	
	
	
}
