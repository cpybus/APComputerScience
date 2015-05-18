package Module15._05ChallengeProgram;

import java.util.ArrayList;

/**
 * @author Christopher Pybus
 * @date Apr 1, 2012
 * @file InventoryDemo.java
 * @package Module15._05ChallengeProgram
 * 
 * @purpose 
 */

public class InventoryDemo
{
	
	public static void main(String[] args)
	{
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Car("Jaguar", 1000000.00)); 
		products.add(new Car("Neon", 17000.00));
		products.add(new Tool("JigSaw", 149.18));
		products.add(new Car("Jaguar", 1100000.00));
		products.add(new Car("Neon", 17500.00));
		products.add(new Car("Neon", 17875.32));
		products.add(new Truck("RAM", 35700.00));
		products.add(new Tool("CircularSaw", 200.00));
		products.add(new Tool("CircularSaw", 150.00));
		
		takeInventory(products.get(2).getName(), products);
		takeInventory(products.get(1).getName(), products);
		takeInventory(products.get(0).getName(), products);
		takeInventory(products.get(6).getName(), products);
		takeInventory(products.get(8).getName(), products);
		
		Tool saw1 = new Tool("Saw1", 100.00);
		Tool saw2 = new Tool("Saw2", 200.00);
		
		if(saw1.compareTo(saw2) == -1)
			System.out.println("Saw1 is less expensive than Saw2");
		else if(saw1.compareTo(saw2) == 0)
			System.out.println("Saw1 is the same price as Saw2");
		else if(saw1.compareTo(saw2) == 1)
			System.out.println("Saw1 is more expensive than Saw2");
		
	}
	
	public static void takeInventory(String name, ArrayList<Product> products)
	{
		int quantity = 0;
		double totalCost = 0;
		for(Product pr : products)
		{
			if(pr.getName().equalsIgnoreCase(name))
			{
				quantity += 1;
				totalCost += pr.getCost();
			}
		}
		
		System.out.println(name + " - \n  Quantity: " + quantity + "\n  Total Cost: " + totalCost);
	}
	
}
