package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	int[] a = new int[9999];
	int h;
	int m = 0;
	int o = 0;
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
	for (i = 0;i < n - 1;i++)
	{
		for (j = 0;j < n - 1;j++)
		{
		h = a[i] + a[j];
		m++;
		if (h == k)
		{
			o++;
		}
		}
	}

	if (o == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.print("yes");
	}
	return 0;
	}
}

