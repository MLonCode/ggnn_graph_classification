package <missing>;

public class GlobalMembers
{
	public static int tianshu(int i)
	{
		switch (i)
		{
		case 1:
			return 13;
		case 2:
			return 13 + 31;
		case 3:
			return 31 + 28 + 13;
		case 4:
			return 31 + 28 + 31 + 13;
		case 5:
			return 31 + 28 + 31 + 30 + 13;
		case 6:
			return 31 + 28 + 31 + 30 + 13 + 31;
		case 7:
			return 31 + 28 + 31 + 30 + 13 + 31 + 30;
		case 8:
			return 31 + 28 + 31 + 30 + 13 + 31 + 30 + 31;
		case 9:
			return 31 + 28 + 31 + 30 + 13 + 31 + 30 + 31 + 31;
		case 10:
			return 31 + 28 + 31 + 30 + 13 + 31 + 30 + 31 + 31 + 30;
		case 11:
			return 31 + 28 + 31 + 30 + 13 + 31 + 30 + 31 + 31 + 30 + 31;
		case 12:
			return 31 + 28 + 31 + 30 + 13 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
		}
	}

	public static int Main()
	{
		int w;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			x = tianshu(i);
			if (((x - 1) % 7 + w) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}





}

