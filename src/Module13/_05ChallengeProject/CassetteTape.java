package Module13._05ChallengeProject;

/**
 * @author Christopher Pybus
 * @date Feb 20, 2012
 * @file CassetteTape.java
 * @package Module13._05ChallengeProject
 * 
 * @purpose 
 */

public class CassetteTape extends MusicMedia
{

	public CassetteTape(String title, String artist, String sku)
	{
		super(title, artist, sku);
		// TODO Auto-generated constructor stub
	}
	
	public String getMediaType()
	{
		return "Cassette";
	}
	
	public String toString()
	{
		return "Cassette - " + getTitle() + " (" + getArtist() + ")";
	}
}
