package Module02._07MathShortcuts;

/**
 * @author Chris Pybus
 * @version 9/3/2011
 * @File Location: C:\Users\Chris\My Documents\Computer Programming\Module 2\2.07Assignment\GradesV2.java
 * 
 * The purpose of this program is to intake as many grades as the 
 * user wants and to calculate the average as you go.
 */
import java.util.Scanner; 

public class GradesV2
{
    public static void main(String[] args)
    {
        System.out.println("----Welcome to Christopher's Average Calculator!----");
        System.out.println();
        System.out.println("Intructions:                                        ");
        System.out.println("1. You can type in as many numbers that you want!   ");
        System.out.println("2. To EXIT, just type in a negative number          ");
        System.out.println("   NOTE: The negative # wont be included in your avg.");
        System.out.println("3. Do not enter any decimal values.                 ");
        System.out.println();
        
        AverageCalculator calc = new AverageCalculator(); 
        calc.calcAverage();
        double avg = calc.getAverage();
        int total = calc.getTotalPoints();
        
        System.out.println();
        System.out.println("The Final Average Is: " + avg);
        System.out.println("The Total Amount of Points is: " + total);
    }
}
                          
class AverageCalculator
{
    private double finalAverage;
    private int finalTotalPoints;

    AverageCalculator()                              
    {
    }
        
    public void calcAverage()
    {
        
        int numTests = 0;      
        int testGrade = 0;     
        int totalPoints = 0;   
        double average = 0.0;                                
        Scanner in = new Scanner(System.in);        
        
        do                                          
        {
            numTests++;                                                                   
            totalPoints += testGrade;                         
            System.out.print("Test Grade Number " + numTests + ": ");
            testGrade = in.nextInt();
            if(testGrade >= 0){
                System.out.println(" - Total Points: " + (totalPoints + testGrade));
                average = ((double)(totalPoints + testGrade)/numTests);
                System.out.println(" - Average Score: " + average);
            }
                                           
        }
        while(testGrade >= 0);                         
        
        numTests--;   
        
        finalTotalPoints = totalPoints;                     
        finalAverage = average;                                 
    }
    
    public double getAverage()
    {
        return finalAverage;
    }
    
    public int getTotalPoints()
    {
        return finalTotalPoints;
    }
}

