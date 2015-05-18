package Module03._09StringMethods;


/**
 * This program uses a variety of string methods and user input functions to create
 * and email to be sent to a person who has an overdue book. 
 * 
 * @author Chris Pybus 
 * @version 09/18/11
 */
import java.util.Scanner;
public class ChallengeProgram
{
    public static void main(String [] args)
    {
        Scanner in;
        in = new Scanner(System.in);
        
        System.out.print("Enter name (Last, First) and Social Security Number (###-##-####): ");
        String nameAndNumber = in.nextLine();
        System.out.println();
        
        System.out.print("Enter the title of the book: ");
        String bookName = in.nextLine();
        System.out.println();
        
        System.out.print("Enter the date checked out (mm/dd/yyyy): ");
        String checkedOutDate = in.next();
        System.out.println();
        
        System.out.print("Days Late: ");
        String late = in.next();
        System.out.println();
        
        System.out.print("Daily fine: ");
        String fine = in.next();
        System.out.println();
        
        String[] nameAndSSN = nameAndNumber.split(" ");
        String lastName = nameAndSSN[0];
        String firstName = nameAndSSN[1];
        String ssn = nameAndSSN[2];
        String accountName = lastName.replace(",","") + firstName.substring(0,1) + "-" + ssn.substring(7,11);
        
        int daysLate = Integer.parseInt(late);
        double dailyFine = Double.parseDouble(fine);
        
        System.out.print("To: " + lastName + " " + firstName);
        System.out.println("\t \t Account: " + accountName);
        System.out.println("From: Coronado Public Library");
        System.out.println("Subject: Overdue Notice");
        System.out.println("=========================================================");
        System.out.println("\"" + bookName + "\" was checked out on: " + checkedOutDate);
        System.out.println("This book is currently " + daysLate + " days late.");
        System.out.println("Your fine has accumulated to: " + (daysLate*dailyFine));
        
        
    }
}
