package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[m + 2][n + 2];
		for (int i = 1;i < m + 1;i++)
		{
			for (int j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0;i < m + 2;i++)
		{
			sz[i][0] = 0;
			sz[i][n + 1] = 0;
		}
		for (int i = 0;i < n + 2;i++)
		{
			sz[0][i] = 0;
			sz[m + 1][i] = 0;
		}
		for (int i = 1;i < m + 1;i++)
		{
			for (int j = 1;j < n + 1;j++)
			{
				if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}

}

