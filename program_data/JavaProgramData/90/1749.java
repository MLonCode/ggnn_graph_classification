package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int k = 0;
		if (m < 0)
		{
			k = 0;
		}
		else if (m == 0)
		{
			k = 1;
		}
		else if (n == 1)
		{
			k = 1;
		}
		else
		{
			k = f(m, n - 1) + f(m - n, n);
		}
		return (k);
	}
	public static int Main()
	{
		int i;
		int t;
		int n;
		int m;
		int k;
		int f = new int(int m,int n);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		if (t >= 0 && t <= 20)
		{
			for (i = 1;i <= t;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n = Integer.parseInt(tempVar3);
				}
				k = f(m, n);
				System.out.printf("%d\n",k);
			}
		}
		return 0;
	}
}

