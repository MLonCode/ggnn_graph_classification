package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] z = new int[6];
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		z[0] = (n - n % 100) / 100;
		int m = n % 100;
		z[1] = (m - m % 50) / 50;
		int i = m % 50;
		z[2] = (i - i % 20) / 20;
		int j = i % 20;
		z[3] = (j - j % 10) / 10;
		int g = j % 10;
		z[4] = (g - g % 5) / 5;
		z[5] = g % 5;
		for (h = 0;h < 6;h++)
		{
			System.out.printf("%d\n",z[h]);
		}
		return 0;
	}
}

