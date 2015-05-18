package Module19._03GridWorld;

import info.gridworld.actor.ActorWorld;
import Module15._07GridWord.Jumper;

/**
 * @author Christopher Pybus
 * @date May 5, 2012
 * @file Tester.java
 * @package Module19._03GridWorld
 * 
 * @purpose 
 */

public class Tester
{
	
	public static void main(String[] args)
	{
		ActorWorld w = new ActorWorld();
		w.add(new QuickCrab());
		w.add(new KingCrab());
		w.show();
	}
	
}
