package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int a;
		int b;
		int m;
		int n;
		int i;
		int[] zs = new int[5];
		for (a = 0;a < 5;a++)
		{
			for (b = 0;b < 5;b++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[a][b] = Integer.parseInt(tempVar);
				}
			}
		}
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
		if (0 <= m != 0 && m <= 4 && 0 <= n != 0 && n < 5)
		{
			i = 0;
		}
		else
		{
			System.out.print("error");
		}
		if (i == 0)
		{
			for (a = 0;a < 5;a++)
			{
				zs[a] = sz[m][a];
				sz[m][a] = sz[n][a];
				sz[n][a] = zs[a];
			}
			for (a = 0;a < 5;a++)
			{
			for (b = 0;b < 5;b++)
			{
				if (b == 0)
				{
					System.out.printf("%d",sz[a][b]);
				}
				else
				{
					System.out.printf(" %d",sz[a][b]);
				}
			}
			System.out.print("\n");
			}

		}

		return 0;
	}

}

