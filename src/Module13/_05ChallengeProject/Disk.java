package Module13._05ChallengeProject;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file Disk.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

public class Disk extends MusicMedia
{
	
	public Disk(String title, String artist, String sku)
	{
		super(title, artist, sku);
		// TODO Auto-generated constructor stub
	}
	
	public String getMediaType()
	{
		return "Disk";
	}
	
	public String toString()
	{
		return "Disk - " + getTitle() + " (" + getArtist() + ")";
	}
	
}
