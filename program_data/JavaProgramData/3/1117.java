package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int m = 1;
		int[] sz = new int[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n && m == 1;i++)
		{
			for (p = i + 1;p < n && m == 1;p++)
			{
				if (sz[i] + sz[p] == k)
				{
					System.out.print("yes");
					m = 0;
				}
			}
		}
		if (m == 1)
		{
			System.out.print("no");
		}
		return 0;
	}

}

