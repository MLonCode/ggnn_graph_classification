package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int h;
		int g;
		int p;
		int q;
		int i;
		int j;
		int f;
		int s;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (h = 0;h < x1;h++)
		{
			for (g = 0;g < y1;g++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[h][g] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (p = 0;p < x2;p++)
		{
			for (q = 0;q < y2;q++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[p][q] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (f = 0;f < y1;f++)
			{
				c[i][0] += a[i][f] * b[f][0];
			}
			System.out.printf("%d",c[i][0]);
			for (j = 1;j < y2;j++)
			{
				for (s = 0;s < y1;s++)
				{
					c[i][j] += a[i][s] * b[s][j];
				}
				System.out.printf(" %d",c[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

