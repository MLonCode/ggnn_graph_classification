package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] an = new int[30][30];
		int m;
		int n;
		int i;
		int j;
		char x;
		x = ' ';
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
		for (i = 0;i < 30;i++)
		{
			for (j = 0;j < 30;j++)
			{
				an[i][j] = 0;
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					an[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (an[i][j] >= an[i - 1][j] != 0 && an[i][j] >= an[i + 1][j] != 0 && an[i][j] >= an[i][j - 1] != 0 && an[i][j] >= an[i][j + 1])
				{
					System.out.printf("%d%c%d\n",i - 1,x,j - 1);
				}
			}
		}
		return 0;
	}

}

