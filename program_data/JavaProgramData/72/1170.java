package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[22][22];
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (int i = 1;i <= m;i++)
	{
	for (int j = 1;j <= n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (int i = 1;i <= m;i++)
	{
	for (int j = 1;j <= n;j++)
	{
	if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
	{
	System.out.printf("%d %d\n",i - 1,j - 1);
	}
	}
	}
	}


}

