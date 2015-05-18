package Module16._03Insertions;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate6
{
	public static void main(String[] args)
	{
		ArrayList<Candidate6> election = new ArrayList<Candidate6>();
		election.add(new Candidate6("John Smith", 5000));
		election.add(new Candidate6("Mary Miller", 4000));
		election.add(new Candidate6("Michael Duffy", 6000));
		election.add(new Candidate6("John Smith", 2500));
		election.add(new Candidate6("Joe Ashtony", 1800));
		election.add(new Candidate6("Mickey Jones", 3000));
		election.add(new Candidate6("Rebecca Morgan", 2000));
		election.add(new Candidate6("Kathleen Turner", 8000));
		election.add(new Candidate6("Tory Parker", 500));
		election.add(new Candidate6("Ashton Davis", 10000));
		
		System.out.println("Original Results:");
		printResults(election);
		
		System.out.println("\nAdding in Mickey Duck at position 5.");
		election = insertPosition(election, 5, "Mickey Duck", 14000);
		printResults(election);

		System.out.println("\nAdding in Donald Mouse before Kathleen Turner");
		election = insertCandidate(election, "Kathleen Turner", "Donald Mouse", 100);
		printResults(election);
	}
	
	public static void printVotes(ArrayList<Candidate6> candidates)
	{
		for(Candidate6 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(ArrayList<Candidate6> candidates)
	{
		int total = 0;
		for(Candidate6 can : candidates)
		{
			total += can.getVotes();
		}
		return total;
	}
	
	public static void printResults(ArrayList<Candidate6> candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(Candidate6 can : candidates)
		{
			System.out.printf("%-18s %-20d %-15.1f \n", can.getName(), can.getVotes(), ((((double)can.getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes +"\n");
	}
	
	
	
	public static ArrayList<Candidate6> insertPosition(ArrayList<Candidate6> candidates, int position, String name, int votes)
	{
		for( int i = candidates.size() - 1 ; i > position ; i-- )
		{
			candidates.set(i, candidates.get(i-1));
		}
		candidates.set(position, new Candidate6(name, votes));
		return candidates;
	}
	
	public static ArrayList<Candidate6> insertCandidate(ArrayList<Candidate6> candidates, String name, String newName, int votes)
	{
		int position = -1;
		for(int i = 0; i <= candidates.size(); i++)
		{
			if(candidates.get(i).getName().equalsIgnoreCase(name))
			{
				position = i;
				break;
			}
		}
		
		if(position == -1)
			return candidates; //If name wasnt found, cancel the operation and return the unchanged list.
		
		for( int i = candidates.size() - 1 ; i > position ; i-- )
		{
			candidates.set(i, candidates.get(i-1));
		}
		candidates.set(position, new Candidate6(newName, votes));
		return candidates;
	}
}
