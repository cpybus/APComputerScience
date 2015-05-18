package Module16._05ChallengeProgram;


/**
 * @author Christopher Pybus
 * @date Apr 3, 2012
 * @file Student.java
 * @package Module16._05ChallengeProgram
 * 
 * @purpose 
 */

public class Student
{
	
	private String name;
	private int qz1, qz2, qz3, qz4, qz5;
	
	public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
	{
		this.name = name;
		this.qz1 = qz1;
		this.qz2 = qz2;
		this.qz3 = qz3;
		this.qz4 = qz4;
		this.qz5 = qz5;
	}

	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getQuiz(int num)
	{
		if (num == 1)
			return qz1;
		else if (num == 2)
			return qz2;
		else if (num == 3)
			return qz3;
		else if (num == 4)
			return qz4;
		else if (num == 5)
			return qz5;
		else
			return 0;
	}
	
	public void setQuiz(int num, int value)
	{
		if (num == 1)
			this.qz1 = value;
		else if (num == 2)
			this.qz2 = value;
		else if (num == 3)
			this.qz3 = value;
		else if (num == 4)
			this.qz4 = value;
		else if (num == 5)
			this.qz5 = value;
		else
		{
			
		}
	}
	
	public String toString()
	{
		System.out.printf("  %-15s%7d%7d%7d%7d%7d\n", name, qz1, qz2, qz3, qz4, qz5);
		return "%15s%7d%7d%7d%7d%7d";
	}
}
