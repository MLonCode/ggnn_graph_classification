package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int sum1;
		int sum2;
		sum1 = sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (a = 3;a < (m / 2 + 1);a = a + 2)
		{
			b = m - a;
			for (i = 1;i <= b;i++)
			{
				if (b % i == 0)
				{
					sum1 = sum1;
				}
				else
				{
					sum1 = sum1 + 1;
				}
			}
			for (i = 1;i <= a;i++)
			{
				if (a % i == 0)
				{
					sum2 = sum2;
				}
				else
				{
					sum2 = sum2 + 1;
				}
			}
			if ((sum1 == b - 2) && (sum2 == a - 2))
			{
				System.out.printf("%d %d\n\n",a,b);
			}
			sum1 = sum2 = 0;
		}
		return 0;
	}
}

