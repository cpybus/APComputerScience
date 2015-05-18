package Module18._01SequentialSearch;

/**
 * @author Christopher Pybus
 * @date Apr 21, 2012
 * @file Music.java
 * @package Module18._01SequentialSearch
 * 
 * @purpose 
 */

public class Music
{
	
	String title;
	int year;
	String singer;
	
	public Music(String title, int year, String singer)
	{
		this.title = title;
		this.year = year;
		this.singer = singer;
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
	
	public String getSinger()
	{
		return singer;
	}
	
	public void setSinger(String singer)
	{
		this.singer = singer;
	}
	
	@Override
	public String toString()
	{
		return title + ", " + year + ", " + singer;
	}
	
}
