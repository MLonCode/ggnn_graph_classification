package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 10;
		c = a / 100;
		d = a / 1000;
		e = a / 10000;
		if (e >= 1)
		{
			f = 5;
		}
		else
		{
			if (d >= 1)
			{
				f = 4;
			}
			else
			{
				if (c >= 1)
				{
					f = 3;
				}
				else
				{
					if (b >= 1)
					{
						f = 2;
					}
					else
					{
						f = 1;
					}
				}
			}
		}
		d = d - 10 * e;
		c = c - 100 * e-10 * d;
		b = b - 1000 * e-100 * d - 10 * c;
		a = a - 10000 * e-1000 * d - 100 * c - 10 * b;
		switch (f)
		{
			case 5:
				System.out.printf("%d%d%d%d%d\n",a,b,c,d,e);
				break;
		case 4:
			System.out.printf("%d%d%d%d\n",a,b,c,d);
			break;
			 case 3:
				 System.out.printf("%d%d%d\n",a,b,c);
				 break;
		case 2:
			System.out.printf("%d%d\n",a,b);
			break;
		case 1:
			System.out.printf("%d\n",a);
			break;
		}
		return 0;
	}

}

