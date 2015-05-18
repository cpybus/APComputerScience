package Module19._01Exceptions;


import java.util.Arrays;

/**
 * @author Christopher Pybus
 * @date Apr 30, 2012
 * @file StudentData.java
 * @package Module19._01Exceptions
 * 
 * @purpose 
 */

public class StudentData
{
	String firstName;
	String lastName;
	double[] testScores;
	char grade;
	
	
	public StudentData(String firstName, String lastName, double[] testScores)
	{
		if(firstName == "" || lastName == "")
			throw new RuntimeException("Cant have empty name values.");
		this.firstName = firstName;
		this.lastName = lastName;
		this.testScores = testScores;
		
		courseGrade(testScores);
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}	
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}	
	
	public double[] getTestScores()
	{
		return testScores;
	}	
	
	public void setTestScores(double[] testScores)
	{
		this.testScores = testScores;
	}
	
	public char getGrade()
	{
		return grade;
	}
	
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	
	
	public void courseGrade(double [] list)
	{
		double total= 0;
		double average = 0;
		if(list.length == 0)
		{
			throw new RuntimeException("The grade list is empty. Cant find a grade average.");
		}
		else
		{
			for(double g : list)
			{
				total+= g;
			}
			
			average = total / list.length ;
			if(average >= 90)
				this.grade = 'A';
			else if (average < 90 && average >= 80)
				this.grade =  'B';
			else if (average < 80 && average >= 70)
				this.grade =  'C';
			else if (average < 70 && average >= 60)
				this.grade =  'D';
			else if (average < 60)
				this.grade =  'F';
		}
	}

	@Override
	public String toString()
	{
		String grades = "";
		for(double g : testScores)
		{
			grades = grades + " " + String.format("%6.2f", g);
		}
		
		return String.format("%10s%10s%20s%10C", firstName, lastName, grades, grade);
	}
	
	

	
	
}
