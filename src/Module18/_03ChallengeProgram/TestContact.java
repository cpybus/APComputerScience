package Module18._03ChallengeProgram;


/**
 * @author Christopher Pybus
 * @date Apr 21, 2012
 * @file TestContact.java
 * @package Module18._03ChallengeProgram
 * 
 * @purpose 
 */

public class TestContact
{
	
	public static void main(String[] args)
	{
		Contact[] myContacts = { new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com"),
				new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com"),
				new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com"),
				new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com"),
				new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com"),
				new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com"),
		};
		
		printContacts(myContacts);
		findByName(myContacts, "Johnnie");
		findByName(myContacts, "Sam Parker");
		findByRelation(myContacts, "friend");
		findByRelation(myContacts, "Aunt");
		findByPhone(myContacts, "(333) 555-8989");
		findByPhone(myContacts, "(342) 555-7011");
		findByBMonth(myContacts, "May");
		findByBMonth(myContacts, "Mar");
		findByEmail(myContacts, "rgoodman@hotmail.com");
		findByEmail(myContacts, "susieE@hotmail.com");
		
		
	}
	
	public static void printContacts(Contact[] myContacts)
	{
		System.out.println(" Name            Relation    Birthday    Phone             Email");
		System.out.println("---------------------------------------------------------------------------------");
		for (Contact contact : myContacts)
		{
			System.out.println(contact);
		}
		System.out.println();
	}
	
	public static void findByName(Contact[] myContacts, String toFind)
	{
		sortContacts(myContacts, "name");
		
		int high = myContacts.length;
		int low = -1;
		int probe;
		
		while (high - low > 1)
		{
			probe = (high + low) / 2;
			if (myContacts[probe].getName().compareTo(toFind) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (myContacts[low].getName().compareTo(toFind) == 0))
		{
			System.out.println("Search - Title - " + toFind);
			System.out.println("Found: " + myContacts[low].toString());
			System.out.print("\n\n");
		}
		else
		{
			System.out.println("Search - Title - " + toFind);
			System.out.println("Not Found ");
			System.out.print("\n\n");
		}
	}
	
	public static void findByRelation(Contact[] myContacts, String toFind)
	{
		int numFound = 0;
		String output = "";
		
		for(Contact contact : myContacts)
		{
			if(contact.getRelation().toLowerCase().contains(toFind.toLowerCase()))
			{
				output = output + contact.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0)
		{
			System.out.println("0 matches were found for \"" + toFind + "\"\n\n");
		}
		else if(numFound == 1)
		{
			System.out.println("1 match was found for \"" + toFind + "\"");
			System.out.println(output+ "\n");
		}
		else if(numFound > 1)
		{
			System.out.println(numFound + " matches were found for \"" + toFind + "\"");
			System.out.println(output+ "\n");
		}
	}
	
	public static void findByBMonth(Contact[] myContacts, String toFind)
	{
		int numFound = 0;
		String output = "";
		
		for(Contact contact : myContacts)
		{
			if(contact.getBday().toLowerCase().contains(toFind.toLowerCase()))
			{
				output = output + contact.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0)
		{
			System.out.println("0 matches were found for \"" + toFind + "\"\n\n");
		}
		else if(numFound == 1)
		{
			System.out.println("1 match was found for \"" + toFind + "\"");
			System.out.println(output+ "\n");
		}
		else if(numFound > 1)
		{
			System.out.println(numFound + " matches were found for \"" + toFind + "\"");
			System.out.println(output+ "\n");
		}
	}
	
	public static void findByPhone(Contact[] myContacts, String toFind)
	{
		int numFound = 0;
		String output = "";
		
		for(Contact contact : myContacts)
		{
			if(contact.getPhone().toLowerCase().contains(toFind.toLowerCase()))
			{
				output = output + contact.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0)
		{
			System.out.println("0 matches were found for \"" + toFind + "\"\n\n");
		}
		else if(numFound == 1)
		{
			System.out.println("1 match was found for \"" + toFind + "\"");
			System.out.println(output+ "\n");
		}
		else if(numFound > 1)
		{
			System.out.println(numFound + " matches were found for \"" + toFind + "\"");
			System.out.println(output+ "\n");
		}
	}
	
	public static void findByEmail(Contact[] myContacts, String toFind)
	{
		sortContacts(myContacts, "email");
		
		int high = myContacts.length;
		int low = -1;
		int probe;
		
		while (high - low > 1)
		{
			probe = (high + low) / 2;
			if (myContacts[probe].getEmail().compareTo(toFind) > 0)
				high = probe;
			else
				low = probe;
		}
		if ((low >= 0) && (myContacts[low].getEmail().compareTo(toFind) == 0))
		{
			System.out.println("Search - Title - " + toFind);
			System.out.println("Found: " + myContacts[low].toString());
			System.out.print("\n\n");
		}
		else
		{
			System.out.println("Search - Title - " + toFind);
			System.out.println("Not Found ");
			System.out.print("\n\n");
		}
	}
	
	public static void sortContacts(Contact[] myContacts, String sortType)
	{
		int i;
		int k;
		int posmax;
		Contact temp;
		
		for (i = myContacts.length - 1; i >= 0; i--)
		{
			posmax = 0;
			for (k = 0; k <= i; k++)
			{
				if (sortType.equalsIgnoreCase("email"))
				{
					if (myContacts[k].getEmail().compareTo(myContacts[posmax].getEmail()) > 0)
						posmax = k;
				}
				else if (sortType.equalsIgnoreCase("phone"))
				{
					if (myContacts[k].getPhone().compareTo(myContacts[posmax].getPhone()) > 0)
						posmax = k;
				}
				else if (sortType.equalsIgnoreCase("birthday"))
				{
					if (myContacts[k].getBday().compareTo(myContacts[posmax].getBday()) > 0)
						posmax = k;
				}
				else if (sortType.equalsIgnoreCase("relation"))
				{
					if (myContacts[k].getRelation().compareTo(myContacts[posmax].getRelation()) > 0)
						posmax = k;
				}
				else
				{
					if (myContacts[k].getName().compareTo(myContacts[posmax].getName()) > 0)
						posmax = k;
				}
				
			}
			temp = myContacts[i];
			myContacts[i] = myContacts[posmax];
			myContacts[posmax] = temp;
		}
	}
}
