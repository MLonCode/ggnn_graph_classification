package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[i] + a[j]) == k)
				{
					m = k;
					break;
				}
				else if ((a[i] + a[j]) != k)
				{
				continue;
				}
			}
		}
		if (m == k)
		{
			System.out.print("yes");
		}
		else if (m != k)
		{
			System.out.print("no");
		}
		return 0;
	}

}

