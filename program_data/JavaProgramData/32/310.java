package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] l1 = new int[25];
		int[] l2 = new int[25];
		int n;
		int w;
		int z;
		int q;
		int i;
		int d;
		int k;
		int j;
	/*	int t;
		char c[101]
	*/
	char[][] c1 = new char[25][101];
	char[][] c2 = new char[25][101];
	char[][] a = new char[25][101];
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
				c1[i] = tempVar2.charAt(0);
			}
			l1[i] = String.valueOf(c1[i]).length();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c2[i] = tempVar3.charAt(0);
			}
			l2[i] = String.valueOf(c2[i]).length();

			d = l1[i] - l2[i];
			for (w = l2[i];w < l1[i] - 1;w++)
			{
				c2[i][w] = '0';
			}
			c2[i][l1[i] - 1] = '\0';

			q = 0;
			c2[i][l1[i]] = '\0';
			c2[i][l1[i] - 1] = '0';
			while (q != d)
			{
				for (z = l1[i];z > 0;z--)
				{
					c2[i][z] = c2[i][z - 1];
				}
				c2[i][0] = c2[i][l1[i]];
				q++;
			}
			c2[i][l1[i]] = '\0';




			for (k = l1[i] - 1;k >= 0;k--)
			{
				if (c1[i][k] >= c2[i][k])
				{
					a[i][k] = c1[i][k] - c2[i][k] + 48;
				}
				else
				{
					a[i][k] = c1[i][k] + 10 - c2[i][k] + 48;
					c1[i][k - 1] = c1[i][k - 1] - 1;
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < l1[i];j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
		}
	}

}

