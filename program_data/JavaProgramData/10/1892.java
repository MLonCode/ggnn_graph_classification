package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int[] num = new int[25];
	public static int Main()
	{
	int n;
	int i;
	int k = 0;
	int search = new int(int i,int n);
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
	i--;
	for (;i >= 0;i--)
	{
	num[i] = 1 + search(i, n);
	}
	for (i = 0;i < n;i++)
	{
	if (num[i] > k)
	{
		k = num[i];
	}
	}
	System.out.printf("%d\n",k);
	return 0;
	}
	public static int search(int i,int n)
	{
	int p;
	int q = 0;
	for (p = i + 1;p < n;p++)
	{
	if (a[p] <= a[i])
	{
	if (q < num[p])
	{
		q = num[p];
	}
	}

	}

	return q;
	}
}

