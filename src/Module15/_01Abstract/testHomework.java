package Module15._01Abstract;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Mar 31, 2012
 * @file testHomework.java
 * @package Module15._01Abstract
 * 
 * @purpose 
 */

public class testHomework
{
	
	public static void main(String[] args)
	{
		MyMath math = new MyMath();
		math.createAssignment(4);
		MyScience science = new MyScience();
		science.createAssignment(6);
		MyEnglish english = new MyEnglish();
		english.createAssignment(10);
		MyJava java = new MyJava();
		java.createAssignment(5);
		
		ArrayList<Homework> hw = new ArrayList<Homework>();
		
		hw.add(math);
		hw.add(science);
		hw.add(english);
		hw.add(java);
		for(Homework h : hw)
		{
			System.out.println(h.toString());
		}
	}
	
}
