package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sz = new char[102][102];
		char[][] ss = new char[102][102];
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar2 != null)
				{
					sz[i][j] = tempVar2.charAt(0);
				}
				ss[i][j] = sz[i][j];
			}
		}
		for (k = 0;k < n + 2;k++)
		{
			sz[k][0] = '#';
			ss[k][0] = '#';
			sz[k][n + 1] = '#';
			ss[k][n + 1] = '#';
		}
		for (l = 0;l < n + 1;l++)
		{
			sz[0][j] = '#';
			ss[0][j] = '#';
			sz[n + 1][j] = '#';
			ss[n + 1][j] = '#';
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (p = 0;p < m - 1;p++)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if (sz[i][j] == '@' && sz[i + 1][j] == '.')
					{
						ss[i + 1][j] = '@';
					}
					if (sz[i][j] == '@' && sz[i - 1][j] == '.')
					{
						ss[i - 1][j] = '@';
					}
					if (sz[i][j] == '@' && sz[i][j + 1] == '.')
					{
						ss[i][j + 1] = '@';
					}
					if (sz[i][j] == '@' && sz[i][j - 1] == '.')
					{
						ss[i][j - 1] = '@';
					}
				}
			}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				sz[i][j] = ss[i][j];

			}
		}
		}
	q = 0;
	for (i = 1;i < n + 1;i++)
	{
		for (j = 1;j < n + 1;j++)
		{
			if (sz[i][j] == '@')
			{
				q = q + 1;
			}
		}
	}
	System.out.printf("%d",q);
	return 0;
	}
}

