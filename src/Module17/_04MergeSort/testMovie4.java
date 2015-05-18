package Module17._04MergeSort;

/**
 * @author Christopher Pybus
 * @date Apr 5, 2012
 * @file testMovie2.java
 * @package Module17._02InsertionSort
 * 
 * @purpose 
 */

public class testMovie4
{
	
	public static void main(String[] args)
	{
		Movie4[] myMovies = { new Movie4("The Muppets Take Manhattan", 2001, "Columbia Tristar"),
				new Movie4("Mulan Special Edition", 2004, "Disney"),
				new Movie4("Shrek 2", 2004, "Dreamworks"),
				new Movie4("The Incredibles", 2004, "Pixar"),
				new Movie4("Nanny McPhee", 2006, "Universal"),
				new Movie4("The Curse of the Were-Rabbit", 2006, "Aardman"),
				new Movie4("Ice Age", 2002, "20th Century Fox"),
				new Movie4("Lilo & Stitch", 2002, "Disney"),
				new Movie4("Robots", 2005, "20th Century Fox"),
				new Movie4("Monsters Inc.", 2001, "Pixar") };
		
		System.out.println("Originl List");
		printMovies(myMovies);
		
		System.out.println("\nSorted By Title - ascending");
		sortTitles(myMovies, 0, myMovies.length - 1);
		printMovies(myMovies);
		
		System.out.println("\nSorted By Year - descending");		
		sortYears(myMovies, 0, myMovies.length -1);
		printMovies(myMovies);
		
		System.out.println("\nSorted By Studio - ascending");		
		sortStudios(myMovies, 0, myMovies.length -1);
		printMovies(myMovies);
		
	}
	
	public static void printMovies(Movie4[] myMovies)
	{
		for (int i = 0; i < myMovies.length; i++)
			System.out.println(myMovies[i]);
	}
	
	public static void sortTitles(Movie4[] a, int low, int high)
	{
		if (low == high)
			return;
		
		int mid = (low + high) / 2;
		
		sortTitles(a, low, mid);
		sortTitles(a, mid + 1, high);
		
		mergeTitles(a, low, mid, high);
	}
	
	public static void mergeTitles(Movie4[] a, int low, int mid, int high)
	{
		Movie4[] temp = new Movie4[high - low + 1];
		
		int i = low, j = mid + 1, n = 0;
		
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = a[i];
				i++;
			}
			else if (a[i].getTitle().compareTo(a[j].getTitle()) < 0)
			{
				temp[n] = a[i];
				i++;
			}
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}
		
		for (int k = low; k <= high; k++)
			a[k] = temp[k - low];
	}
	
	public static void sortYears(Movie4[] a, int low, int high)
	{
		if (low == high)
			return;
		
		int mid = (low + high) / 2;
		
		sortYears(a, low, mid);
		sortYears(a, mid + 1, high);
		
		mergeYears(a, low, mid, high);
	}
	
	public static void mergeYears(Movie4[] a, int low, int mid, int high)
	{
		Movie4[] temp = new Movie4[high - low + 1];
		
		int i = low, j = mid + 1, n = 0;
		
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = a[i];
				i++;
			}
			else if (a[i].getYear() > a[j].getYear())
			{
				temp[n] = a[i];
				i++;
			}
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}
		
		for (int k = low; k <= high; k++)
			a[k] = temp[k - low];
	}
	
	public static void sortStudios(Movie4[] a, int low, int high)
	{
		if (low == high)
			return;
		
		int mid = (low + high) / 2;
		
		sortStudios(a, low, mid);
		sortStudios(a, mid + 1, high);
		
		mergeStudios(a, low, mid, high);
	}
	
	public static void mergeStudios(Movie4[] a, int low, int mid, int high)
	{
		Movie4[] temp = new Movie4[high - low + 1];
		
		int i = low, j = mid + 1, n = 0;
		
		while (i <= mid || j <= high)
		{
			if (i > mid)
			{
				temp[n] = a[j];
				j++;
			}
			else if (j > high)
			{
				temp[n] = a[i];
				i++;
			}
			else if (a[i].getStudio().compareTo(a[j].getStudio()) < 0)
			{
				temp[n] = a[i];
				i++;
			}
			else
			{
				temp[n] = a[j];
				j++;
			}
			n++;
		}
		
		for (int k = low; k <= high; k++)
			a[k] = temp[k - low];
	}
	
}
