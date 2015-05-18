package Module19._01Exceptions;


/**
 * @author Christopher Pybus
 * @date Apr 30, 2012
 * @file TestStudentData.java
 * @package Module19._01Exceptions
 * 
 * @purpose 
 */

public class TestStudentData
{
	
	public static void main(String[] args)
	{
		double[] d = {88.00, 98.00, 78.00};
		double[] d2 = {76.00, 95.00, 84.00};
		double[] d3 = {56.00, 56.00, 20.00};
		StudentData sd = new StudentData("Joe", "Smith", d );
		StudentData sd2 = new StudentData("John", "Doe", d2 );
		StudentData sd3 = new StudentData("Billy", "Bob", d3);
		
		System.out.println(sd);
		System.out.println(sd2);
		System.out.println(sd3);
	}
	
	
	
}
