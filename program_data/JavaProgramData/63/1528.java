package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i = 0;
		int j = 0;
		int l = 0;
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
						for (l = 0; l < x2; l++)
						{
							c[i][j] += a[i][l] * b[l][j];
						}
						if (j == 0)
						{
							System.out.print(c[i][j]);
						}
						else
						{
							System.out.print(" ");
							System.out.print(c[i][j]);
						}
					}
					System.out.print("\n");
				}

					return 0;
	}

}

