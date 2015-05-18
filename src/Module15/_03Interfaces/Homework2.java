package Module15._03Interfaces;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file Homework2.java
 * @package Module15._03Interfaces
 * 
 * @purpose 
 */

public abstract class Homework2 implements Processing
{
	public int pagesRead;
	public String typeHomework;
	
	Homework2()
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
