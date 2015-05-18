package Module16._05ChallengeProgram;


import java.util.ArrayList;
/**
 * @author Christopher Pybus
 * @date Apr 3, 2012
 * @file TestSolution.java
 * @package Module16._05ChallengeProgram
 * 
 * @purpose 
 */

public class TestStudent
{
	
	public static void main(String[] args)
	{
		ArrayList<Student> myClass = new ArrayList<Student>();
		myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
		myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
		myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
		myClass.add(new Student("Betty Farm", 50, 79, 89, 99, 100));
		myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
		
		System.out.println("Original Gradebook:");
		printBook(myClass);
		
		System.out.println();
		System.out.println("Changing Betty's name to Betty Boop");
		myClass = replaceName(myClass, "Betty Farm", "Betty Boop");
		printBook(myClass);
		
		System.out.println();
		System.out.println("Changing Jean's quiz 1 score to 80");
		myClass = replaceQuiz(myClass, "Jean Smith", 1, 80);
		printBook(myClass);
		
		System.out.println();
		System.out.println("Replacing Dilbert with Mike Kappa: 80, 80, 80, 90, 90");
		myClass = replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
		printBook(myClass);
		
		System.out.println();
		System.out.println("Inserting Lily Mu: 85, 95, 70, 0, 100 before Betty");
		myClass = insertStudent(myClass, "Betty Farm", "Lily Mu", 85, 95, 70, 0, 100);
		printBook(myClass);
		
		System.out.println();
		System.out.println("Deleting Max Gerard");
		myClass = deleteStudent(myClass, "Max Gerard");
		printBook(myClass);
		
		
		//printBook(replaceName(myClass, "JeanSmith"))
	}
	
	public static void printBook(ArrayList<Student> myClass)
	{
		do
		{
			myClass.remove(null);
		}while(myClass.contains(null));
		
		System.out.println("  Student Name        Q1     Q2     Q3     Q4     Q5");
		System.out.println("------------------------------------------------------");
		for(Student student : myClass)
		{
			student.toString();
		}
	}
	
	public static ArrayList<Student> replaceName(ArrayList<Student> myClass, String name, String replaceName)
	{
		do
		{
			myClass.remove(null);
		}while(myClass.contains(null));
		
		for(Student student : myClass)
		{
			if(student.getName().equalsIgnoreCase(name))
			{
				student.setName(replaceName);
				break;
			}
		}
		
		return myClass;
	}
	
	public static ArrayList<Student> replaceQuiz(ArrayList<Student> myClass, String name, int quizNum, int replaceValue)
	{
		do
		{
			myClass.remove(null);
		}while(myClass.contains(null));
		
		for(Student student : myClass)
		{
			if(student.getName().equalsIgnoreCase(name))
			{
				student.setQuiz(quizNum, replaceValue);
				break;
			}
		}
		return myClass;
	}
	
	public static ArrayList<Student> replaceStudent(ArrayList<Student> myClass, String name, String replaceName, int qz1, int qz2, int qz3, int qz4, int qz5)
	{
		do
		{
			myClass.remove(null);
		}while(myClass.contains(null));
		
		for(Student student : myClass)
		{
			if(student.getName().equalsIgnoreCase(name))
			{
				student.setName(replaceName);
				student.setQuiz(1, qz1);
				student.setQuiz(2, qz2);
				student.setQuiz(3, qz3);
				student.setQuiz(4, qz4);
				student.setQuiz(5, qz5);
				break;
			}
		}
		return myClass;
	}
	
	public static ArrayList<Student> insertStudent(ArrayList<Student> myClass, String name, String replaceName, int qz1, int qz2, int qz3, int qz4, int qz5)
	{
		do
		{
			myClass.remove(null);
		}while(myClass.contains(null));
		
		int position = -1;
		for(int i = 0; i < myClass.size(); i++)
		{
			if(myClass.get(i).getName().equalsIgnoreCase(name))
			{
				position = i;
				break;
			}
		}
		
		if(position == -1)
			return myClass; //If name wasnt found, cancel the operation and return the unchanged list.
		
		// ...Could just do this...
		// myClass.add(position, new Student(replaceName, qz1, qz2, qz3, qz4, qz5));
		
		for( int i = myClass.size() - 1 ; i > position ; i-- )
		{
			myClass.set(i, myClass.get(i-1));
		}
		myClass.set(position, new Student(replaceName, qz1, qz2, qz3, qz4, qz5));
		return myClass;
	}
	
	public static ArrayList<Student> deleteStudent(ArrayList<Student> myClass, String name)
	{
		do
		{
			myClass.remove(null);
		}while(myClass.contains(null));
		
		int position = -1;
		for(int i = 0; i <= myClass.size(); i++)
		{
			if(myClass.get(i).getName().equalsIgnoreCase(name))
			{
				position = i;
				break;
			}
		}
		
		// ...Could just do this...
		// myClass.remove(position)
		
		myClass.set(position, null);
		
		return myClass;
	}
}
