package <missing>;

public class GlobalMembers
{
	public static int m; //m???????????,n???????
	public static int n;
	public static int i;
	public static int j;
		public static int[][] a = new int[10][10];

	public static int pat(int[][] a, int n)
	{
		int[][] b = new int[10][10];
		int x;
		int y;
		if (n == 0)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 8;j++)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				System.out.print(a[i][9]);
				System.out.print("\n");


			}
			return 0;
		}
		else
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = a[i][j] * 2 + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
				}
			}
			for (x = 1;x <= 9;x++)
			{
				for (y = 1;y <= 9;y++)
				{
					a[x][y] = b[x][y];
				}
			}
			return pat(a, n - 1);
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;

			pat(a, n);


		return 0;

	}

}

