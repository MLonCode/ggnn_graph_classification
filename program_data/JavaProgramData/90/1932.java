package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m == 1 && n >= 1)
		{
			return 1;
		}
		if (n == 1 && m >= 1)
		{
			return 1;
		}
		if (m < 0 || n < 1)
		{
			return 0;
		}
		if (m == 0 && n >= 1)
		{
			return 1;
		}
		if (m > 1 && n > 1)
		{
			return f(m, n - 1) + f(m - n, n);
		}

	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",f(m, n));
		}
		return 0;
	}

}

