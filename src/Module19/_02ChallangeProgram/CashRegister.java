package Module19._02ChallangeProgram;

/**
 * @author Christopher Pybus
 * @date May 5, 2012
 * @file CashRegister.java
 * @package Module19._02ChallangeProgram
 * 
 * @purpose 
 */

public class CashRegister
{
	int cashOnHand;

	public CashRegister(int cashOnHand)
	{
		if(cashOnHand < 0)
			throw new RuntimeException("Cannot have negative cash");
		else
			this.cashOnHand = cashOnHand;
	}

	public CashRegister()
	{
		this.cashOnHand = 500;
	}
	
	public void acceptAmount(int amount)
	{
		if(amount < 0)
			throw new RuntimeException("Cannot have negative cash");
		else
			cashOnHand += amount;
	}
	
	public int getCash()
	{
		return cashOnHand;
	}
	
	

	
	
	
}
