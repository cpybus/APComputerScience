package Module18._03ChallengeProgram;


/**
 * @author Christopher Pybus
 * @date Apr 21, 2012
 * @file Contact.java
 * @package Module18._03ChallengeProgram
 * 
 * @purpose 
 */

public class Contact
{
	String name;
	String relation;
	String bday;
	String phone;
	String email;
	public Contact(String name, String relation, String bday, String phone, String email)
	{
		super();
		this.name = name;
		this.relation = relation;
		this.bday = bday;
		this.phone = phone;
		this.email = email;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getRelation()
	{
		return relation;
	}
	
	public void setRelation(String relation)
	{
		this.relation = relation;
	}
	
	public String getBday()
	{
		return bday;
	}
	
	public void setBday(String bday)
	{
		this.bday = bday;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String toString()
	{
		return String.format(" %-16s%-12s%-12s%-18s%-18s", name, relation, bday, phone, email);
	}
	
	
}
