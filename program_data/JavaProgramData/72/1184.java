package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[max + 2][max + 2];
		int m;
		int n;
		int i;
		int j;
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
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i - 1][j])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	return 0;
	}
}

