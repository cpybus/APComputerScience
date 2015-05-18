package Module16._02Replacements;

/**
 * @author Christopher Pybus
 * @date Apr 2, 2012
 * @file TestCandidate.java
 * @package Module16._01Iterations
 * 
 * @purpose 
 */

public class TestCandidate3
{
	public static void main(String[] args)
	{
		Candidate3[] election = {new Candidate3("John Smith", 5000), 
				new Candidate3("Mary Miller", 4000),
				new Candidate3("Michael Duffy", 6000),
				new Candidate3("John Smith", 2500),
				new Candidate3("Joe Ashtony", 1800),
				new Candidate3("Mickey Jones", 3000),
				new Candidate3("Rebecca Morgan", 2000),
				new Candidate3("Kathleen Turner", 8000),
				new Candidate3("Tory Parker", 500),
				new Candidate3("Ashton Davis", 10000)};
		
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
	
	public static void printVotes(Candidate3[] candidates)
	{
		for(Candidate3 can : candidates)
		{
			System.out.println(can.toString());
		}
	}
	
	public static int getTotal(Candidate3[] candidates)
	{
		int total = 0;
		for(Candidate3 can : candidates)
		{
			total += can.getVotes();
		}
		return total;
	}
	
	public static void printResults(Candidate3[] candidates)
	{
		final int totalVotes = getTotal(candidates);
		
		System.out.println("\nCandidate          Votes Received       % of Total Votes");
		for(Candidate3 can : candidates)
		{
			System.out.printf("%-18s %-20d %-15.1f \n", can.getName(), can.getVotes(), ((((double)can.getVotes())/totalVotes)*100));
		}
		
		System.out.println("\nTotal votes in this election: " + totalVotes +"\n");
	}
	
	public static Candidate3[] replaceName(Candidate3[] candidates, String name, String replacement)
	{
		for(Candidate3 can : candidates)
		{
			if(can.getName().equalsIgnoreCase(name))
			{
				can.setName(replacement);
				break;
			}
		}
		
		return candidates;
	}
	
	public static Candidate3[] replaceVotes(Candidate3[] candidates, String name, int replacement)
	{
		for(Candidate3 can : candidates)
		{
			if(can.getName().equalsIgnoreCase(name))
			{
				can.setVotes(replacement);
				break;
			}
		}
		
		return candidates;
	}
	
	public static Candidate3[] replaceCandidate(Candidate3[] candidates, String name, String replacementName, int replacementVotes)
	{
		for(Candidate3 can : candidates)
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
