package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a = 1;
		int b = 1;
		int c = 1;
		int a1 = 1;
		int b1 = 1;
		int c1 = 1;
		int sum = 0;
		while (true)
		{

		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			a1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b1 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			c1 = Integer.parseInt(tempVar6);
		}
	if (a == 0 && b == 0 && c == 0 && a1 == 0 && b1 == 0 && c1 == 0)
	{
		break;
	}
		sum = (12 - a) * 3600 + a1 * 3600 - (b * 60) + (b1 * 60) - c + c1;
		System.out.printf("%d\n",sum);
		}

	}

}

