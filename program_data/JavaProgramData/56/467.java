package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
	int a;
	int b;
	int c;
	int d;
	int e;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}

	if (k < 10)
	{
		System.out.printf("%d",k);
	}

	if (k > 9 && k < 100)
	{
		a = k % 10;
	b = (k - a) / 10;
	x = (a * 10) + b;
	System.out.printf("%d",x);
	}

	if (k > 99 && k < 1000)
	{
		a = k % 10;
	b = ((k % 100) - a) / 10;
	c = (k - a - (b * 10)) / 100;
	x = (a * 100) + (b * 10) + c;
	System.out.printf("%d",x);
	}

	if (k > 999 && k < 10000)
	{
		a = k % 10;
	b = ((k % 100) - a) / 10;
	c = ((k % 1000) - a - (b * 10)) / 100;
	d = (k - a - (b * 10) - (c * 100)) / 1000;
	x = (a * 1000) + (b * 100) + (c * 10) + d;
	System.out.printf("%d",x);
	}


	if (k > 9999 && k < 100000)
	{
		a = k % 10;
	b = ((k % 100) - a) / 10;
	c = ((k % 1000) - a - (b * 10)) / 100;
	d = ((k % 10000) - a - (b * 10) - (c * 100)) / 1000;
	e = (k - a - (b * 10) - (c * 100) - (d * 1000)) / 10000;
	x = (a * 10000) + (b * 1000) + (c * 100) + (d * 10) + e;

	System.out.printf("%d",x);
	}
	}


}

