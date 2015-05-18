package Module13._05ChallengeProject;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file Bin.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

import java.util.*;

public class Bin
{
	
	private String myName;
	private ArrayList<BinItem> myContents;
	
	
	public Bin(String name)
	{
		myName = name;
		myContents = new ArrayList<BinItem>();
	}
	
	public String getName()
	{
		return myName;
	}
	
	public ArrayList<BinItem> getContents()
	{
		return myContents;
	}
	
	public void add(BinItem b)
	{
		myContents.add(b);
	}
	
	public String toString()
	{
		String s = "Bin " + myName + ":\n";
		for (BinItem b : myContents)
			s += b + "\n";
		return s;
	}
}
