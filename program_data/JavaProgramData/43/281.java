package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int b;
		int j;
		int n = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= a / 2;i = i + 2)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j != 0)
				{
					n = n + 1;
				}
			}
			if (n == i - 2)
			{
				b = a - i;
				for (j = 2;j < b;j++)
				{
					if (b % j != 0)
					{
						m = m + 1;
					}
				}
				if (m == b - 2)
				{
					System.out.printf("%d %d\n",i,b);
				}
			}
			n = 0;
			m = 0;
		}
		return 0;
	}
}

