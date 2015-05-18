package Module13._05ChallengeProject;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file MainClass.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

public class MainClass
{
	
	public static void main(String[] args)
	{
		
		ArrayList<MusicMedia> catalog = MakeMusicCatalog( 10 );
		ArrayList<Bin> warehouse = new ArrayList<Bin>();
		Bin a = new Bin( "A" );
		Bin b = new Bin( "B" );
		warehouse.add( a );
		warehouse.add( b );
		a.add( new BinItem( "1234-0", 500 ) );
		a.add( new BinItem( "1234-1", 25 ) );
		a.add( new BinItem( "1234-2", 7720 ) );
		b.add( new BinItem( "1234-3", 1000 ) );
		System.out.println( detailedInventory( catalog, warehouse ) ); 
		
	}
	
	public static ArrayList<MusicMedia> MakeMusicCatalog(int size)
	{
		String[] titles =
		{
				"Greatest Hits Volume 1", "Greatest Hits Volume 2",
				"The Best Of", "Love Songs",
				"The Early Years", "The Later Years"
		};
		String[] artists =
		{
				"Michael Jackson", "Eminem",
				"The Beatles", "Shania Twain",
				"Limp Bizkit"
		};
		ArrayList<MusicMedia> a = new ArrayList<MusicMedia>();
		Random rn = new Random();
		
		for (int i = 0; i < size; i++)
		{
			MusicMedia m;
			int mediatype = rn.nextInt(3);
			String title = titles[rn.nextInt(titles.length)];
			String artist = artists[rn.nextInt(artists.length)];
			String sku = "1234-" + i;
			if (mediatype == 0)
				m = new CompactDisk(title, artist, sku);
			else if (mediatype == 1)
				m = new DigitalVideoDisk(title, artist, sku);
			else
				m = new CassetteTape(title, artist, sku);
			a.add(m);
		}
		return a;
	}
	
	public static String lookupMedia(ArrayList<MusicMedia> catalog,
			String sku)
	{
		for (MusicMedia m : catalog)
		{
			if (m.getSKU().equalsIgnoreCase(sku))
				return m.toString();
		}
		return "SKU not in catalog";
	}
	
	public static String detailedInventory(ArrayList<MusicMedia> catalog,
			ArrayList<Bin> warehouse)
	{
		String s = "";
		for(int index = 0; index<warehouse.size(); index++)
		{
			Bin bin = warehouse.get(index);
			s += "----- Bin " + bin.getName() + " ----- \n";
			for (BinItem b : bin.getContents())
				s += lookupMedia(catalog, b.getSKU()) +", "+ b + "\n";	
			s += "\n";
		}
		return s;
	}
}
