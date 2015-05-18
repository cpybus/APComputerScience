package Module15._01Abstract;

/**
 * @author Christopher Pybus
 * @date Mar 31, 2012
 * @file MyScience.java
 * @package Module15._01Abstract
 * 
 * @purpose 
 */

public class MyScience extends Homework
{
	
	MyScience()
	{
		
	}
	
	@Override
	public void createAssignment(int p)
	{
		super.setPagesRead(p);
		super.setTypeHomework("Science");
	}
	
	public String toString()
	{
		return super.getTypeHomework() + ": must read " + super.getPagesRead() + " pages.";
	}
	
}
