package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int m = 0;
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

		for (i = 0;i < n;i++)
		{
			for (j = i - 1;j >= 0 && (a[i] != a[j]);j--)
			{
				;
			}

			if (j < 0)
			{
				b[m++] = a[i];
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != m - 1)
			{
				System.out.print(",");
			}
		}

	}

}

