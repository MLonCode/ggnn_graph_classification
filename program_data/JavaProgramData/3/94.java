package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int m;
		int[] a = new int[1000];
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
				m = a[i] + a[j];
				if (m == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (m == k)
			{
				break;
			}
			if (i == n - 1 && m != k)
			{
				System.out.print("no");
			}
		}



		return 0;
	}
}

