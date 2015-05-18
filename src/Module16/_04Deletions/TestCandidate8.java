package Module16._04Deletions;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate8
{
	public static void main(String[] args)
	{
		ArrayList<Candidate8> election = new ArrayList<Candidate8>();
		election.add(new Candidate8("John Smith", 5000));
		election.add(new Candidate8("Mary Miller", 4000));
		election.add(new Candidate8("Michael Duffy", 6000));
		election.add(new Candidate8("John Smith", 2500));
		election.add(new Candidate8("Joe Ashtony", 1800));
		election.add(new Candidate8("Mickey Jones", 3000));
		election.add(new Candidate8("Rebecca Morgan", 2000));
		election.add(new Candidate8("Kathleen Turner", 8000));
		election.add(new Candidate8("Tory Parker", 500));
		election.add(new Candidate8("Ashton Davis", 10000));
		
		System.out.println("Original Results:");
		printResults(election);
		
		System.out.println("\nDeleting Location");
		election = deleteByLoc(election, 6);
		printResults(election);

		System.out.println("\nDeleting Kathleen Turner");
		election = deleteByName(election, "Kathleen Turner");
		printResults(election);
	}
	
	public static void printVotes(ArrayList<Candidate8> candidates)
	{
		for(Candidate8 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(ArrayList<Candidate8> candidates)
	{
		int total = 0;
		for(int index = 0; index < candidates.size(); index++)
		{
			if(candidates.get(index) != null)
				total += candidates.get(index).getVotes();
		}
		return total;
	}
	
	public static void printResults(ArrayList<Candidate8> candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(int index = 0; index < candidates.size(); index++)
		{
			if(candidates.get(index) != null)
			    System.out.printf("%-18s %-20d %-15.1f \n", candidates.get(index).getName(), candidates.get(index).getVotes(), ((((double)candidates.get(index).getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes +"\n");
	}
	
	
	
	public static ArrayList<Candidate8> deleteByLoc(ArrayList<Candidate8> candidates, int position)
	{
		for( int i = position; i < candidates.size()-1 ; i++ )
		{
			candidates.set(i, candidates.get(i+1));
		}
		candidates.set(candidates.size()-1, null);
		return candidates;
	}
	
	public static ArrayList<Candidate8> deleteByName(ArrayList<Candidate8> candidates, String name)
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
		
		for( int i = position; i < candidates.size()-1 ; i++ )
		{
			candidates.set(i, candidates.get(i+1));
		}
		candidates.set(candidates.size()-1, null);
		return candidates;
	}
}
