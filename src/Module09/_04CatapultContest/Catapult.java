package Module09._04CatapultContest;

/**
 * @author Christopher Pybus
 * @date Dec 26, 2011
 * @file Catapult.java
 * @package Module9._04CatapultContest
 * 
 * @purpose 
 */

public class Catapult
{
	
	Catapult()
	{
		
	}
	
	public double calcRange(int MPH, int angle)
	{
		double range = ((MPH * MPH) * (2 * (Math.sin(Math.toRadians(angle))))) / (9.8);
		return range;
	}
}
