package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int nianling;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int he;
		double a1;
		double b1;
		double c1;
		double d1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nianling = Integer.parseInt(tempVar2);
			}
			if (nianling <= 18)
			{
				a++;
			}
			if ((nianling <= 35) && (nianling >= 19))
			{
				b++;
			}
			if ((nianling <= 60) && (nianling >= 36))
			{
				c++;
			}
			if (nianling > 60)
			{
				d++;
			}
		}
		he = a + b + c + d;
		a1 = 1.0 * a / he * 100;
		b1 = 1.0 * b / he * 100;
		c1 = 1.0 * c / he * 100;
		d1 = 1.0 * d / he * 100;
		System.out.printf("1-18: %.2lf%%\n",a1);
		System.out.printf("19-35: %.2lf%%\n",b1);
		System.out.printf("36-60: %.2lf%%\n",c1);
		System.out.printf("60??: %.2lf%%\n",d1);
		return 0;
	}
}

