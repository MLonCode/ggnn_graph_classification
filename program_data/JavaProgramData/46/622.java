package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int[][] a = new int[100][100];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0, j = 0;i < (m / 2 + m % 2) && j < (n / 2 + n % 2);i++, j++)
		{
			for (t = j;t < n - j;t++)
			{
				System.out.printf("%d\n",a[i][t]);
			}
			for (t = i + 1;t < m - i;t++)
			{
				System.out.printf("%d\n",a[t][n - j - 1]);
			}
			if (i < m / 2)
			{
				for (t = n - j - 2;t >= j;t--)
				{
					System.out.printf("%d\n",a[m - i - 1][t]);
				}
			}
			if (j < n / 2)
			{
				for (t = m - i - 2;t >= i + 1;t--)
				{
					System.out.printf("%d\n",a[t][j]);
				}
			}
		}
	}

	//??????????rp??��
}

