package Module19._02ChallangeProgram;

/**
 * @author Christopher Pybus
 * @date May 5, 2012
 * @file CandyMachine.java
 * @package Module19._02ChallangeProgram
 * 
 * @purpose 
 */

public class CandyMachine
{
	
	public static void main(String[] args)
	{
		Dispenser dis = new Dispenser(100, 1);
		CashRegister cr = new CashRegister(1000);
		sellProduct(dis, cr, 10);
	}
	
	public static void sellProduct(Dispenser dis, CashRegister cr, int amount)
	{
		int numItems = dis.getCount();
		int cost = dis.getProductCost();
		int cash = cr.getCash();
		int amount2 = amount;
		int cash2 = cash;
		
		do
		{
			if (cash > cost)
			{
				if (dis.getCount() > 0)
				{
					dis.makeSale();
					amount--;
					cash = cash - cost;
				}
				else
				{
					throw new RuntimeException("The CandyMachine ran out of product.");
				}
			}
			else
			{
				throw new RuntimeException("You do not have enough money.");
			}
		}
		while (amount > 0);
		
		System.out.println("BEFORE SALE: ");
		System.out.println("   Each candy costs: " + cost);
		System.out.println("   The machine has " + numItems + " pieces of candy");
		System.out.println("   You have " + cash2 + " coins.");
		System.out.println("AFTER SALE: ");
		System.out.println("   Each candy costs: " + cost);
		System.out.println("   The machine has " + dis.getCount() + " pieces of candy");
		System.out.println("   The machine sold you " + (numItems - dis.getCount()) + " pieces of candy.");
		System.out.println("   You have " + cash + " coins.");
		System.out.println();
		System.out.println("Collect your " + amount2 + " pieces of candy.");
	}
	
}
