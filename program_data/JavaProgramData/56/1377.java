package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - a * 10000) / 1000;
		c = (n - a * 10000 - b * 1000) / 100;
		d = (n - a * 10000 - b * 1000 - c * 100) / 10;
		e = (n - a * 10000 - b * 1000 - c * 100 - d * 10);
		if (a != 0 && b != 0 && c != 0 && d != 0 && e != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else if (a == 0 && b != 0 && c != 0 && d != 0 && e != 0)
		{
			System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else if (a == 0 && b == 0 && c != 0 && d != 0 && e != 0)
		{
			System.out.printf("%d%d%d",e,d,c);
		}
		else if (a == 0 && b == 0 && c == 0 && d != 0 && e != 0)
		{
			System.out.printf("%d%d",e,d);
		}
		else if (a == 0 && b == 0 && c == 0 && d == 0 && e != 0)
		{
			System.out.printf("%d",e);
		}
		return 0;



	}


}

