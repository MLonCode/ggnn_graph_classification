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
		int x;
		int y;
		int r;
		a = 1;
		while (a != 0)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					d = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					e = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					f = Integer.parseInt(tempVar6);
				}
				x = a * 3600 + b * 60 + c;
				y = 12 * 3600 + d * 3600 + e * 60 + f;
				r = y - x;
				if (a != 0)
				{
				System.out.printf("%d\n",r);
				}
		}
		return 0;
	}


}

