package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = (int)n / 10000;
		b = (int)(n - 10000 * a) / 1000;
		c = (int)(n - 10000 * a - 1000 * b) / 100;
		d = (int)(n - 10000 * a - 1000 * b - 100 * c) / 10;
		e = (int)(n - 10000 * a - 1000 * b - 100 * c - 10 * d) / 1;
		if (a != 0)
		{
			x = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		}
		else
		{
			if (b != 0)
			{
				x = e * 1000 + d * 100 + c * 10 + b;
			}
			  else
			  {
				  if (c != 0)
				  {
					  x = e * 100 + d * 10 + c;
				  }
			  else
			  {
				  if (d != 0)
				  {
					  x = e * 10 + d;
				  }
			  else
			  {
				  x = e;
			  }
			  }
			  }
		}
		System.out.printf("%d\n",x);
	}
}

