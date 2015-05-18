package Module03._06TestMessageCoder;


/**
 * @author Chris Pybus
 * @version 9/17/11
 * 
 * The purpose of this program is to edit a text message using string methods. 
 */
public class TextMessageV1
{
	public static void main(String[ ] args)
	{
	    String originalText = "hey man, i dont know if i'm going tomorrow to starbucks...are you going? john says its gonna to be a blast, though, and \n that we're gonna be laughing out loud the entire time. but anyways, talk to you later...";
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
