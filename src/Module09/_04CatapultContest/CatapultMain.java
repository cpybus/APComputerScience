package Module09._04CatapultContest;

/**
 * @author Christopher Pybus
 * @date Dec 26, 2011
 * @file CatapultMain.java
 * @package Module9._04CatapultContest
 * 
 * @purpose 
 */

public class CatapultMain
{
	
	public static void main(String[] args)
	{
		int[] MPH = { 25, 30, 35, 40, 45, 50, 55 };
		int[] angles = { 25, 30, 35, 40, 45, 50 };
		double[][] dataTable = new double[MPH.length][angles.length];
		
		for (int row = 0; row < MPH.length; row++)
		{
			for (int col = 0; col < angles.length; col++)
			{
				Catapult catapult = new Catapult();
				double range = catapult.calcRange(MPH[row], angles[col]);
				dataTable[row][col] = range;
			}
		}
		
		printOut(MPH, angles, dataTable);
	}
	
	public static void printOut(int[] velocityValues, int[] launchAngles, double[][] dataTable)
	{
		System.out.println("                           Projectile Distance (feet)");
		System.out.println();
		
		for (int row = 0; row < velocityValues.length; row++)
		{
			if(row == 0)
			{
				System.out.print("   MPH   |");
				for(int myValue : launchAngles)
				{
					System.out.printf("%4d Deg  |", myValue);
					
				}
				System.out.println();
				System.out.println("---------|----------|----------|----------|----------|----------|----------|");
			}
			for (int col = 0; col < launchAngles.length; col++)
			{
				if(col == 0)
				{
					System.out.printf("%6d   | ", velocityValues[row]);
				}
				System.out.printf("%8.2f | ", dataTable[row][col]);
				
			}
			System.out.println();
		}
	}
	
}
