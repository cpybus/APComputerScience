package Module16._03Insertions;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate5
{
	public static void main(String[] args)
	{
		Candidate5[] election = {new Candidate5("John Smith", 5000), 
				new Candidate5("Mary Miller", 4000),
				new Candidate5("Michael Duffy", 6000),
				new Candidate5("John Smith", 2500),
				new Candidate5("Joe Ashtony", 1800),
				new Candidate5("Mickey Jones", 3000),
				new Candidate5("Rebecca Morgan", 2000),
				new Candidate5("Kathleen Turner", 8000),
				new Candidate5("Tory Parker", 500),
				new Candidate5("Ashton Davis", 10000)};
		
		System.out.println("Original Results:");
		printResults(election);
		
		System.out.println("\nAdding in Mickey Duck at position 5.");
		election = insertPosition(election, 5, "Mickey Duck", 14000);
		printResults(election);

		System.out.println("\nAdding in Donald Mouse before Kathleen Turner");
		election = insertCandidate(election, "Kathleen Turner", "Donald Mouse", 100);
		printResults(election);
	}
	
	public static void printVotes(Candidate5[] candidates)
	{
		for(Candidate5 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(Candidate5[] candidates)
	{
		int total = 0;
		for(Candidate5 can : candidates)
		{
			total += can.getVotes();
		}
		return total;
	}
	
	public static void printResults(Candidate5[] candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(Candidate5 can : candidates)
		{
			System.out.printf("%-18s %-20d %-15.1f \n", can.getName(), can.getVotes(), ((((double)can.getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes +"\n");
	}
	
	
	
	public static Candidate5[] insertPosition(Candidate5[] candidates, int position, String name, int votes)
	{
		for( int i = candidates.length - 1 ; i > position ; i-- )
		{
			candidates[i] = candidates[(i-1)];
		}
		candidates[position] = new Candidate5(name, votes);
		return candidates;
	}
	
	public static Candidate5[] insertCandidate(Candidate5[] candidates, String name, String newName, int votes)
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
		
		for( int i = candidates.length - 1 ; i > position ; i-- )
		{
			candidates[i] = candidates[(i-1)];
		}
		candidates[position] = new Candidate5(newName, votes);
		return candidates;
	}
}
