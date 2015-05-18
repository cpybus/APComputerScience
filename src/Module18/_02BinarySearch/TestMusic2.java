package Module18._02BinarySearch; 


/**
 * @author Christopher Pybus
 * @date Apr 21, 2012
 * @file TestMusic.java
 * @package Module18._01SequentialSearch
 * 
 * @purpose 
 */

public class TestMusic2
{
	
	public static void main(String[] args)
	{
		Music2[] myMusic = { new Music2("Pieces of You", 1994, "Jewel"),
				new Music2("Jagged Little Pill", 1995, "Alanis Morisette"),
				new Music2("Whats If Its You", 1995, "Reba McEntire"),
				new Music2("Misunderstood", 2001, "Pink"),
				new Music2("Laundry Service", 2001, "Shakira"),
				new Music2("Taking the Long Way", 2006, "Dixie Chicks"),
				new Music2("Under My Skin", 2004, "Avril Lavigne"),
				new Music2("Let Go", 2002, "Avril Lavigne"),
				new Music2("Let It Go", 2007, "Tim McGraw"),
				new Music2("White Flag", 2004, "Dido")
		};
		
		printMusic(myMusic);
		
		searchTitle(myMusic, "Misunderstood");
		searchTitle(myMusic, "Under Paid");
		searchYear(myMusic, 2005);
		searchYear(myMusic, 2006);
		searchSinger(myMusic, "Darth Maul");
		searchSinger(myMusic, "Dido");
	}
	
	public static void printMusic(Music2[] myMusic)
	{
		System.out.println("My music Library: ");
		System.out.println("---------------------------------------------");
		for (Music2 song : myMusic)
		{
			System.out.println(song.toString());
		}
		
		System.out.print("\n\n");
	}
	
	public static void sortMusic(Music2[] myMusic, String sortType)
	{
		int i;
		int k;
		int posmax;
		Music2 temp;
		
		for (i = myMusic.length - 1; i >= 0; i--)
		{
			posmax = 0;
			for (k = 0; k <= i; k++)
			{
				if (sortType.equalsIgnoreCase("singer"))
				{
					if (myMusic[k].getSinger().compareTo(myMusic[posmax].getSinger()) > 0)
						posmax = k;
				}
				else if (sortType.equalsIgnoreCase("year"))
				{
					if (myMusic[k].getYear() > myMusic[posmax].getYear())
						posmax = k;
				}
				else
				{
					if (myMusic[k].getTitle().compareTo(myMusic[posmax].getTitle()) > 0)
						posmax = k;
				}
				
			}
			temp = myMusic[i];
			myMusic[i] = myMusic[posmax];
			myMusic[posmax] = temp;
		}
	}
	
	public static void searchTitle(Music2[] myMusic, String title)
	{
		sortMusic(myMusic, "title");
		
		int high = myMusic.length;
		int low = -1;
		int probe;
		
		while (high - low > 1)
		{
			probe = (high + low) / 2;
			if (myMusic[probe].getTitle().compareTo(title) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (myMusic[low].getTitle().compareTo(title) == 0))
		{
			System.out.println("Search - Title - " + title);
			System.out.println("Found: " + myMusic[low].toString());
			System.out.print("\n\n");
		}
		else
		{
			System.out.println("Search - Title - " + title);
			System.out.println("Not Found ");
			System.out.print("\n\n");
		}
	}
	
	public static void searchYear(Music2[] myMusic, int year)
	{
		sortMusic(myMusic, "year");
		
		int high = myMusic.length;
		int low = -1;
		int probe;
		
		while (high - low > 1)
		{
			probe = (high + low) / 2;
			if (myMusic[probe].getYear() > year)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (myMusic[low].getYear() == year))
		{
			System.out.println("Search - Year - " + year);
			System.out.println("Found: " + myMusic[low].toString());
			System.out.print("\n\n");
		}
		else
		{
			System.out.println("Search - Year - " + year);
			System.out.println("Not Found ");
			System.out.print("\n\n");
		}
	}
	
	public static void searchSinger(Music2[] myMusic, String singer)
	{
		
		sortMusic(myMusic, "singer");
		
		int high = myMusic.length;
		int low = -1;
		int probe;
		
		while (high - low > 1)
		{
			probe = (high + low) / 2;
			if (myMusic[probe].getSinger().compareTo(singer) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (myMusic[low].getSinger().compareTo(singer) == 0))
		{
			System.out.println("Search - Singer - " + singer);
			System.out.println("Found: " + myMusic[low].toString());
			System.out.print("\n\n");
		}
		else
		{
			System.out.println("Search - Singer - " + singer);
			System.out.println("Not Found ");
			System.out.print("\n\n");
		}
	}
	
}
