package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int i;
		int xue = 0;
		double gpa = 0;
		double[] b = new double[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			xue = xue + a[i];
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Double.parseDouble(tempVar3);
			}
			if (b[i] >= 90 && b[i] <= 100)
			{
				b[i] = 4.0;
			}
			else if (b[i] >= 85)
			{
				b[i] = 3.7;
			}
			else if (b[i] >= 82)
			{
				b[i] = 3.3;
			}
			else if (b[i] >= 78)
			{
				b[i] = 3.0;
			}
			else if (b[i] >= 75)
			{
				b[i] = 2.7;
			}
			else if (b[i] >= 72)
			{
				b[i] = 2.3;
			}
			else if (b[i] >= 68)
			{
				b[i] = 2.0;
			}
			else if (b[i] >= 64)
			{
				b[i] = 1.5;
			}
			else if (b[i] >= 60)
			{
				b[i] = 1.0;
			}
			else
			{
				b[i] = 0;
			}
			gpa = gpa + b[i] * a[i];
		}
		gpa = gpa / xue;
		System.out.printf("%.2lf\n", gpa);
		return 0;
	}
}

