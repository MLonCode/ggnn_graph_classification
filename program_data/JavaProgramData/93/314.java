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
	  int count = 0;
	  int t1;
	  int t2;
	  int t3;
	  if (n % 3 == 0)
	  {
		count++;
		t1 = 3;
		if (n % 5 == 0)
		{
		  count++;
		  t2 = 5;
		  if (n % 7 == 0)
		  {
		  count++;
		  t3 = 7;
		  }
		}
		else if (n % 7 == 0)
		{
		  count++;
		  t2 = 7;
		}
	  }
	  else if (n % 5 == 0)
	  {
		count++;
		t1 = 5;
		if (n % 7 == 0)
		{
		  count++;
		  t2 = 7;
		}
	  }
	  else if (n % 7 == 0)
	  {
		count++;
		t1 = 7;
	  }

	  if (count == 3)
	  {
	   System.out.printf("%d %d %d",t1,t2,t3);
	  }
	  else if (count == 2)
	  {
		System.out.printf("%d %d",t1,t2);
	  }
	  else if (count == 1)
	  {
	  System.out.printf("%d",t1);
	  }
	  else if (count == 0)
	  {
	  System.out.print("n");
	  }

	}
}

