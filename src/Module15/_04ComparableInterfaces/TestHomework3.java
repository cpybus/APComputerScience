package Module15._04ComparableInterfaces;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file TestHomework3.java
 * @package Module15._04ComparableInterfaces
 * 
 * @purpose 
 */

public class TestHomework3
{
	
	public static void main(String[] args)
	{
		MyMath3 math = new MyMath3(); 
		math.createAssignment(4);
		MyScience3 science = new MyScience3();
		science.createAssignment(6);
		MyEnglish3 english = new MyEnglish3();
		english.createAssignment(4);
		MyJava3 java = new MyJava3();
		java.createAssignment(5);
		
		ArrayList<Homework3> hw = new ArrayList<Homework3>();
		
		hw.add(math);
		hw.add(science);
		hw.add(english);
		hw.add(java);
		for(Homework3 h : hw)
		{
			System.out.println(h.toString());
		}
		
		if (math.compareTo(english) == 0 )

		       System.out.println("The homework for math and english are the same number of pages.");

		    else

		       System.out.println("The homework for math and english are not the same number of pages.");
	}
	
}
