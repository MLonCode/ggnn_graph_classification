package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		double zong = 0;
		int t;
		t = a / 400;
		double shu = 24 * 366 * 4 + 76 * 365 * 4 + 1;
		zong = shu * t;
		int a1 = a % 400;
		int i;
		if (a1 == 0)
		{
			zong -= 366;
		}
		for (i = 1;i < a1;i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				zong += 366;
			}
			else
			{
				zong += 365;
			}
		}
		for (i = 1;i < b;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				zong += 31;
			}
			else if (i == 2)
			{
				if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
				{
					zong += 29;
				}
				else
				{
					zong += 28;
				}
			}
			else
			{
				zong += 30;
			}
		}
		zong += c;
		for (;zong > 700000000;)
		{
			zong -= 700000000;
		}
		for (;zong > 70000000;)
		{
			zong -= 70000000;
		}
		for (;zong > 7000000;)
		{
			zong -= 7000000;
		}
			for (;zong > 700000;)
			{
			zong -= 700000;
			}
		for (;zong > 70000;)
		{
			zong -= 70000;
		}
		for (;zong > 7000;)
		{
			zong -= 7000;
		}


		for (i = 0;;i++)
		{
			if ((7 * i < zong) && ((7 * i + 7) >= zong))
			{
				break;
			}
		}
		if (zong - 7 * i == 1)
		{
			System.out.print("Mon.");
		}
		if (zong - 7 * i == 2)
		{
			System.out.print("Tue.");
		}
		if (zong - 7 * i == 3)
		{
			System.out.print("Wed.");
		}
		if (zong - 7 * i == 4)
		{
			System.out.print("Thu.");
		}
		if (zong - 7 * i == 5)
		{
			System.out.print("Fri.");

		}
		if (zong - 7 * i == 6)
		{
			System.out.print("Sat.");
		}
		if (zong - 7 * i == 7)
		{
			System.out.print("Sun.");
		}
		return 0;
	}






}

