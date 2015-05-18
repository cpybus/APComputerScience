package Module15._03Interfaces;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file MyJava2.java
 * @package Module15._03Interfaces
 * 
 * @purpose 
 */

public class MyJava2 extends Homework2
{
	int pages;

	@Override
	public void doReading()
	{
		super.setPagesRead(pages-4);
	}

	@Override
	public void createAssignment(int p)
	{
		super.setPagesRead(p);
		super.setTypeHomework("Java");
		pages = p;
	}
	
	public String toString()
	{
		return super.getTypeHomework() + ": must read " + super.getPagesRead() + " pages.";
	}
}
