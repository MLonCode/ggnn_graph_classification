package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[6];
		a[0] = (n - n % 100) / 100;
		a[1] = (n % 100 - (n % 100) % 50) / 50;
		a[2] = (n - 100 * a[0] - 50 * a[1] - (n - 100 * a[0] - 50 * a[1]) % 20) / 20;
		a[3] = (n - 100 * a[0] - 50 * a[1] - 20 * a[2] - n % 10) / 10;
		a[4] = (n % 10 - (n % 10) % 5) / 5;
		a[5] = n % 5;
		int i;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

