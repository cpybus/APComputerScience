package Module15._04ComparableInterfaces;


/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file Homework3.java
 * @package Module15._04ComparableInterfaces
 * 
 * @purpose 
 */

public abstract class Homework3 implements Comparable<Homework3>
{
	public int pagesRead;
	public String typeHomework;
	
	Homework3()
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
	
	public int compareTo(Homework3 obj)
	{
	    if (pagesRead < obj.pagesRead)
	        return -1;
	    else if (pagesRead == obj.pagesRead)
	        return 0;
	    else
	        return 1;
	}
}
