package Module15._01Abstract;

/**
 * @author Christopher Pybus
 * @date Mar 31, 2012
 * @file MyEnglish.java
 * @package Module15._01Abstract
 * 
 * @purpose 
 */

public class MyEnglish extends Homework
{
	
	MyEnglish()
	{
		
	}
	
	@Override
	public void createAssignment(int p)
	{
		super.setPagesRead(p);
		super.setTypeHomework("English");
	}
	
	public String toString()
	{
		return super.getTypeHomework() + ": must read " + super.getPagesRead() + " pages.";
	}
	
}
