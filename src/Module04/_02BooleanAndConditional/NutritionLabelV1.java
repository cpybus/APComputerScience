package Module04._02BooleanAndConditional;

/**
 * The purpose of this program is to tell the user the nutrition facts of the food they are eating. 
 * 
 * ©FLVS 2007
 * @author Chris Pybus
 * @version 10/7/11
 */
import java.util.Scanner;
public class NutritionLabelV1
{
    public static void main(String[] args)
    {
        String foodItem;                            //food item
        
        int dailyTotalCalories = 2000;              //max daily calories
        int dailyValueGramsTotalFat = 65;           //fat DRV    
        int dailyValueTotalCarbs = 300;             //carbohydrates DRV       
        int dailyValueFiber = 25;                   //fiber DRV
        int dailyValueProtein =  50;                         //protein DRV
  
        //object to use the keyboard input methods
        Scanner in = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter the name of the food item: ");
        foodItem = in.nextLine();
        System.out.println();
        
        //serving size
        System.out.print("How many servings will you eat? ");
        int servingSize = in.nextInt();
        System.out.println();
        
        //calories
        System.out.print("Enter Calories per Serving: ");
        int totalCalories = in.nextInt();
        totalCalories = totalCalories * servingSize;
        int percentTotalCalories = totalCalories * 100 / dailyTotalCalories;
        boolean isTotalCalories = totalCalories < dailyTotalCalories;
        
        //fat
        System.out.print("Enter grams of Total Fat per Serving: ");
        int totalGramsFat = in.nextInt();
        totalGramsFat = totalGramsFat * servingSize;
        int percentTotalGramsFat = totalGramsFat * 100 / dailyValueGramsTotalFat;
        boolean isTotalGramsFat = totalGramsFat <  dailyValueGramsTotalFat;
        
        //carbs
        System.out.print("Enter grams Carbohydrate per serving: ");
        int totalCarbs = in.nextInt();
        totalCarbs = totalCarbs * servingSize;
        int percentTotalCarbs = totalCarbs * 100 / dailyValueTotalCarbs;
        boolean isTotalCarbs = totalCarbs <  dailyValueTotalCarbs;
        
        //fiber
        System.out.print("Enter grams Fiber per serving: ");
        int totalFiber = in.nextInt();
        totalFiber = totalFiber * servingSize;
        int percentTotalFiber = totalFiber * 100 / dailyValueFiber;
        boolean isTotalFiber = totalFiber <  dailyValueFiber;
        
        //protein
        System.out.print("Enter grams Protein per serving: ");
        int totalProtein = in.nextInt();
        totalProtein = totalProtein * servingSize;
        int percentTotalProtein = totalProtein * 100 / dailyValueProtein;
        boolean isTotalProtein = totalProtein <  dailyValueProtein;
        
        //output
        
        
        System.out.println("Food: " + foodItem);
        System.out.println("Serving Size: " + servingSize);
        
        System.out.println();
        System.out.println("Component         Total      Percent     Less than Daily Value ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Calories:             " + totalCalories + "          " + percentTotalCalories + "          " + isTotalCalories);
        System.out.println("Fat:                   " + totalGramsFat + "          " + percentTotalGramsFat + "          " + isTotalGramsFat);  
        System.out.println("Carbohydrat:          " + totalCarbs    + "         " + percentTotalCarbs    + "          " + isTotalCarbs);
        System.out.println("Dietary Fiber:         " + totalFiber    + "         " + percentTotalFiber    + "          " + isTotalFiber);
        System.out.println("Calories:              " + totalProtein  + "         " + percentTotalProtein  + "          " + isTotalProtein);
      
       

       
        
        
    }//end of main method    
}//end of class