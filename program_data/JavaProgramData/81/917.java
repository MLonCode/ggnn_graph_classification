package <missing>;

public class GlobalMembers
{
	public static int kuso(int n,int m)
	{
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int p;
		int[] b = new int[5];
		int kuso = new int(int n,int m);
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
		p = kuso(n, m);
		if (p == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = b[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
						System.out.printf("%d ",a[i][j]);
					}
					else
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}
	}





}

