package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double t;
	int[] a = new int[100];
	int[] b = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[0] = Integer.parseInt(tempVar3);
	}
		t = 1.0 * b[0] / a[0];
		for (i = 1;i < n;i++)
		{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[i] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		b[i] = Integer.parseInt(tempVar5);
	}
			if (1.0 * b[i] / a[i] - t > 0.05)
			{
				System.out.print("better\n");
			}
			else if (t - 1.0 * b[i] / a[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}

		return 0;
	}

}

