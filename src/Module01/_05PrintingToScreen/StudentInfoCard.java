package Module01._05PrintingToScreen;

import java.util.Scanner;

/**
 * Program
 * 
 * File: HelloWorld.java
 * 
 * @author Chris Pybus
 * @version 03/08/11
 */

public class StudentInfoCard
{
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String studentID = "";
		do
		{
			
			System.out.print("Enter your Student ID: ");
			
			studentID = in.next();
			
		}
		while (studentID == null);
	}
}
