package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int[] a = new int[100];
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = (n - m);i < n;i++)
	{
	System.out.printf("%d ",a[i]);
	}
	for (i = 0;i < (n - m - 1);i++)
	{
	System.out.printf("%d ",a[i]);
	}
	if (i = (n - m - 1))
	{
		System.out.printf("%d",a[i]);
	}
	}


}

