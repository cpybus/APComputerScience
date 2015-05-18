package Module13._05ChallengeProject;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file DigitalVideoDisk.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

public class DigitalVideoDisk extends Disk
{

	public DigitalVideoDisk(String title, String artist, String sku)
	{
		super(title, artist, sku);
		// TODO Auto-generated constructor stub
	}
	
	public String getMediaType()
	{
		return "DVD";
	}
	
	public String toString()
	{
		return "DVD - " + getTitle() + " (" + getArtist() + ")";
	}
}
