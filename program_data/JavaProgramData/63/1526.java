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
		int i;
		int j;
		int k;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				for (k = 0; k < y1; k++)
				{
					c[i][j] = a[i][k] * b[k][j] + c[i][j];
				}
			}
		}
		k = 0;
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				if (k != y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
					k++;
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
					k = 0;
				}
			}
		}
		return 0;
	}
}

