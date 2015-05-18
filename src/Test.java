
public class Test
{
	
	public static void main(String[] args)
	{
		
	    System.out.print(product(25));
	}
	
	private static int product(int n)
    {
      if (n <= 1)
        return 1;
      else
        return n * product(n-2);
    }
}

