package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix1 = new int[100][100];
		int[][] matrix2 = new int[100][100];
		int row1;
		int column1;
		int row2;
		int column2;
		int i;
		int j;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			column1 = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < row1; i++)
		{
			for (j = 0; j < column1; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					matrix1[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			row2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			column2 = Integer.parseInt(tempVar5);
		}
		for (i = 0; i < row2; i++)
		{
			for (j = 0; j < column2; j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					matrix2[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		int temp1 = column2 - 1;
		for (i = 0; i < row1; i++)
		{
			for (j = 0; j < temp1; j++)
			{
				sum = 0;
				for (k = 0; k < column1; k++)
				{
					sum += matrix1[i][k] * matrix2[k][j];
				}
				System.out.printf("%d ", sum);
			}
			sum = 0;
			for (k = 0; k < column1; k++)
			{
				sum += matrix1[i][k] * matrix2[k][j];
			}
			System.out.printf("%d\n", sum);
		}
		return 0;
	}
}

