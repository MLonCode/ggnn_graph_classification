package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[5][5];
	int n;
	int m;
	int i;
	int j;
	int e;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sz[i][j] = Integer.parseInt(tempVar);
		}
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n < 5 && m < 5)
		{
		for (j = 0;j < 5;j++)
		{
			e = sz[n][j];
		 sz[n][j] = sz[m][j];
		 sz[m][j] = e;
		}
		 for (j = 0;j <= 3;j++)
		 {
		 System.out.printf("%d ",sz[0][j]);
		 }
		 System.out.printf("%d\n",sz[0][4]);
		 for (j = 0;j <= 3;j++)
		 {
		 System.out.printf("%d ",sz[1][j]);
		 }
		 System.out.printf("%d\n",sz[1][4]);
		 for (j = 0;j <= 3;j++)
		 {
		 System.out.printf("%d ",sz[2][j]);
		 }
		 System.out.printf("%d\n",sz[2][4]);
		 for (j = 0;j <= 3;j++)
		 {
		 System.out.printf("%d ",sz[3][j]);
		 }
		 System.out.printf("%d\n",sz[3][4]);
		 for (j = 0;j <= 3;j++)
		 {
		 System.out.printf("%d ",sz[4][j]);
		 }
		 System.out.printf("%d\n",sz[4][4]);
		}
	else
	{
		System.out.print("error");
	}
	return 0;
	}



}

