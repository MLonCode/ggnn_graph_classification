package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int i;
		for (i = 2;i < n;i++)
		{
						if (n % i == 0)
						{
						break;
						}
		}
		if (i == n)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}

	public static int scan(int n)
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int r;
		int s = 1;
		int t = 1;
		int count = 0;
		for (i = 0;;i++)
		{
					 t = 10 * t;
					 if (n / t == 0)
					 {
					 break;
					 }
		}
		for (j = 0;j <= i / 2;j++)
		{
						   t = t / 10;
						   s = s * 10;
						   r = s / 10;
						   a = (n / t) % 10;
						   b = (n % s) / r;
						   if (a == b)
						   {
						   count++;
						   }
		}
		if (count == i / 2 + 1)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}

	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int p = 0;
		  int q = 0;
		  int count = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  for (i = a;i <= b;i++)
		  {
					  p = judge(i);
					  q = scan(i);
					  if (p == 1 && q == 1 && count != 0)
					  {
											  count++;
											  System.out.printf(",%d",i);
					  }
					  if (p == 1 && q == 1 && count == 0)
					  {
											  System.out.printf("%d",i);
											  count++;
					  }
		  }
		  if (count != 0)
		  {
		  System.out.print("\n");
		  }
		  else
		  {
		  System.out.print("no\n");
		  }
		  return 0;
	}
}

