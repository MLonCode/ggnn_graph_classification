package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int q;
		int r;
		int l;
		int i;
		int x;
		int j;
		int[][] a = new int[202][202];
		int[] b = new int[202];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= r;i++)
		{
		   for (j = 1;j <= l;j++)
		   {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  x = Integer.parseInt(tempVar3);
				  }
			   a[i + j][b[i + j]] = x;
			   b[i + j]++;
		   }
		}
		i--;
		j--;
		for (p = 2;p <= i + j;p++)
		{
		   for (q = 0;q < b[p];q++)
		   {
			  System.out.printf("%ld\n",a[p][q]);
		   }
		}
		return 0;
	}
}

