package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int f;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a <= m / 2;a = a + 2)
		{
			f = 1;
			for (j = 2;j < a;j++)
			{
				if (a % j == 0)
				{
					f = 0;
					break;
				}
			}
			if (f == 0)
			{
				continue;
			}
			b = m - a;
			f = 1;
			for (j = 2;j < b;j++)
			{
				if (b % j == 0)
				{
					f = 0;
					break;
				}
			}
			if (f != 0)
			{
				System.out.printf("%d %d\n",a,b);
			}
		}

		return 0;
	}

}

