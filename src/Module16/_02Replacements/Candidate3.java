package Module16._02Replacements;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file Candidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class Candidate3
{
	private String name;
	private int numVotes;
	
	public Candidate3(String name, int numVotes)
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
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setVotes(int numVotes)
	{
		this.numVotes = numVotes;
	}
	
	public String toString()
	{
		return name + " received " + numVotes + " votes.";
	}
}
