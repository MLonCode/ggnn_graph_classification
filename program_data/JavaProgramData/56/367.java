package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int a;
		int b;
		int c;
		int d;
		int e;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
		if (A / 10000 != 0)
		{
			a = A / 10000;
			b = (A - a * 10000) / 1000;
			c = (A - a * 10000 - b * 1000) / 100;
			d = (A - a * 10000 - b * 1000 - c * 100) / 10;
			e = (A - a * 10000 - b * 1000 - c * 100 - d * 10);
			x = a + b * 10 + c * 100 + d * 1000 + e * 10000;
		}
		else if (A / 1000 != 0)
		{
			a = A / 1000;
			b = (A - a * 1000) / 100;
			c = (A - a * 1000 - b * 100) / 10;
			d = (A - a * 1000 - b * 100 - c * 10);
			x = a + b * 10 + c * 100 + d * 1000;
		}
		else if (A / 100 != 0)
		{
			a = A / 100;
			b = (A - a * 100) / 10;
			c = (A - a * 100 - b * 10);
			x = a + b * 10 + c * 100;
		}
		else if (A / 10 != 0)
		{
			a = A / 10;
			b = (A - a * 10);
			x = a + b * 10;
		}
		else
		{
			x = A;
		}
		System.out.printf("%d",x);
		return 0;
	}
}

