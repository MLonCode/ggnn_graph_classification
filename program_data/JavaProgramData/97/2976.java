package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i * 100 > n)
			{
				break;
			}
		}
		a = i - 1;
		m = n - a * 100;
		for (i = 1;i <= m;i++)
		{
			if (i * 50 > m)
			{
				break;
			}
		}
		b = i - 1;
		m = m - b * 50;
		for (i = 1;i <= m;i++)
		{
			if (i * 20 > m)
			{
				break;
			}
		}
		c = i - 1;
		m = m - c * 20;
		for (i = 1;i <= m;i++)
		{
			if (i * 10 > m)
			{
				break;
			}
		}
		d = i - 1;
		m = m - d * 10;
		for (i = 1;i <= m;i++)
		{
			if (i * 5 > m)
			{
				break;
			}
		}
		e = i - 1;
		f = m - e * 5;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", a, b, c, d, e, f);
		return 0;
	}
}

