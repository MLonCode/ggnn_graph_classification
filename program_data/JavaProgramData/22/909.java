package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int r = 0;
	   int p;
	   int q;
	   int n;
	   int k = 0;
	   char a;
	   while (a != 10)
	   {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 a = System.in.read();
		 k = k + 1;
		 r = r + 1;
		 if (k == 1)
		 {
			  q = n;
			  p = 0;
		 }
		 else if (k == 2)
		 {
			  if (n <= q)
			  {
				p = n;
			  }
			else
			{
				  p = q;
				  q = n;
			}
		 }
		  else
		  {
			   if (n >= p != 0 && n <= q)
			   {
					 if (n == q)
					 {
						 p = p;
						 q = n;
					 }
				   else
				   {
						  p = n;
						  q = q;
				   }
			   }
			   else if (n < p)
			   {
					   if (p == q)
					   {
						   p = n;
						   q = q;
					   }
					 else
					 {
						 p = p;
						 q = q;
					 }
			   }
			   else
			   {
					  if (p == q)
					  {
						 p = p;
						 q = n;
					  }
					else
					{
						p = q;
						q = n;
					}
			   }
		  }
	   }
		if (r == 1)
		{
		  System.out.print("No");
		}
		else if (p == q)
		{
		  System.out.print("No");
		}
		else
		{
		  System.out.printf("%d",p);
		}
	   return 0;
	}




}

