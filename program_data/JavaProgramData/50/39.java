package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int m;
		m = 13 % 7 + w - 1;
		if (m > 7)
		{
			m = m - 7;
		}
		if (m == 5)
		{
			System.out.print("1\n");
		}
		int i;
		int j;
		int[] day = new int[12];
		for (i = 1;i < 12;i++)
		{
			for (j = 0;j < i;j++)
			{
				day[i] += month[j];
			}
			day[i] += 13;
			t = day[i] % 7 + w - 1;
			if (t > 7)
			{
				t = t - 7;
			}
			if (t == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}

		return 0;
	}
}

