package Module15._01Abstract;

/**
 * @author Christopher Pybus
 * @date Mar 31, 2012
 * @file MyMath.java
 * @package Module15._01Abstract
 * 
 * @purpose 
 */

public class MyMath extends Homework
{
	MyMath()
	{
		
	}

	@Override
	public void createAssignment(int p)
	{
		super.setPagesRead(p);
		super.setTypeHomework("Math");
	}
	
	public String toString()
	{
		return super.getTypeHomework() + ": must read " + super.getPagesRead() + " pages.";
	}
}
