package Module15._01Abstract;

/**
 * @author Christopher Pybus
 * @date Mar 31, 2012
 * @file Homework.java
 * @package Module15._01Abstract
 * 
 * @purpose 
 */

public abstract class Homework
{
	public int pagesRead;
	public String typeHomework;
	
	Homework()
	{
		pagesRead = 0;
		typeHomework = "none";
	}
	
	public int getPagesRead()
	{
		return pagesRead;
	}
	
	public void setPagesRead(int pagesRead)
	{
		this.pagesRead = pagesRead;
	}
	
	public String getTypeHomework()
	{
		return typeHomework;
	}
	
	public void setTypeHomework(String typeHomework)
	{
		this.typeHomework = typeHomework;
	}
	
	public abstract void createAssignment(int p);
}
