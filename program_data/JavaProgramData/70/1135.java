package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double max;
		double[][] a = new double[1000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		max = Math.sqrt((a[0][0] - a[1][0]) * (a[0][0] - a[1][0]) + (a[0][1] - a[1][1]) * (a[0][1] - a[1][1]));
		for (i = 1;i < n;i++)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1])) > max)
				{
				max = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				}
			}
		}
		System.out.printf("%.4lf\n",max);

		return 0;
	}

}

