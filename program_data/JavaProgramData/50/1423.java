package <missing>;

public class GlobalMembers
{
	public static int yf(int k)
	{
		int t;
		int j;
		t = 0;
		for (j = 0;j < k;j++)
		{
			if (j == 0 || j == 2 || j == 4 || j == 6 || j == 7 || j == 9 || j == 11)
			{
				t += 31;
			}
			else if (j == 3 || j == 5 || j == 8 || j == 10)
			{
				t += 30;
			}
			else if (j == 1)
			{
				t += 28;
			}
		}
		return t;
	}
	public static int Main()
	{
		int i;
		int n;
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			n = (yf(i) + 12) % 7 + w;
			if (n > 7)
			{
				n = n - 7;
			}
			if (n == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
		return 0;
	}
}

