package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int i;
		int j;
		int s;
		int exist = new int(int n,int m);
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar);
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
		t = exist(n, m);
		if (t == 1)
		{
			for (j = 0;j < 5;j++)
			{
			   s = a[n][j],a[n][j] = a[m][j],a[m][j] = s;
			}
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
				System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}

	public static int exist(int n,int m)
	{
		int t = 0;
		if (n <= 4 && m <= 4)
		{
		t = 1;
		}
		return (t);
	}
}

