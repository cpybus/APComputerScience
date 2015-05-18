package Module13._02ClassHierarchies;

/**
 * @author Christopher Pybus
 * @date Feb 18, 2012
 * @file TestTerrain.java
 * @package Module13._02ClassHierarchies
 * 
 * @purpose 
 */

public class TestTerrain
{
	
	public static void main(String[] args)
	{
		Forest forest = new Forest(100, 200, 100);
		Mountains mount = new Mountains(300, 400, 25);
		WinterMountains wintMount = new WinterMountains(500, 600, 15, 10);
		
		System.out.println("Forest " + forest.terrainSize() + " and " + forest.getTrees() + " trees.");
		System.out.println("Mountains " + mount.terrainSize() + " and " + mount.getMountains() + " mountains.");
		System.out.println("WinterMountains " + wintMount.terrainSize() + " and " + wintMount.getMountains() + " mountains and a temperature of " + wintMount.getTemperature() + " degrees." );
	}
	
}
