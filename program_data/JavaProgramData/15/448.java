package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] p = new int[100][100];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}

		int e;
		int b;
		int h;
		int k;
		int kk = 0;
		for (h = 0;h < n;h++)
		{
			for (k = 0;k < n;k++)
			{
				if (p[h][k] == 0)
				{
					e = h;
					b = k;
					kk = 1;
					break;
				}
			}
				if (kk == 1)
				{
					break;
				}
		}
		int c;
		int d;
		int l;
		int m;
		for (l = 0;l < n;l++)
		{
			for (m = 0;m < n;m++)
			{
				if (p[l][m] == 0)
				{
					c = l;
					d = m;
				}
			}
		}
		int s;
		s = (c - e-1) * (d - b - 1);
		System.out.printf("%d",s);
	}
}

