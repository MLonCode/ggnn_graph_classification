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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10)
		{
		   b = a;
		   System.out.printf("%d",b);
		}
		else if (a < 100)
		{
		   b = a / 10;
		   c = a % 10;
		   System.out.printf("%d%d",c,b);
		}
		else if (a < 1000)
		{
		  b = a / 100;
		  c = (a % 100) / 10;
		  d = a % 10;
		  System.out.printf("%d%d%d",d,c,b);
		}
		else if (a < 10000)
		{
		  b = a / 1000;
		  c = (a % 1000) / 100;
		  d = (a % 100) / 10;
		  e = a % 10;
		  System.out.printf("%d%d%d%d",e,d,c,b);
		}
		return 0;
	}

}

