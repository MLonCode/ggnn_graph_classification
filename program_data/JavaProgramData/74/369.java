package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int r;
		int s;
		int t;
		int b;
		int c = 0;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j != 0)
				{
					k = 1;
				}
				else
				{
					k = 0;
					break;
				}
			}
			if (k == 1)
			{
				r = i;
				b = i;
				t = b % 10;
				for (p = 1;r != 0;p++)
				{
					r = r / 10;
				}
				for (j = 1;j < p - 1;j++)
				{
					b = b / 10;
					t = t * 10 + b % 10;
				}
				if (i == t)
				{
					a[c] = i;
					c++;
				}
			}
		}
		if (a[0] == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (j = 0;j < c - 1;j++)
			{
				System.out.printf("%d,",a[j]);
			}
			System.out.printf("%d",a[c - 1]);
		}
	}

}

