package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		while (x > 99)
		{
			x = x - 100;
			a = a + 1;
		}
		while (x > 49)
		{
			x = x - 50;
			b = b + 1;
		}
		while (x > 19)
		{
			x = x - 20;
			c = c + 1;
		}
		while (x > 9)
		{
			x = x - 10;
			d = d + 1;
		}
		while (x > 4)
		{
			x = x - 5;
			e = e+1;
		}
		f = x;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", a, b, c, d, e, f);
		return 0;
	}
}

