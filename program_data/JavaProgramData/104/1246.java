package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		while (x != y)
		{
			if (x > y && x % 2 == 0)
			{
				x = x / 2;
			}
			else if (x > y && x % 2 != 0)
			{
				x = (x - 1) / 2;
			}
			else if (y > x && y % 2 == 0)
			{
				y = y / 2;
			}
			else if (y > x && y % 2 != 0)
			{
				y = (y - 1) / 2;
			}
		}
		System.out.printf("%d",x);
		return 0;
	}

}

