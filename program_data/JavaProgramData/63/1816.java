package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i <= x1 - 1 ; i++)
		{
			for (int j = 0 ; j <= y1 - 1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i <= x2 - 1 ; i++)
		{
			for (int j = 0 ; j <= y2 - 1 ; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0 ; i <= x1 - 1 ; i++)
		{
			for (int j = 0 ; j <= y2 - 1 ; j++)
			{
				for (int k = 0 ; k <= y1 - 1 ; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				if (j < y2 - 1)
				{
					System.out.print(" ");
				}
			}
			if (i < x1 - 1)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}
}

