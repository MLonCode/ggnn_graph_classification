package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10)
		{
		System.out.printf("%d",a);
		}
		else if (a < 100)
		{
			int b;
			int c;
			b = a / 10;
			c = a - 10 * b;
		System.out.printf("%d%d",c,b);
		}
		else if (a < 1000)
		{
			int b;
			int c;
			int d;
			b = a / 100;
			c = (a - 100 * b) / 10;
			d = a - 100 * b - 10 * c;
		System.out.printf("%d%d%d",d,c,b);
		}
		else if (a < 10000)
		{
			int b;
			int c;
			int d;
			int e;
			b = a / 1000;
			c = (a - 1000 * b) / 100;
			d = (a - 1000 * b - 100 * c) / 10;
		e = a - 1000 * b - 100 * c - 10 * d;
		System.out.printf("%d%d%d%d",e,d,c,b);
		}

	}
}

