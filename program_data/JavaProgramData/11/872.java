package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int x = 0;
		int i;
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((y % 400 == 0) || (y % 100 != 0 && y % 4 == 0))
		{
			for (i = 0;i < m - 1;i++)
			{
				x = x + a[i];
			}
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				x = x + b[i];
			}
		}
		x = x + d;
		System.out.printf("%d",x);
	}
}

