package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
	x = 0;
	y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 1)
			{
			   x++;
			}
		  if (a[i] == 0 && b[i] == 2)
		  {
			   y++;
		  }
			   if (a[i] == 1 && b[i] == 2)
			   {
			   x++;
			   }
	if (a[i] == 1 && b[i] == 0)
	{
	y++;
	}
	if (a[i] == 2 && b[i] == 0)
	{
		x++;
	}
	if (a[i] == 2 && b[i] == 1)
	{
	y++;
	}
		}
	if (x > y)
	{
	System.out.print("A");
	}
	else if (x == y)
	{
	System.out.print("Tie");
	}
	else if (x < y)
	{
	System.out.print("B");
	}
			   return 0;
	}


}

