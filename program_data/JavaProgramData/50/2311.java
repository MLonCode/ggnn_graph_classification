package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int[] date = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		date[0] = w + 5;
		while (date[0] > 7)
		{
			date[0] = date[0] - 7;
		}
		for (i = 1;i < 12;i++)
		{
			date[i] = (days[i - 1] % 7) + date[i - 1];
			while (date[i] > 7)
			{
				date[i] = date[i] - 7;
			}
		}
		for (i = 0;i < 12;i++)
		{
			if (date[i] == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}

}

