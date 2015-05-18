package Module15._05ChallengeProgram;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file Tool.java
 * @package Module15._05ChallengeProgram
 * 
 * @purpose 
 */

public class Tool implements Product, Comparable<Tool>
{
	
	String name;
	double cost;
	
	Tool(String name, double cost)
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
	
	@Override
	public int compareTo(Tool o)
	{
		if (cost < o.cost)
			return -1;
		else if (cost == o.cost)
			return 0;
		else
			return 1;
	}
	
}
