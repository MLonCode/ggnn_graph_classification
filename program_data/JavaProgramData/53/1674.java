package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[1000];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			for (j = 0,k = 0;j < i;j++)
			{
			if (a[j] == a[i])
			{
				k++;
			}
			}
		if (k == 0)
		{
			System.out.printf(",%d",a[i]);
		}
		}
		System.out.print("\n");
		return 0;

	}
}

