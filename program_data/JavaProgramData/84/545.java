package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 3;i <= n;i = i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if (c >= a)
			{
				b = a;
				a = c;
			}
			else if (a > c && c > b)
			{
				b = c;
			}
		}
		System.out.printf("%d\n%d",a,b);
	}






}

