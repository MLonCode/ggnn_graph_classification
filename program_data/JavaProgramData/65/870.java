package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[202];
		int[] b = new int[202];
		int i;
		int j = 0;
		int k = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 0))
			{
				j++;
			}
			if (a[i] == b[i])
			{
				j++;
				k++;
			}
			if ((a[i] == 0 && b[i] == 2) || (a[i] == 1 && b[i] == 0) || (a[i] == 2 && b[i] == 1))
			{
				k++;
			}
		}
		if (j > k)
		{
			System.out.print("A");
		}
		else
		{
		if (j < k)
		{
			System.out.print("B");
		}
		else
		{
		System.out.print("Tie");
		}
		}
		return 0;
	}

}

