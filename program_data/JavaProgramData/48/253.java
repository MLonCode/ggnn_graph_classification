package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
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
		a[5][5] = m;
		for (k = 0;k < n;k++)
		{
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
						b[i][j] = a[i][j] * 2 + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
				}
			}
			for (i = 1;i < 10;i++)
			{
				for (j = 1;j < 10;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 10;j++)
			{
				if (j == 1)
				{
					System.out.printf("%d",b[i][j]);
				}
				else
				{
					System.out.printf(" %d",b[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

