package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int t = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (n;n > 0;n--)
		{
		int a;
		int b;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		{
			sum = sum + 1;
			if (t <= sum)
			{
				t = sum;
			}
		}
		else
		{
			sum = 0;
		}
		}
	System.out.printf("%d",t);
	return 0;
	}
}

