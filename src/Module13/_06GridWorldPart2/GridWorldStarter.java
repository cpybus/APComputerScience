package Module13._06GridWorldPart2;

import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file BoxBug.java
 * @package Module13._06GridWorldPart2
 * 
 * @purpose 
 */

public class GridWorldStarter
{
    public static void main(String[] args)
    {
        int[] turns = {2,2,1,3,5,2,7,2,5}; 
        
    	UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld(grid);
        BoxBug dave = new BoxBug(5);
        CircleBug harry = new CircleBug(2);
        SpiralBug chris = new SpiralBug(3);
        ZBug cole = new ZBug(4);
        DancingBug nicole = new DancingBug(turns); 
        
        
        dave.setColor(Color.YELLOW);
        harry.setColor(Color.GREEN);
        chris.setColor(Color.BLUE);
        cole.setColor(Color.MAGENTA);
        nicole.setColor(Color.ORANGE); 
        
        world.add(new Location(8, 2), dave);
        world.add(new Location(8, 17), harry);
        world.add(new Location(31,3), chris);
        world.add(new Location(25,25), cole);
        world.add(new Location(15, 29), nicole);
        world.show();
        
    }
}
