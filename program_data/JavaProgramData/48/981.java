package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int n;
		int t;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[5][5] = t;
		while (n > 0)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i - 1][j] + a[i - 1][j - 1] + a[i - 1][j + 1] + a[i + 1][j] + a[i + 1][j + 1] + a[i + 1][j - 1] + a[i][j - 1] + a[i][j + 1];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				  a[i][j] = b[i][j];
				}
			}
			n--;
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][9]);
		}
		return 0;
	}
}

