package <missing>;

public class GlobalMembers
{
	///#define main xmain


	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int m;
		int n;
		int min;
		int sum;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0; k < m; k++)
		{
			/* ??? */
			n = m;
			sum = 0;
			/* ??n*n?? */
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j] = Integer.parseInt(tempVar2);
					}
				}
			}
			while (n > 1)
			{
				/* ??? */
				for (i = 0; i < n; i++)
				{
					min = a[i][0];
					for (j = 1; j < n; j++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0; j < n; j++)
					{
						a[i][j] -= min;
					}
				}
				/* ??? */
				for (j = 0; j < n; j++)
				{
					min = a[0][j];
					for (i = 1; i < n; i++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (i = 0; i < n; i++)
					{
						a[i][j] -= min;
					}
				}
				/* ??(1,1)?? */
				sum += a[1][1];
				/* ??? */
				for (i = 2; i < n; i++)
				{
					for (j = 0; j < n; j++)
					{
						a[i - 1][j] = a[i][j];
					}
				}
				/* ??? */
				for (j = 2; j < n; j++)
				{
					for (i = 0; i < n; i++)
					{
						a[i][j - 1] = a[i][j];
					}
				}
				/* ??????1 */
				n--;
			}
			/* ???? */
			System.out.printf("%d\n", sum);
		}
		return 0;
	}



	public static char[] mn = {3, 9, 31};

	public static int xn = 0;

//C++ TO JAVA CONVERTER WARNING: This 'sizeof' ratio was replaced with a direct reference to the array length:
//ORIGINAL LINE: int max_files = sizeof(mn) / sizeof(mn[0]);
	public static int max_files = mn.length;

	public static String output_dir = "data";

	public static int rnd(int min, int max)
	{
		return min + ((tangible.RandomNumbers.nextNumber() << 15) | tangible.RandomNumbers.nextNumber()) % (max - min + 1);
	}

	public static void xbuild()
	{
		int i;
		int j;
		int k;
		int n;
		n = mn[xn];
		System.out.printf("%d\n", n);
		for (k = 0; k < n; k++)
		{
			for (i = 0; i < n; i++)
			{
				System.out.printf("%d", rnd(1, n * n));
				for (j = 1; j < n; j++)
				{
					System.out.printf(" %d", rnd(1, n * n));
				}
				System.out.print("\n");
			}
		}
		xn++;
	}

}

