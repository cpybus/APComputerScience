package Module04._04BooleanAndConditional;


/**
 * The purpose of this program is to calculate the basic metabolic rate for someone. 
 * 
 * @author Chris Pybus
 * @version 10/8/11
 */
import java.util.Scanner;
class BMRCalc
{
    double BMR;

    BMRCalc()
    {
    }
    
    public void calcBMRMetric(int age, String gender, int height, int weight)
    {
        if(gender.equals("M"))
        {      
            BMR = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        }
        else if(gender.equals("F"))
        {
            BMR = 655 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        }
        else
        {
            System.out.println("Error 524, contact customer support. (1-800-123-4567)");
        }
    }
    
    public void calcBMREnglish(int age, String gender, int height, int weight)
    {
        if(gender.equals("M"))
        {
            BMR = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
        }
        else if(gender.equals("F"))
        {
            BMR = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        }
        else
        {
            System.out.println("Error 528, contact customer support. (1-800-123-4567)");
        }
    }
    
    public double getBMR()
    {
        return BMR;
    }
}

public class BasalMetabolicRate
{
    public static void main(String[] args)
    {
        String systemType;
        String name;
        String gender;
        int userage;
        int userHeight;
        int userWeight;       
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Basal Metabolic Rate Calculator");
        System.out.println();
      
        do //a safety feature that makes sure the user doesnt enter anything except M or E (For example, metric, m, Metric, english, E... etc.)
        {
            System.out.print("Do You Use Metric System, or English? (M or E): ");
            systemType = in.next();
        }
        while(!systemType.equals("M") && !systemType.equals("E"));
                
        System.out.print("Enter Your Name: ");
        name = in.next();
        
        do //a safety feature that makes sure the user doesnt enter anything except M or F (For example, Male, m, Female, f)
        {
            System.out.print("Gender (M or F): ");
            gender = in.next();
        }
        while(!gender.equals("M") && !gender.equals("F"));
        
        System.out.print("Enter Your Age: ");
        userage = in.nextInt();
        
        BMRCalc calc = new BMRCalc();
        if(systemType.equals("M"))
        {
            System.out.print("Enter Your Height (CentiMeters): ");
            userHeight = in.nextInt();
        
            System.out.print("Enter Your Weight (Kilos): ");
            userWeight = in.nextInt();
            
            calc.calcBMRMetric(userage, gender, userHeight, userWeight);
            double BMR2 = calc.getBMR();
            System.out.println();
            System.out.println(name + ", Using the information you entered above, your Basal Metabolic Rate is: " + BMR2);
        }
        else if(systemType.equals("E"))
        {
            System.out.print("Enter Your Height (Inches): ");
            userHeight = in.nextInt();
        
            System.out.print("Enter Your Weight (Pounds): ");
            userWeight = in.nextInt();
            
            calc.calcBMREnglish(userage, gender, userHeight, userWeight);
            double BMR2 = calc.getBMR();
            System.out.println();
            System.out.println(name + ", Using the information you entered above, your Basal Metabolic Rate is: " + BMR2);
        }
        
       
            
    }   
}
