package <missing>;

public class GlobalMembers
{
	public static int[][][] A = new int[9][9][5];
	public static int Main()
	{
		int i;
		int j;
		int m;
		int t;
		int k;
		int number1;
		int number2;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k <= 4;k++)
				{
					A[i][j][k] = 0;
				}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		A[4][4][0] = m;
		for (i = 1;i <= t;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					A[j][k][i] = A[j][k][i - 1] * 2;
					for (number1 = -1;number1 < 2;number1++)
					{
						for (number2 = -1;number2 < 2;number2++)
						{

							if (j + number1 >= 0 && j + number1 < 9 && k + number2 >= 0 && k + number2 < 9)
							{
								if (number1 != 0 || number2 != 0)
								{
									A[j][k][i] = A[j][k][i] + A[j + number1][k + number2][i - 1];
								}
							}
						}
					}
				}
			}
		}
		for (k = 0;k < 9;k++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",A[k][j][i - 1]);
				}
				else
				{
					System.out.printf(" %d",A[k][j][i - 1]);
				}
			}
			if (i < 8)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

