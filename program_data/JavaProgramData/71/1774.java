package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int y;
		int m1;
		int m2;
		int m;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				m = m1;
				m1 = m2;
				m2 = m;
			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				for (i = m1;i < m2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						d += 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						d += 30;
					}
					else if (i == 2)
					{
						d += 29;
					}
				}
			}
			else
			{
				for (i = m1;i < m2;i++)
				{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
						d += 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
						d += 30;
					}
					else if (i == 2)
					{
						d += 28;
					}
				}
			}
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			d = 0;
		}
		return 0;
	}
}

