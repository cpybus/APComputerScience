package Module17._02InsertionSort;


/**
 * @author Christopher Pybus
 * @date Apr 5, 2012
 * @file testMovie2.java
 * @package Module17._02InsertionSort
 * 
 * @purpose 
 */

public class testMovie2
{
	
	public static void main(String[] args)
	{
		Movie2[] myMovies = { new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
				new Movie2("Mulan Special Edition", 2004, "Disney"),
				new Movie2("Shrek 2", 2004, "Dreamworks"),
				new Movie2("The Incredibles", 2004, "Pixar"),
				new Movie2("Nanny McPhee", 2006, "Universal"),
				new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman"),
				new Movie2("Ice Age", 2002, "20th Century Fox"),
				new Movie2("Lilo & Stitch", 2002, "Disney"),
				new Movie2("Robots", 2005, "20th Century Fox"),
				new Movie2("Monsters Inc.", 2001, "Pixar") };
		
		System.out.println("Originl List");
		printMovies(myMovies);
		
		System.out.println("\nSorted By Title - ascending");
		printMovies(sortTitles(myMovies, 1));
		
		System.out.println("\nSorted By Year - descending");
		printMovies(sortYears(myMovies, 2));
		
		System.out.println("\nSorted By Studio - ascending");
		printMovies(sortStudios(myMovies, 1));
	}
	
	public static void printMovies(Movie2[] myMovies)
	{
		for (int i = 0; i < myMovies.length; i++)
			System.out.println(myMovies[i]);
	}
	
	public static Movie2[] sortTitles(Movie2[] source, int sortType)
	{
		Movie2[] dest = new Movie2[source.length];
		
		for (int i = 0; i < source.length; i++)
		{
			Movie2 next = source[i];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				if(sortType == 2)
				{
					if (next.getTitle().compareTo(dest[k - 1].getTitle()) < 0)
					{
						insertindex = k;
					}
					else
					{
						dest[k] = dest[k - 1];
					}
					k--;
				}
				else
				{
					if (next.getTitle().compareTo(dest[k - 1].getTitle()) > 0)
					{
						insertindex = k;
					}
					else
					{
						dest[k] = dest[k - 1];
					}
					k--;
				}
				
			}
			
			dest[insertindex] = next;
		} // end of for    
		return dest;
	}
	
	public static Movie2[] sortYears(Movie2[] source, int sortType)
	{
		Movie2[] dest = new Movie2[source.length];
		
		for (int i = 0; i < source.length; i++)
		{
			Movie2 next = source[i];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				if(sortType == 2)
				{
					if (next.getYear() < dest[k - 1].getYear())
					{
						insertindex = k;
					}
					else
					{
						dest[k] = dest[k - 1];
					}
					k--;
				}
				else
				{
					if (next.getYear() > dest[k - 1].getYear())
					{
						insertindex = k;
					}
					else
					{
						dest[k] = dest[k - 1];
					}
					k--;
				}
				
			}
			
			dest[insertindex] = next;
		} // end of for    
		return dest;
	}
	
	public static Movie2[] sortStudios(Movie2[] source, int sortType)
	{
		Movie2[] dest = new Movie2[source.length];
		
		for (int i = 0; i < source.length; i++)
		{
			Movie2 next = source[i];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				if(sortType == 2)
				{
					if (next.getStudio().compareTo(dest[k - 1].getStudio()) < 0)
					{
						insertindex = k;
					}
					else
					{
						dest[k] = dest[k - 1];
					}
					k--;
				}
				else
				{
					if (next.getStudio().compareTo(dest[k - 1].getStudio()) > 0)
					{
						insertindex = k;
					}
					else
					{
						dest[k] = dest[k - 1];
					}
					k--;
				}
			}
			
			dest[insertindex] = next;
		} // end of for    
		return dest;
	}
	
}
