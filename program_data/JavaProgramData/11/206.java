package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int D;
		int[] p = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		D = 0;
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
		if (((y % 4 == 0) && (y % 100 != 0)) || ((y % 400) == 0))
		{
			for (i = 0;i < m - 1;i++)
			{
				D = D + p[i];
			}
			D = D + d + 1;
			System.out.printf("%d",D);
		}
		else
		{
			for (i = 0;i < m - 1;i++)
			{
				D = D + p[i];
			}
			D = D + d;
			System.out.printf("%d",D);
		}
		return 0;
	}


}

