package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sumA = 0;
		int sumB = 0;
		int i;
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
			{
				sumA++;
			}
			if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
			{
				sumB++;
			}
			if ((a == 0 && b == 0) || (a == 1 && b == 1) || (a == 2 && b == 1))
			{
				continue;
			}
		}
		if (sumA > sumB)
		{
			System.out.print("A");
		}
		if (sumB > sumA)
		{
			System.out.print("B");
		}
		else if (sumA == sumB)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

