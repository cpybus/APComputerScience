package Module16._01Iterations;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate2.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate2
{
	public static void main(String[] args)
	{
		ArrayList<Candidate2> election = new ArrayList<Candidate2>();
		election.add(new Candidate2("John Smith", 5000));
		election.add(new Candidate2("Mary Miller", 4000));
		election.add(new Candidate2("Michael Duffy", 6000));
		election.add(new Candidate2("John Smith", 2500));
		election.add(new Candidate2("Joe Ashtony", 1800));
		
		System.out.println("Results per Candidate2: \n\n");
		
		printVotes(election);
		printResults(election);
	}
	
	public static void printVotes(ArrayList<Candidate2> candidates)
	{
		for(Candidate2 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(ArrayList<Candidate2> candidates)
	{
		int total = 0;
		for(Candidate2 can : candidates)
		{
			total += can.getVotes();
		}
		return total;
	}
	
	public static void printResults(ArrayList<Candidate2> candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate2          Votes Received       % of Total Votes");
		for(Candidate2 can : candidates)
		{
			System.out.printf("%-18s %-20d %-15.1f \n", can.getName(), can.getVotes(), ((((double)can.getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes);
	}
}
