package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int n;
		int k;
		int i;
		int j;
		int sum;
		int a = 0;
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
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a == 1)
			{
				break;
			}
			else
			{
			for (i = 0;i < n;i++)
			{
				sum = sz[j] + sz[i];
				if ((sum == k) && (i != j))
				{
					a = 1;
					break;
				}
				else
				{
					continue;
				}
			}
			}
		}
		if (a == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;

	}

}

