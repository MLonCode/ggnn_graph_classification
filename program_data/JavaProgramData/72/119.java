package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] hill = new int[20][20];
		int i;
		int j;
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
				  hill[i] + j = Integer.parseInt(tempVar3);
			  }
		   }
		}

		for (i = 0;i < m;i++)
		{
		   for (j = 0;j < n;j++)
		   {
			  if (i == 0 || hill[i][j] >= hill[i - 1][j])
			  {
				 if (i == m - 1 || hill[i][j] >= hill[i + 1][j])
				 {
					if (j == 0 || hill[i][j] >= hill[i][j - 1])
					{
					   if (j == n - 1 || hill[i][j] >= hill[i][j + 1])
					   {
						  System.out.printf("%d %d\n",i,j);
					   }
					}
				 }
			  }
		   }
		}
		return 1;
	}


}

