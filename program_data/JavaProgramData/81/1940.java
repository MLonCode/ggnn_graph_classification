package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;
		int temp;
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
			if (n > 4 || n < 0 || m>4 || m < 0)
			{
				System.out.print("error");
			}
			else
			{
				for (j = 0;j < 5;j++)
				{
					temp = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = temp;
				}
				for (i = 0;i < 5;i++)
				{
					System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
				}
			}

		return 0;
	}
}

