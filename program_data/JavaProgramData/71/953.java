package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m1;
		int m2;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if ((y % 100 != 0 && y % 4 == 0) || (y % 400 == 0))
			{
				m[2] = 29;
				if (m1 < m2)
				{
					for (j = m1;j < m2;j++)
					{
						sum = sum + m[j];
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (sum % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
				else if (m1 > m2)
				{
					for (j = m2;j < m1;j++)
					{
						sum = sum + m[j];
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (sum % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
				else if (m1 == m2)
				{
					System.out.print("YES");
				}
			}
			else
			{
				m[2] = 28;
				if (m1 < m2)
				{
					for (j = m1;j < m2;j++)
					{
						sum = sum + m[j];
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (sum % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
				else if (m1 > m2)
				{
					for (j = m2;j < m1;j++)
					{
						sum = sum + m[j];
					}
					if (sum % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else if (sum % 7 != 0)
					{
						System.out.print("NO\n");
					}
				}
				else if (m1 == m2)
				{
					System.out.print("YES");
				}
			}
		}
		return 0;
	}
}

