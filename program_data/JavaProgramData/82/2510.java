package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] a = new int[101];
	int[] b = new int[101];
	int[] c = new int[101];
	int max;
	int k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n;i++)
	{
	c[i] = 0;
	}
	for (i = 1;i <= n;i++)
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
	if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
	{
		c[i] = 1;
	}
	}
	max = 0;
	for (i = 1;i <= n;i++)
	{
	if (c[i] == 1 && c[i - 1] == 1)
	{
		k = k + 1;
	}
	else
	{
		k = 0;
	}
	if (k > max)
	{
		max = k;
	}

	}
	if (max == 0)
	{
	for (i = 1;i <= n;i++)
	{
	if (c[i] == 1)
	{
		System.out.print("1");
		return 0;


	}
	}
	}
	if (max != 0)
	{
	System.out.printf("%d",max + 1);
	}
	if (max == 0)
	{
		System.out.printf("%d",max);
	}
	return 0;
	}

}

