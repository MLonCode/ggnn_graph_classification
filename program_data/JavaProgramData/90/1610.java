package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int k;
		if (m == 1 || n == 1)
		{
			k = 1;
		}
		else if (m == n)
		{
			k = 1 + f(m, n - 1);
		}
		else if (m > n)
		{
			k = f(m, n - 1) + f(m - n, n);
		}
		else
		{
			k = f(m, m);
		}
		return (k);
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
		for (i = 1;i <= t;i++)
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
	}
}

