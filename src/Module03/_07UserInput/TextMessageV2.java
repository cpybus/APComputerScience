package Module03._07UserInput;


/**
 * @author Chris Pybus 
 * @version 9/17/2011
 * @purpose The purpose of this program is to convert a regular text message into one that uses acromyns
 * 
 */
import java.util.Scanner;
public class TextMessageV2
{
	public static void main(String[ ] args)
	{
	    Scanner in;
	    in = new Scanner(System.in);
	    
	    System.out.print("Please Enter Text To Be Converted: ");
	    String originalText = in.nextLine();
	    System.out.println();
	    //String originalText = "hey man, i dont know if i'm going tomorrow to starbucks...are you going? john says its gonna to be a blast, though, and \n that we're gonna be laughing out loud the entire time. but anyways, talk to you later...";
	    int originalTextLength = originalText.length();
	    
	    String replacePhrases = originalText.replace("i dont know", "IDK");
	    replacePhrases = replacePhrases.replace("tomorrow", "2morro");
	    replacePhrases = replacePhrases.replace("starbucks", "*S");
	    replacePhrases = replacePhrases.replace("are you going", "r u goin");
	    replacePhrases = replacePhrases.replace("laughing out loud", "LOL");
	    replacePhrases = replacePhrases.replace("anyways", "ne-wayz");
	    replacePhrases = replacePhrases.replace("talk to you later", "TTYL");
	    int newTextLength = replacePhrases.length();
	    
	    System.out.println("Original Text Message: " );
	    System.out.println(" " + originalText);
	    System.out.println(" Message Length: " + originalTextLength);
	    
	    System.out.println();
	    
	    System.out.println("New Text Message:  " );
	    System.out.println(" " + replacePhrases);
	    System.out.println(" Message Length: " + newTextLength);
	    
	}//end of main method
}//end of class
