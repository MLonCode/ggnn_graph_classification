package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int sa = 0;
		int sb = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 1)
			{
				sa++;
			}
			else if (a == 0 && b == 2)
			{
				sb++;
			}
			else if (a == 1 && b == 2)
			{
				sa++;
			}
			else if (a == 1 && b == 0)
			{
				sb++;
			}

			else if (a == 2 && b == 0)
			{
				sa++;
			}
			else if (a == 2 && b == 1)
			{
				sb++;
			}

			else if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 2))
			{
				continue;
			}
		}
		if (sa > sb)
		{
			System.out.print("A");
		}
		else if (sa < sb)
		{
			System.out.print("B");
		}
		else if (sa == sb)
		{
			System.out.print("Tie");
		}

		return 0;
	}
}

