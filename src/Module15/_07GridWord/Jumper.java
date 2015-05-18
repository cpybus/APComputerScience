package Module15._07GridWord;


import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file JumperTester.java
 * @package Module15._07GridWord
 * 
 * @purpose 
 */

public class Jumper extends Actor
{
	
	public Jumper()
	{
		setColor(Color.BLUE);
	}
	
	public Jumper(Color JumperColor)
	{
		setColor(JumperColor);
	}
	
	public void jump()
	{
		Grid<Actor> grid = getGrid();
		if (grid == null)
		{
			return;
		}
		Location loction = getLocation();
		Location next = loction.getAdjacentLocation(getDirection());
		Location twoAway = next.getAdjacentLocation(getDirection());
		
		if (grid.isValid(twoAway))
		{
			moveTo(twoAway);
		}
		else
		{
			removeSelfFromGrid();
		}
	}
	
	public void turn()
	{
		setDirection(getDirection() + 45);
	}
		
	public boolean canJump()
	{
		Grid<Actor> grid = getGrid();
		
		if (grid == null)
		{
			return false;
		}
		
		Location location = getLocation();
		Location next = location.getAdjacentLocation(getDirection());
		
		if (!grid.isValid(next))
		{
			return false;
		}
		
		Actor actor = grid.get(next);
		
		if (!((actor == null) || (actor instanceof Flower) || (actor instanceof Rock)))
		{
			return false;
		}
		
		Location twoAway = next.getAdjacentLocation(getDirection());
		
		if (!grid.isValid(twoAway))
		{
			return false;
		}
		actor = grid.get(twoAway);
		return (actor == null) || (actor instanceof Flower);
	}
	
	public void act()
	{
		if (canJump())
		{
			jump();
		}
		else
		{
			turn();
		}
	}
	
	
}
