package Module08._09JavaDocs;

/**
 * @author ChristopherPybus
 * @version Dec 10, 2011
 * @file C01FootprintV1Main.java
 * @package Module8._09JavaDocs
 * 
 * Purpose: 
 */

public class C01FootprintV1Main
{
	
	public static void main(String[] args)
	{
		double annualGallons = 1288.0;
		double tonsC02;
		double poundsC02;
		
		C02FootprintV1 footprint = new C02FootprintV1(annualGallons);
		footprint.calcTons();
		footprint.calcPounds();
		tonsC02 = footprint.getTonsC02();
		poundsC02 = footprint.getPounds();
		
		System.out.println("         C02 Emissions        ");
		System.out.println(" Gallon     Pounds     Tons   ");
		System.out.println(" Of Gas    from Gas  from Gas ");
		System.out.println("==============================");
		System.out.printf (" %5.1f %11.2f %7.2f", annualGallons, poundsC02, tonsC02);
		
	}
	
}
