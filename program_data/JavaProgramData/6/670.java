package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int m;
		int n;
		int a;
		int b;
		int[] s = new int[N];
		int[][] sz = new int[M][N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (a = 0;a < m;a++)
			{
				for (b = 0;b < n;b++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(sz[a][b]) = Integer.parseInt(tempVar4);
					}
				}
			}
		  s[i] = 0;
			for (b = 0;b < n;b++)
			{
				s[i] += sz[0][b];
			}
			for (a = 1;a < m;a++)
			{
				s[i] += sz[a][n - 1];
			}
			for (b = n - 2;b >= 0;b--)
			{
				s[i] += sz[m - 1][b];
			}
			for (a = m - 2;a >= 1;a--)
			{
				s[i] += sz[a][0];
			}
		}
		for (i = 0;i < k;i++)
		{
			  System.out.printf("%d\n",s[i]);
		}
		return 0;
	}
}

