package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int i;
		int j;
		int mushi;
		int nichi;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			mushi = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			nichi = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
			}
		}
		a[5][5] = mushi;
		b[5][5] = mushi;
		for (n = 0;n < nichi;n++)
		{
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				b[i][j] += a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j];
			}
		}
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j] = b[i][j];
			}
		}
		}


		for (i = 1;i < 10;i++)
		{
			for (j = 1;j < 9;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
				System.out.printf("%d\n",a[i][9]);
		}



	return 0;
	}

}

