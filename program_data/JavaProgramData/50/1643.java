package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int xingqi;
		int yue;
		int zong = 0;
		int panduan;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			xingqi = Integer.parseInt(tempVar);
		}
		for (yue = 1;yue < 13;yue++)
		{
			panduan = (zong + 12) % 7 + xingqi;
			if (panduan > 7)
			{
				panduan = panduan - 7;
			}
			if (panduan == 5)
			{
				System.out.printf("%d\n",yue);
			}
			if (yue == 1 || yue == 3 || yue == 5 || yue == 7 || yue == 8 || yue == 10 || yue == 12)
			{
				zong = zong + 31;
			}
			else if (yue == 4 || yue == 6 || yue == 9 || yue == 11)
			{
				zong = zong + 30;
			}
			else if (yue == 2)
			{
				zong = zong + 28;
			}
		}
		return 0;
	}
}

