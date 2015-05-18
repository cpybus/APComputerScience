package Module17._03SelectionSort;

/**
 * @author Christopher Pybus
 * @date Apr 5, 2012
 * @file testMovie2.java
 * @package Module17._02InsertionSort
 * 
 * @purpose 
 */

public class testMovie3
{
	
	public static void main(String[] args)
	{
		Movie3[] myMovies = { new Movie3("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
				new Movie3("Mulan Special Edition", 2004, "Disney"),
				new Movie3("Shrek 2", 2004, "Dreamworks"),
				new Movie3("The Incredibles", 2004, "Pixar"),
				new Movie3("Nanny McPhee", 2006, "Universal"),
				new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman"),
				new Movie3("Ice Age", 2002, "20th Century Fox"),
				new Movie3("Lilo & Stitch", 2002, "Disney"),
				new Movie3("Robots", 2005, "20th Century Fox"),
				new Movie3("Monsters Inc.", 2001, "Pixar") };
		
		System.out.println("Originl List");
		printMovies(myMovies);
		
		System.out.println("\nSorted By Title - descending");
		printMovies(sortTitles(myMovies, 2));
		
		System.out.println("\nSorted By Year - descending");
		printMovies(sortYears(myMovies, 2));
		
		System.out.println("\nSorted By Studio - ascending");
		printMovies(sortStudios(myMovies, 1));
	}
	
	public static void printMovies(Movie3[] myMovies)
	{
		for (int i = 0; i < myMovies.length; i++)
			System.out.println(myMovies[i]);
	}
	
	public static Movie3[] sortTitles(Movie3[] source, int sortType)
	{
		int i;
		int k;
		int posmax;
		Movie3 temp;
		
		for (i = source.length - 1; i >= 0; i--)
		{
			posmax = 0;
			for (k = 0; k <= i; k++)
			{
				if(sortType == 2)
				{
					if (source[k].getTitle().compareTo(source[posmax].getTitle()) < 0)
						posmax = k;
				}
				else
				{
					if (source[k].getTitle().compareTo(source[posmax].getTitle()) > 0)
						posmax = k;
				}
				
			}
			temp = source[i];
			source[i] = source[posmax];
			source[posmax] = temp;
		}
		
		return source;
	}
	
	public static Movie3[] sortYears(Movie3[] source, int sortType)
	{
		int i;
		int k;
		int posmax;
		Movie3 temp;
		
		for (i = source.length - 1; i >= 0; i--)
		{
			posmax = 0;
			for (k = 0; k <= i; k++)
			{
				if(sortType == 2)
				{
					if (source[k].getYear() < source[posmax].getYear())
						posmax = k;
				}
				else
				{
					if (source[k].getYear() > source[posmax].getYear())
						posmax = k;
				}
				
			}
			temp = source[i];
			source[i] = source[posmax];
			source[posmax] = temp;
		}
		
		return source;
	}
	
	public static Movie3[] sortStudios(Movie3[] source, int sortType)
	{
		int i;
		int k;
		int posmax;
		Movie3 temp;
		
		for (i = source.length - 1; i >= 0; i--)
		{
			posmax = 0;
			for (k = 0; k <= i; k++)
			{
				if(sortType == 2)
				{
					if (source[k].getStudio().compareTo(source[posmax].getStudio()) < 0)
						posmax = k;
				}
				else
				{
					if (source[k].getStudio().compareTo(source[posmax].getStudio()) > 0)
						posmax = k;
				}
				
			}
			temp = source[i];
			source[i] = source[posmax];
			source[posmax] = temp;
		}
		
		return source;
	}
	
}
