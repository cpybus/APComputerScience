package Module17._04MergeSort;


/**
 * @author Christopher Pybus
 * @date Apr 5, 2012
 * @file Movie2.java
 * @package Module17._02InsertionSort
 * 
 * @purpose 
 */

public class Movie4
{
	
	String title;
	int year;
	String studio;
	
	public Movie4(String title, int year, String studio)
	{
		this.title = title;
		this.year = year;
		this.studio = studio;
	}
	
	@Override
	public String toString()
	{
		return title + ", " + year + ", " + studio;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getStudio()
	{
		return studio;
	}
	
	public void setStudio(String studio)
	{
		this.studio = studio;
	}
	
}
