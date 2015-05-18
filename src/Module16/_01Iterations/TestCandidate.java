package Module16._01Iterations;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate
{
	public static void main(String[] args)
	{
		Candidate[] election = {new Candidate("John Smith", 5000), 
				new Candidate("Mary Miller", 4000),
				new Candidate("Michael Duffy", 6000),
				new Candidate("John Smith", 2500),
				new Candidate("Joe Ashtony", 1800)};
		
		System.out.println("Results per Candidate: \n\n");
		
		printVotes(election);
		printResults(election);
	}
	
	public static void printVotes(Candidate[] candidates)
	{
		for(Candidate can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(Candidate[] candidates)
	{
		int total = 0;
		for(Candidate can : candidates)
		{
			total += can.getVotes();
		}
		return total;
	}
	
	public static void printResults(Candidate[] candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(Candidate can : candidates)
		{
			System.out.printf("%-18s %-20d %-15.1f \n", can.getName(), can.getVotes(), ((((double)can.getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes);
	}
}
