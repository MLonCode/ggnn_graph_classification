package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int a;
		int e;
		int m;
		int[] sz = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		a = 0;
		for (i = 0;i < n - 1;i++)
		{
			e = sz[i];
			for (j = i + 1;j < n;j++)
			{
				m = sz[j] + e;
				if (m == k)
				{
					a = 1;
				}
				if (a == 1)
				{
					break;
				}
			}
		}
		if (a == 0)
		{
			System.out.print("no");
		}
		if (a == 1)
		{
			System.out.print("yes");
		}
		return 0;
	}

}

