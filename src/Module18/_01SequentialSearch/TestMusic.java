package Module18._01SequentialSearch;


/**
 * @author Christopher Pybus
 * @date Apr 21, 2012
 * @file TestMusic.java
 * @package Module18._01SequentialSearch
 * 
 * @purpose 
 */

public class TestMusic
{
	
	public static void main(String[] args)
	{
		Music[] myMusic = {new Music("Pieces of You", 1994, "Jewel"),
				new Music("Jagged Little Pill", 1995, "Alanis Morisette"),
				new Music("Whats If Its You", 1995, "Reba McEntire"),
				new Music("Misunderstood", 2001, "Pink"),
				new Music("Laundry Service", 2001, "Shakira"),
				new Music("Taking the Long Way", 2006, "Dixie Chicks"),
				new Music("Under My Skin", 2004, "Avril Lavigne"),
				new Music("Let Go", 2002, "Avril Lavigne"),
				new Music("Let It Go", 2007, "Tim McGraw"),
				new Music("White Flag", 2004, "Dido")
		};
		
		printMusic(myMusic);
		
		searchTitle(myMusic, "Let Go");
		searchTitle(myMusic, "Some Day");
		searchYear(myMusic, 2001);
		searchYear(myMusic, 2003);
		searchSinger(myMusic, "Avril Lavigne");
		searchSinger(myMusic, "Tony Curtis");
	}
	
	public static void printMusic(Music[] myMusic)
	{
		System.out.println("My music Library: ");
		System.out.println("---------------------------------------------");
		for(Music song : myMusic)
		{
			System.out.println(song.toString());
		}
		
		System.out.print("\n\n");
	}
	
	public static void searchTitle(Music[] myMusic, String title)
	{
		
		int numFound = 0;
		String output = "";
		
		for(Music song : myMusic)
		{
			if(song.getTitle().toLowerCase().contains(title.toLowerCase()))
			{
				output = output + song.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0)
		{
			System.out.println("0 matches were found for \"" + title + "\"\n\n");
		}
		else if(numFound == 1)
		{
			System.out.println("1 match was found for \"" + title + "\"");
			System.out.println(output+ "\n");
		}
		else if(numFound > 1)
		{
			System.out.println(numFound + " matches were found for \"" + title + "\"");
			System.out.println(output+ "\n");
		}
		
	}
	
	public static void searchYear(Music[] myMusic, int  year)
	{
		
		int numFound = 0;
		String output = "";
		
		for(Music song : myMusic)
		{
			if(song.getYear() == year)
			{
				output = output + song.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0)
		{
			System.out.println("0 matches were found for \"" + year + "\"\n\n");
		}
		else if(numFound == 1)
		{
			System.out.println("1 match was found for \"" + year + "\"");
			System.out.println(output+ "\n");
		}
		else if(numFound > 1)
		{
			System.out.println(numFound + " matches were found for \"" + year + "\"");
			System.out.println(output+ "\n");
		}
	}
	
	public static void searchSinger(Music[] myMusic, String singer)
	{
		
		int numFound = 0;
		String output = "";
		
		for(Music song : myMusic)
		{
			if(song.getSinger().toLowerCase().contains(singer.toLowerCase()))
			{
				output = output + song.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0)
		{
			System.out.println("0 matches were found for \"" + singer + "\"\n\n");
		}
		else if(numFound == 1)
		{
			System.out.println("1 match was found for \"" + singer + "\"");
			System.out.println(output+ "\n");
		}
		else if(numFound > 1)
		{
			System.out.println(numFound + " matches were found for \"" + singer + "\"");
			System.out.println(output + "\n");
		}
	}
	
}
