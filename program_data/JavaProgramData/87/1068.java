package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[][] a = new int[N][5];
		int[] b = new int[N];
		n = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i][4] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				a[i][5] = Integer.parseInt(tempVar6);
			}
			if (!(a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0))
			{
				b[i] = 3600 * (12 + a[i][3] - a[i][0]) + 60 * (a[i][4] - a[i][1]) + (a[i][5] - a[i][2]);
				n++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}


}

