package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n % 3 == 0)
	   {
		   if (n % 5 == 0)
		   {
			   if (n % 7 == 0)
			   {
				   System.out.print("3 5 7");
			   }
			   else
			   {
				   System.out.print("3 5");
			   }
		   }
	   }
	   if (n % 3 == 0)
	   {
		   if (n % 7 == 0)
		   {
				if (n % 5 != 0)
				{
					System.out.print("3 7");
				}
		   }
	   }
	   if (n % 5 == 0)
	   {
		   if (n % 7 == 0)
		   {
				if (n % 3 != 0)
				{
					System.out.print("5 7");
				}
		   }
	   }
		if (n % 5 != 0)
		{
		   if (n % 7 != 0)
		   {
			   if (n % 3 != 0)
			   {
					System.out.print("n");
			   }
		   }
		}
		if (n % 5 == 0)
		{
		   if (n % 7 != 0)
		   {
				if (n % 3 != 0)
				{
					System.out.print("5");
				}
		   }
		}
		if (n % 5 != 0)
		{
		   if (n % 7 == 0)
		   {
				if (n % 3 != 0)
				{
					System.out.print("7");
				}
		   }
		}
		if (n % 5 != 0)
		{
		   if (n % 7 != 0)
		   {
				if (n % 3 == 0)
				{
					System.out.print("3");
				}
		   }
		}


	}
}

