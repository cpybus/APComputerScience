package Module15._07GridWord;


import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file JumperTester.java
 * @package Module15._07GridWord
 * 
 * @purpose 
 */

public class JumperTester
{
	
	public static void main(String[] args)
	{
		ActorWorld w = new ActorWorld();
		w.add(new Jumper());
		w.add(new Flower());
		w.add(new Bug());
		w.add(new Rock());
		w.show();
	}
}
