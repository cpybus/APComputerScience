package Module04._03UserInputAndConditional;

/**
 * The purpose of this program is to get the target heart rate zone of a person, 
 * and then see if they are in that zone... Using if/if else/else
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Determine Your Target Heart Rate Zone For Cardiovascular Exercise");
        System.out.println("(50% to 85%)");
        System.out.println();
        
        System.out.print("Enter your age: ");
        int userAge = in.nextInt();
        
        System.out.print("Enter your resting heart rate (RHR): ");
        int RHR = in.nextInt();
        
        int maxHeartRate = 220 - userAge;
        int heartRateReserve = maxHeartRate - RHR;
        double highEnd = (heartRateReserve * .85) + RHR;
        double lowEnd = (heartRateReserve * .50) + RHR;
        
        System.out.println();
        System.out.println("Your target heart rate zone is between " + lowEnd + " and " + highEnd);
        System.out.println();
        
        System.out.println("Now do a little bit of an excersise and come back and enter your heart rate :)");
        System.out.println();
        System.out.print("Enter your heart rate after exercising: ");
        
        int heartRateAfter = in.nextInt();
        System.out.println();
        System.out.print("After just exercising, ");
        if(heartRateAfter < lowEnd)
        {
            System.out.println("your heart rate is lower than your target zone.");
        }
        else if(heartRateAfter > highEnd)
        {
            System.out.println("your heart rate is above your target zone.");
        }
        else
        {
            System.out.println("your heart rate is within your target zone.");
        }
    }
}
