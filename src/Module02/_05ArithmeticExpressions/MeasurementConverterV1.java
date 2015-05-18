package Module02._05ArithmeticExpressions;
/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Chris Pybus
 * Date: 08/22/2011
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;
        double pounds;
        double kilograms;
        double gallons;
        double liters;
        double meters;
        double yards;
        double metersPerYard = 0.9144;
        double feetPerMile = 5280;
        double kilometersPerMile = 1.609;
        double kilogramsPerPound = 0.45359237;
        double poundsPerKilogram = 2.20462;
        double litersPerGallon = 3.785;
        double gallonsPerLiter = 0.264172052;
        System.out.println("***************************************");                               
        System.out.println("     This program converts between     ");
        System.out.println("     selected units of measurement.    ");
        System.out.println("***************************************");


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " feet = " + miles + " miles");

        //convert miles to feet
        miles = 2.3;
        feet = miles * feetPerMile;
        System.out.println(miles + " miles = " + feet + " feet");
        
        //convert miles to kilometers
        miles = 4.2;
        kilometers = miles * kilometersPerMile;
        System.out.println(miles + " miles = " + kilometers + " kilometers");
        
        //convert kilometers to miles
        kilometers = 5;
        miles = kilometers/kilometersPerMile;
        System.out.println(kilometers + " kilometers = " + miles + " miles");

        //convert pounds to kilograms... 1 pound = 0.45359237 kilogram
        pounds = 7;
        kilograms = pounds * kilogramsPerPound;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");
        
        //convert kilograms to pounds... 1 kilogram = 2.20462 pounds
        kilograms = 21;
        pounds = kilograms * poundsPerKilogram;
        System.out.println(kilograms + " kilograms = " + pounds + " pounds");
        
        //convert gallons to liters... 1 gallon = 3.785 liters (multiply)
        gallons = 4;
        liters = gallons * litersPerGallon;
        System.out.println(gallons + " gallons = " + liters + " liters");
        
        //convert liters to gallons... 1 liters = 0.264172052 gallons
        liters = 6;
        gallons = liters * gallonsPerLiter;
        System.out.println(liters + " liters = " + gallons + " gallons");
        
        //convert Yards to Meters... 1 Yards = 0.9144 Meters
        yards = 6;
        meters = yards * metersPerYard;
        System.out.println(yards + " yards = " + meters + " meters");
    }//end of main method
}//end of class