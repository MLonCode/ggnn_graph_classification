package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1;
		int b1;
		int c1;
		int a2;
		int b2;
		int c2;
		int ans;
		int now;
		int md;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			c2 = Integer.parseInt(tempVar6);
		}
		if (a1 == a2 && b1 == b2)
		{
			ans = c2 - c1;
		}
		else
		{
			if (b1 == 1 || b1 == 3 || b1 == 5 || b1 == 7 || b1 == 8 || b1 == 10 || b1 == 12)
			{
				md = 31;
			}
			if (b1 == 4 || b1 == 6 || b1 == 9 || b1 == 11)
			{
				md = 30;
			}
			if (b1 == 2)
			{
				if ((a1 % 4 == 0 && a1 % 100 != 0) || (a1 % 400 == 0))
				{
					md = 29;
				}
					else
					{
						md = 28;
					}
			}
			ans = md - c1;
		}
		now = b1 + 1;
		while ((now < b2 || a1 < a2) && (now <= 12))
		{
			if (now == 1 || now == 3 || now == 5 || now == 7 || now == 8 || now == 10 || now == 12)
			{
				md = 31;
			}
			if (now == 4 || now == 6 || now == 9 || now == 11)
			{
				md = 30;
			}
			if (now == 2)
			{
				if ((a1 % 4 == 0 && a1 % 100 != 0) || (a1 % 400 == 0))
				{
					md = 29;
				}
					else
					{
						md = 28;
					}
			}
			ans = ans + md;
			now++;
		}
		now = a1 + 1;
		while (now < a2)
		{
			ans = ans + 365;
			if ((now % 4 == 0 && now % 100 != 0) || (now % 400 == 0))
			{
				ans++;
			}
			now++;
		}
		if (a1 < a2)
		{
		now = 1;
		while (now < b2)
		{
			if (now == 1 || now == 3 || now == 5 || now == 7 || now == 8 || now == 10 || now == 12)
			{
				md = 31;
			}
			if (now == 4 || now == 6 || now == 9 || now == 11)
			{
				md = 30;
			}
			if (now == 2)
			{
				if ((a2 % 4 == 0 && a2 % 100 != 0) || (a2 % 400 == 0))
				{
					md = 29;
				}
					else
					{
						md = 28;
					}
			}
			ans = ans + md;
			now++;
		}
		}
		if (a1 < a2 || b1 < b2)
		{
			ans = ans + c2;
		}
		System.out.printf("%d\n",ans);
		return 0;
	}



}

