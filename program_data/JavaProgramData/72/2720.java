package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[110][110];
	public static int Main()
	{
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i] + j = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] >= s[i][j - 1] != 0 && s[i][j] >= s[i][j + 1] != 0 && s[i][j] >= s[i - 1][j] != 0 && s[i][j] >= s[i + 1][j])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
	}
}

