package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int i;
	int y;
	int a;
	int b;
	int c;
	int d;
	double a1;
	double b1;
	double c1;
	double d1;
	i = 1,a = 0,b = 0,c = 0,d = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	while (i <= x)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	if (y <= 18)
	{
	a = a + 1;
	}
	else if (y <= 35 && y >= 19)
	{
	b = b + 1;
	}
	else if (y <= 60 && y >= 36)
	{
	c = c + 1;
	}
	else if (y >= 61)
	{
	d = d + 1;
	}
	i = 1 + i;
	}
	a1 = a * 1.0 / x * 100,b1 = b * 1.0 / x * 100,c1 = c * 1.0 / x * 100,d1 = d * 1.0 / x * 100;
	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",a1,b1,c1,d1);
	return 0;
	}
}

