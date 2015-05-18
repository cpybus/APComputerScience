package Module16._02Replacements;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate4
{
	public static void main(String[] args)
	{
		ArrayList<Candidate4> election = new ArrayList<Candidate4>();
		election.add(new Candidate4("John Smith", 5000));
		election.add(new Candidate4("Mary Miller", 4000));
		election.add(new Candidate4("Michael Duffy", 6000));
		election.add(new Candidate4("John Smith", 2500));
		election.add(new Candidate4("Joe Ashtony", 1800));
		election.add(new Candidate4("Mickey Jones", 3000));
		election.add(new Candidate4("Rebecca Morgan", 2000));
		election.add(new Candidate4("Kathleen Turner", 8000));
		election.add(new Candidate4("Tory Parker", 500));
		election.add(new Candidate4("Ashton Davis", 10000));
		
		System.out.println("Original Results:");
		printResults(election);
		
		System.out.println("Changing Michael Duffy to John Elmos");
		election = replaceName(election, "Michael Duffy", "John Elmos");
		printResults(election);
		
		System.out.println("Changing Mickey Jones to 2500 votes.");
		election = replaceVotes(election, "Mickey Jones", 2500);
		printResults(election);
		
		System.out.println("Changing Kathleen Turner to John Kennedy, with 8500 votes. ");
		election = replaceCandidate(election, "Kathleen Turner", "John Kennedy", 8500);
		printResults(election);
	}
	
	public static void printVotes(ArrayList<Candidate4> candidates)
	{
		for(Candidate4 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(ArrayList<Candidate4> candidates)
	{
		int total = 0;
		for(Candidate4 can : candidates)
		{
			total += can.getVotes();
		}
		return total;
	}
	
	public static void printResults(ArrayList<Candidate4> candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(Candidate4 can : candidates)
		{
			System.out.printf("%-18s %-20d %-15.1f \n", can.getName(), can.getVotes(), ((((double)can.getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes +"\n");
	}
	
	public static ArrayList<Candidate4> replaceName(ArrayList<Candidate4> candidates, String name, String replacement)
	{
		for(Candidate4 can : candidates)
		{
			if(can.getName().equalsIgnoreCase(name))
			{
				can.setName(replacement);
				break;
			}
		}
		
		return candidates;
	}
	
	public static ArrayList<Candidate4> replaceVotes(ArrayList<Candidate4> candidates, String name, int replacement)
	{
		for(Candidate4 can : candidates)
		{
			if(can.getName().equalsIgnoreCase(name))
			{
				can.setVotes(replacement);
				break;
			}
		}
		
		return candidates;
	}
	
	public static ArrayList<Candidate4> replaceCandidate(ArrayList<Candidate4> candidates, String name, String replacementName, int replacementVotes)
	{
		for(Candidate4 can : candidates)
		{
			if(can.getName().equalsIgnoreCase(name))
			{
				can.setName(replacementName);
				can.setVotes(replacementVotes);
				break;
			}
		}
		
		return candidates;
	}
}
