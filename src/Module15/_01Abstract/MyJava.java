package Module15._01Abstract;

/**
 * @author Christopher Pybus
 * @date Mar 31, 2012
 * @file MyJava.java
 * @package Module15._01Abstract
 * 
 * @purpose 
 */

public class MyJava extends Homework
{
	
	MyJava()
	{
		
	}
	
	@Override
	public void createAssignment(int p)
	{
		super.setPagesRead(p);
		super.setTypeHomework("Java");
	}
	
	public String toString()
	{
		return super.getTypeHomework() + ": must read " + super.getPagesRead() + " pages.";
	}
	
}
