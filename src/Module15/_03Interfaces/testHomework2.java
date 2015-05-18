package Module15._03Interfaces;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file testHomework2.java
 * @package Module15._03Interfaces
 * 
 * @purpose 
 */

public class testHomework2
{
	public static void main(String[] args)
	{
		MyMath2 math = new MyMath2();
		math.createAssignment(4);
		MyScience2 science = new MyScience2();
		science.createAssignment(6);
		MyEnglish2 english = new MyEnglish2();
		english.createAssignment(10);
		MyJava2 java = new MyJava2();
		java.createAssignment(5);
		
		ArrayList<Homework2> hw = new ArrayList<Homework2>();
		
		hw.add(math);
		hw.add(science);
		hw.add(english);
		hw.add(java);
		for(Homework2 h : hw)
		{
			System.out.println("Before Reading: ");
			System.out.println(h.toString());
			h.doReading();
			System.out.println("After Reading: ");
			System.out.println(h.toString());
		}
	}
}
