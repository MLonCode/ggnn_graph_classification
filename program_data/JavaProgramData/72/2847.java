package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
		int i;
		int j;
		int h;
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h = Integer.parseInt(tempVar3);
				}
				a[i][j] = h;
			}
		}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (i == 0 && j == 0)
					{
						if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
						{
						System.out.printf("%d %d\n", i, j);
						}
					}
						if (i == 0 && j != 0)
						{
							if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
							{
						System.out.printf("%d %d\n", i, j);
							}
						}
							if (i != 0 && j == 0)
							{
								if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
								{
						System.out.printf("%d %d\n", i, j);
								}
							}
							if (i != 0 && j != 0)
							{
								if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
								{
									System.out.printf("%d %d\n", i, j);
								}
							}
				}
			}
					return 0;
	}

}

