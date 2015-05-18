package Module16._04Deletions;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate7
{
	public static void main(String[] args)
	{
		Candidate7[] election = {new Candidate7("John Smith", 5000), 
				new Candidate7("Mary Miller", 4000),
				new Candidate7("Michael Duffy", 6000),
				new Candidate7("John Smith", 2500),
				new Candidate7("Joe Ashtony", 1800),
				new Candidate7("Mickey Jones", 3000),
				new Candidate7("Rebecca Morgan", 2000),
				new Candidate7("Kathleen Turner", 8000),
				new Candidate7("Tory Parker", 500),
				new Candidate7("Ashton Davis", 10000)};
		
		System.out.println("Original Results:");
		printResults(election);
		
		System.out.println("\nDeleting Location");
		election = deleteByLoc(election, 6);
		printResults(election);

		System.out.println("\nDeleting Kathleen Turner");
		election = deleteByName(election, "Kathleen Turner");
		printResults(election);
	}
	
	public static void printVotes(Candidate7[] candidates)
	{
		for(Candidate7 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(Candidate7[] candidates)
	{
		int total = 0;
		for(int index = 0; index < candidates.length; index++)
		{
			if(candidates[index] != null)
				total += candidates[index].getVotes();
		}
		return total;
	}
	
	public static void printResults(Candidate7[] candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(int index = 0; index < candidates.length; index++)
		{
			if(candidates[index] != null)
			    System.out.printf("%-18s %-20d %-15.1f \n", candidates[index].getName(), candidates[index].getVotes(), ((((double)candidates[index].getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes +"\n");
	}
	
	
	
	public static Candidate7[] deleteByLoc(Candidate7[] candidates, int position)
	{
		for( int i = position; i < candidates.length-1 ; i++ )
		{
			candidates[i] = candidates[(i+1)];
		}
		candidates[candidates.length-1] = null;
		return candidates;
	}
	
	public static Candidate7[] deleteByName(Candidate7[] candidates, String name)
	{
		int position = -1;
		for(int i = 0; i <= candidates.length; i++)
		{
			if(candidates[i].getName().equalsIgnoreCase(name))
			{
				position = i;
				break;
			}
		}
		
		if(position == -1)
			return candidates; //If name wasnt found, cancel the operation and return the unchanged list.
		
		for( int i = position; i < candidates.length-1 ; i++ )
		{
			candidates[i] = candidates[(i+1)];
		}
		candidates[candidates.length-1] = null;
		return candidates;
	}
}
