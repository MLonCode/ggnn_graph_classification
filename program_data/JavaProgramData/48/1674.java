package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int[][] a = new int[11][11];
		  int[][] b = new int[11][11];
		  int i;
		  int j;
		  int k;
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
		  for (i = 0;i < 11;i++)
		  {
				 for (j = 0;j < 11;j++)
				 {
					  a[i][j] = 0;
					  b[i][j] = 0;
				 }
		  }
		  b[5][5] = m;
		  for (k = 1;k <= n;k++)
		  {
			  for (i = 5 - n;i <= 5 + n;i++)
			  {
					for (j = 5 - n;j <= 5 + n;j++)
					{
						 a[i][j] = 2 * b[i][j] + b[i + 1][j + 1] + b[i][j + 1] + b[i + 1][j] + b[i - 1][j - 1] + b[i - 1][j + 1] + b[i + 1][j - 1] + b[i - 1][j] + b[i][j - 1];
					}
			  }
			  for (i = 5 - n;i <= 5 + n;i++)
			  {
					for (j = 5 - n;j <= 5 + n;j++)
					{
						 b[i][j] = a[i][j];
					}
			  }

		  }
		  for (i = 1;i < 10;i++)
		  {
				 for (j = 1;j < 10;j++)
				 {
					  if (j == 1)
					  {
					  System.out.printf("%d",a[i][j]);
					  }
					  else if (j != 1 && j != 9)
					  {
					  System.out.printf(" %d",a[i][j]);
					  }
					  else if (j == 9)
					  {
					  System.out.printf(" %d\n",a[i][j]);
					  }
				 }
		  }

	}

}

