package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	System.out.printf("%d",a[0]);
	for (int i = 1;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	for (int j = 0;j < i;j++)
	{
		x = 0;
	if (a[j] == a[i])
	{
		x = 1;
		break;
	}
	}
	if (x == 0)
	{
		System.out.printf(",%d",a[i]);
	}
	}
	}
}

