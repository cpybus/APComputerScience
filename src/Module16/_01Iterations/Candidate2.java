package Module16._01Iterations;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file Candidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class Candidate2
{
	private String name;
	private int numVotes;
	
	public Candidate2(String name, int numVotes)
	{
		this.name = name;
		this.numVotes = numVotes;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getVotes()
	{
		return numVotes;
	}
	
	public String toString()
	{
		return name + " received " + numVotes + " votes.";
	}
}
