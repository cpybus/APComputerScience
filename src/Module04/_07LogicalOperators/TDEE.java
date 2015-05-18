
package Module04._07LogicalOperators;

import java.util.Scanner;

/**
 * @author Chris
 * @version Oct 23, 2011
 * @packageName Module4._07LogicalOperators
 * @fileName TDEE.java
 * 
 * @purpose Purpose of this project is to calculate Total Daily Energy
 *          Expenditure
 * 
 */
public class TDEE
{
	public static void main(String[] args)
	{
		//==============
		// Variables
		//==============
		Scanner in = new Scanner(System.in);
		String userName;
		String userBMR;
		String userGender;
		int userAge;
        int userHeight;
        int userWeight; 
        String userAL;
        double BMR = 0;
        double TDEE = 0;
        int genderReps = 0;
        double activityMultiplier = 0;
		
        //==============
        // User Input
        //==============
		System.out.print("Please enter your name: ");
		userName = in.nextLine();
		do 
        {
			if(genderReps > 0)
			{
				System.out.println("Im sorry, but that wasnt a valid entry. Please try again.");
			}
            System.out.print("Please enter your gender (M/F): ");
            userGender = in.next();
            genderReps = genderReps + 1;
        }
        while(!userGender.equalsIgnoreCase("M") && !userGender.equalsIgnoreCase("F"));
		System.out.print("Please enter your BMR (Dont Know It? Type 'IDK' to find out!): ");
		userBMR = in.next();
		if(userBMR.equalsIgnoreCase("IDK") || userBMR.equalsIgnoreCase("'IDK'") )
		{
			System.out.println();
			System.out.println("|==========================================");
			System.out.println("|  Basal Metabolic Rate Calculator");
	        System.out.println("|");
	        
	        System.out.print("|  Enter Your Age: ");
	        userAge = in.nextInt();
	        
	        System.out.print("|  Enter Your Height (Inches): ");
	        userHeight = in.nextInt();
	        
	        System.out.print("|  Enter Your Weight (Pounds): ");
	        
	        userWeight = in.nextInt();
	            
	        if(userGender.equalsIgnoreCase("M"))
	        {
	            BMR = 66 + (6.23 * userWeight) + (12.7 * userHeight) - (6.8 * userAge);
	        }
	        else if(userGender.equalsIgnoreCase("F"))
	        {
	            BMR = 655 + (4.35 * userWeight) + (4.7 * userHeight) - (4.7 * userAge);
	        }
	        
	        System.out.println("|  ");
	        System.out.println("|  Using the information you entered above, \n|  your Basal Metabolic Rate is: \n|                                  " + BMR);
	        System.out.println("|==========================================");
		}
		else
		{
			BMR = Integer.parseInt(userBMR);
		}
		System.out.println();
		System.out.println("Select Your Activity Level");
		System.out.println("[0] Resting (Sleeping, Reclining)");
		System.out.println("[1] Sedentary (Minimal Movement)");
		System.out.println("[2] Light (Sitting, Standing)");
		System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
		System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
		System.out.println("[5] Extreamly Active (Full-Time Athlete, Heavy Manual Labor)");
		System.out.println();
		System.out.print("Enter the number corresponding to your activity level: ");
		userAL = in.next();
		
		//==============
        // Calculations
        //==============
		if(userGender.equalsIgnoreCase("M"))
		{
		    if(userAL.equalsIgnoreCase("0"))
		    {
		    	activityMultiplier = 1;
		    }
		    else if(userAL.equalsIgnoreCase("1"))
		    {
			    activityMultiplier = 1.3;
			}
			else if (userAL.equalsIgnoreCase("2"))
	    	{
				activityMultiplier = 1.6;
		    }
		    else if(userAL.equalsIgnoreCase("3"))
	    	{
		    	activityMultiplier = 1.7;
    		}
	      	else if(userAL.equalsIgnoreCase("4"))
	    	{
	      		activityMultiplier = 2.1;
	    	}
	    	else if(userAL.equalsIgnoreCase("5"))
	    	{
	    		activityMultiplier = 2.4;	
	    	}
		    else
	    	{
	    		System.out.println("[Error 5739] Please Contact Customer Service");
	    	}
		}
		else if(userGender.equalsIgnoreCase("F"))
		{
			if(userAL.equalsIgnoreCase("0"))
		    {
		    	activityMultiplier = 1;
		    }
		    else if(userAL.equalsIgnoreCase("1"))
		    {
			    activityMultiplier = 1.3;
			}
			else if (userAL.equalsIgnoreCase("2"))
	    	{
				activityMultiplier = 1.5;
		    }
		    else if(userAL.equalsIgnoreCase("3"))
	    	{
		    	activityMultiplier = 1.6;
    		}
	      	else if(userAL.equalsIgnoreCase("4"))
	    	{
	      		activityMultiplier = 1.9;
	    	}
	    	else if(userAL.equalsIgnoreCase("5"))
	    	{
	    		activityMultiplier = 2.2;	
	    	}
		    else
	    	{
	    		System.out.println("[Error 7352] Please Contact Customer Service");
	    	}
		}
		System.out.println();
		TDEE = BMR * activityMultiplier;
		
		//==============
        // Output
        //==============
		System.out.println("Name: " + userName + "       Gender: " + userGender);
		System.out.println("BMR: " + BMR + "       Activity Level: " + activityMultiplier);
		System.out.println("TDEE: " + TDEE);
		
	}
}
