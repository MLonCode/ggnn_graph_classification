package <missing>;

public class GlobalMembers
{
	public static int jiaohuan(int[][] a, int m, int n)
	{
		int temp;
		int i;
		if (m > 4)
		{
			return (0);
		}
		else if (n > 4)
		{
			return (0);
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				temp = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = temp;
			}
			return (1);
		}
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
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
		i = jiaohuan(a, m, n);
		if (i == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
	}
}

