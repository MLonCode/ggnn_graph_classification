package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];

		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		int sum;

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
				sum = 0;
				for (k = 0; k < y1; k++)
				{
					sum = sum + a[i][k] * b[k][j];
				}
				System.out.print(sum);
				if (j < y2 - 1)
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}

