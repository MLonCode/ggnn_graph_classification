package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] a = new double[10][2];
		double dis;
		double t;
	int n;
	int i;
	int j;
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
		a[i][0] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i][1] = Double.parseDouble(tempVar3);
	}
	}
	dis = (a[0][0] - a[1][0]) * (a[0][0] - a[1][0]) + (a[0][1] - a[1][1]) * (a[0][1] - a[1][1]);
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
		t = (a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]);
	if (dis < t)
	{
		dis = t;
	}
	}
	}
	System.out.printf("%.4f\n",Math.sqrt(dis));
	}

}

