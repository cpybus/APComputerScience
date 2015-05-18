package Module13._05ChallengeProject;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file CompactDisk.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

public class CompactDisk extends Disk
{

	public CompactDisk(String title, String artist, String sku)
	{
		super(title, artist, sku);
		// TODO Auto-generated constructor stub
	}
	
	public String getMediaType()
	{
		return "CD";
	}
	
	public String toString()
	{
		return "CD - " + getTitle() + " (" + getArtist() + ")";
	}
}
