package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int n;
		double[] g = new double[10];
		double[] c = new double[10];
		double jidian;
		double xuefen;
		float GPA;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90 && b[i] <= 100)
			{
				g[i] = 4.0;
			}
			else if (b[i] >= 85 && b[i] <= 89)
			{
				g[i] = 3.7;
			}
			else if (b[i] >= 82 && b[i] <= 84)
			{
				g[i] = 3.3;
			}
			else if (b[i] >= 78 && b[i] <= 81)
			{
				g[i] = 3.0;
			}
			else if (b[i] >= 75 && b[i] <= 77)
			{
				g[i] = 2.7;
			}
			else if (b[i] >= 72 && b[i] <= 74)
			{
				g[i] = 2.3;
			}
			else if (b[i] >= 68 && b[i] <= 71)
			{
				g[i] = 2.0;
			}
			else if (b[i] >= 64 && b[i] <= 67)
			{
				g[i] = 1.5;
			}
			else if (b[i] >= 60 && b[i] <= 63)
			{
				g[i] = 1.0;
			}
			else
			{
				g[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			c[i] = g[i] * a[i];
			jidian += c[i];
			xuefen += a[i];
		}
		GPA = (float)(jidian / xuefen);
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

