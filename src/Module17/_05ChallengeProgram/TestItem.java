package Module17._05ChallengeProgram;


/**
 * @author Christopher Pybus
 * @date Apr 10, 2012
 * @file TestItem.java
 * @package Module17._05ChallengeProgram
 * 
 * @purpose 
 */

public class TestItem
{
	
	public static void main(String[] args)
	{
		Item[] hardware = { new Item("1011", "Air Filters", 200, 10.5),
				new Item("1034", "Door Knobs", 60, 21.5),
				new Item("1101", "Hammers", 90, 9.99),
				new Item("1600", "Levels", 80, 19.99),
				new Item("1500", "Ceiling Fans", 100, 59),
				new Item("1201", "Wrench Sets", 55, 80)
		};
		
		System.out.println("Original Array\n");
		printInventory(hardware);
		System.out.println();
		
		System.out.println("Sorted by ID\n");
		sortID(hardware);
		System.out.println();
		
		System.out.println("Sorted by Name\n");
		sortName(hardware);
		System.out.println();
		
		System.out.println("Sorted By inStore\n");
		sortInStore(hardware, 1);
		printInventory(hardware);
		System.out.println();
		
		System.out.println("Sorted by Price\n");
		sortPrice(hardware, 0, hardware.length - 1);
		printInventory(hardware);
		
	}
	
	public static void printInventory(Item[] hardware)
	{
		System.out.println("itemID    itemName    inStore    price");
		System.out.println("--------------------------------------");
		for (Item item : hardware)
		{
			System.out.println(item);
		}
	}
	
	public static void sortID(Item[] source)
	{
		Item[] dest = new Item[source.length];
		
		for (int i = 0; i < source.length; i++)
		{
			Item next = source[i];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				if (next.getItemID().compareTo(dest[k - 1].getItemID()) > 0)
				{
					insertindex = k;
				}
				else
				{
					dest[k] = dest[k - 1];
				}
				k--;
				
			}
			
			dest[insertindex] = next;
		}
		
		printInventory(dest);
	}
	
	public static void sortName(Item[] source)
	{
		Item[] dest = new Item[source.length];
		
		for (int i = 0; i < source.length; i++)
		{
			Item next = source[i];
			int insertindex = 0;
			int k = i;
			while (k > 0 && insertindex == 0)
			{
				
				if (next.getItemName().compareTo(dest[k - 1].getItemName()) < 0)
				{
					insertindex = k;
				}
				else
				{
					dest[k] = dest[k - 1];
				}
				k--;
				
			}
			
			dest[insertindex] = next;
		}
		
		printInventory(dest);
	}
	
	public static void sortInStore(Item[] source, int sortType)
	{
		int i;
		int k;
		int posmax;
		Item temp;
		
		for (i = source.length - 1; i >= 0; i--)
		{
			posmax = 0;
			for (k = 0; k <= i; k++)
			{
				if (sortType == 2)
				{
					if (source[k].getInStore() < source[posmax].getInStore())
						posmax = k;
				}
				else
				{
					if (source[k].getInStore() > source[posmax].getInStore())
						posmax = k;
				}
				
			}
			temp = source[i];
			source[i] = source[posmax];
			source[posmax] = temp;
		}
		
	}
	
	public static void sortPrice(Item[] a, int low, int high)
	{
		if (low == high)
			return;
		
		int mid = (low + high) / 2;
		
		sortPrice(a, low, mid);
		sortPrice(a, mid + 1, high);
		
		mergePrice(a, low, mid, high);
	}
	
	public static void mergePrice(Item[] a, int low, int mid, int high)
	{
		Item[] temp = new Item[high - low + 1];
		
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
			else if (a[i].getPrice() > a[j].getPrice())
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
