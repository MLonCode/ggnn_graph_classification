package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k = 0;
	double[][] d = new double[10][10];
	double[] D = new double[45];
	double t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct point
	//{
	//	int x;
	//int y;
	//int z;
	//}
	//p[10];
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
			p[i].x = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i].y = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p[i].z = tempVar4;
		}
	}
	for (i = 0;i < n - 1;i++)
	{
		for (j = i + 1;j < n;j++)
		{
		d[i][j] = Math.sqrt((p[i].x - p[j].x) * (p[i].x - p[j].x) + (p[i].y - p[j].y) * (p[i].y - p[j].y) + (p[i].z - p[j].z) * (p[i].z - p[j].z));
	D[k] = d[i][j];
	k++;
		}
	}
	for (i = 0;i < n * (n - 1) / 2 - 1;i++)
	{
		for (j = 0;j < n * (n - 1) / 2 - i - 1;j++)
		{
		if (D[j] < D[j + 1])
		{
		t = D[j];
	D[j] = D[j + 1];
	D[j + 1] = t;
		}
		}
	}
	for (k = 0;k < n * (n - 1) / 2;k++)
	{
		if (D[k] == D[k + 1])
		{
	continue;
		}
	else
	{
		for (i = 0;i < n - 1;i++)
		{
		for (j = i + 1;j < n;j++)
		{
	if (d[i][j] == D[k])
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",p[i].x,p[i].y,p[i].z,p[j].x,p[j].y,p[j].z,d[i][j]);
	}
		}
		}
	}
	}
	return 0;
	}
}

