package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c = 0;
	int d = 0;
	int[] a = new int[1000];
	int[] b = new int[1000];
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
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	if ((a[i] - b[i] == -1) || (a[i] - b[i] == 2))
	{
		c++;
	}
	else if ((a[i] - b[i] == 1) || (a[i] - b[i] == -2))
	{
		d++;
	}
	else
	{
		;
	}
	}
	if (c > d)
	{
		System.out.print("A");
	}
	else if (c < d)
	{
		System.out.print("B");
	}
	else
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

