package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		a = t / 10000;
		b = (t - a * 10000) / 1000;
		c = (t - a * 10000 - b * 1000) / 100;
		d = (t - a * 10000 - b * 1000 - c * 100) / 10;
		e = t - a * 10000 - b * 1000 - c * 100 - d * 10;
		if (a == 0 && b == 0 && c == 0 && d == 0)
		{
			System.out.printf("%d",e);
		}
		else
		{
			if (a == 0 && b == 0 && c == 0 && d != 0)
			{
				System.out.printf("%d%d",e,d);
			}
			else
			{
				if (a == 0 && b == 0 && c != 0)
				{
					System.out.printf("%d%d%d",e,d,c);
				}
				   else
				   {
					   if (a == 0 && b != 0)
					   {
						   System.out.printf("%d%d%d%d",e,d,c,b);
					   }
							else
							{
							   if (a != 0)
							   {
								   System.out.printf("%d%d%d%d%d",e,d,c,b,a);
							   }
							}
				   }
			}
		}
		return 0;
	}
}

