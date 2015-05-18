package Module15._05ChallengeProgram;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file Vehicle.java
 * @package Module15._05ChallengeProgram
 * 
 * @purpose 
 */

public abstract class Vehicle implements Product
{
	String name;
	double cost;
	
	Vehicle(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public double getCost()
	{
		return cost;
	}
	
}
