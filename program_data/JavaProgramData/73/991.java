package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int k;
		  int s;
		  int t;
		  int e;
		  int f;
		  int y;
		  int m;
		  for (i = 0;i <= 4;i++)
		  {
			  for (j = 0;j <= 4;j++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar);
				  }
			  }
		  }
		  y = 0;
		  for (k = 0;k < 5;k++)
		  {
			  e = a[k][0];
			  f = 0;
			  for (s = 1;s < 5;s++)
			  {
				  if (e <= a[k][s])
				  {
					  e = a[k][s];
					  f = s;
				  }
			  }
			  m = 0;
			  for (t = 0;t < 5;t++)
			  {
				  if (a[k][f] > a[t][f])
				  {
					  m = 1;
					  break;
				  }
			  }
			  if (m == 0)
			  {
				  System.out.printf("%d %d %d\n",k + 1,f + 1,a[k][f]);
				  y = 1;
				  break;
			  }
		  }
		  if (y == 0)
		  {
		  System.out.print("not found\n");
		  }
	}

}

