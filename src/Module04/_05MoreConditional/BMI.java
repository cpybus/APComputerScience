package Module04._05MoreConditional;


/**
 * @author Chris Pybus
 * @version 10/20/11
 * 
 * Purpose: To calculate the BMI for a person. 
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        //--------------
        //   INPUTS
        //--------------
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.next();
        System.out.print("Enter your weight in pounds: ");
        int weightPounds = in.nextInt();
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int heightFeet = in.nextInt();
        int heightInches = in.nextInt();
        
        //--------------
        // CALCULATIONS
        //--------------
        double kiloPerPound =  0.45359237;
        double weightKilos = weightPounds * kiloPerPound;
        //weightKilos = Math.round(weightKilos);
        
        double metersPerInch = .0254;
        double heightMeters = ((heightFeet * 12) + heightInches) * metersPerInch;
        //heightMeters = Math.round(heightMeters);
        
        double BMI = (weightKilos)/(heightMeters * heightMeters);
        //BMI = Math.round(BMI);
        
        //--------------
        // DATA STUFF
        //--------------
        String weightStatus;
        if(BMI < 18.5)
        {
            weightStatus = "Under Weight";
        }
        else if(BMI >= 18.5 && BMI <= 24.9)
        {
            weightStatus = "Normal Weight";
        }
        else if(BMI >= 25.0 && BMI <= 29.9)
        {
            weightStatus = "Over Weight";
        }
        else if(BMI >= 30.0)
        {
            weightStatus = "Obese";
        }
        else
        {
            weightStatus = "Error";
        }
        
        //--------------
        //   OUTPUTS
        //--------------
        System.out.println();
        System.out.println("    BODY MASS INDEX (BMI) CALCULATOR    ");
        System.out.println("========================================");
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.print("Height (m): "  );
        System.out.format("%.2f", heightMeters);
        System.out.print("\nWeight (Kg): ");
        System.out.format("%.2f", weightKilos);
        System.out.print("\nBMI: ");
        System.out.format("%.2f", BMI);
        System.out.println("\nCategory: " + weightStatus);
        
    }
    
}
