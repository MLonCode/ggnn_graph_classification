package <missing>;

public class GlobalMembers
{
	//????????????
	//20101122 liuyi
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < x1;i++)
		{
		for (j = 0;j < y2;j++)
		{
				c[i][j] = 0; //??c?????0
		}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				for (int k = 0;k < x2;k++)
				{
					c[i][j] += a[i][k] * b[k][j]; //???????c?????
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			  for (j = 0;j < y2;j++)
			  {
				  System.out.print(c[i][j]);
				  if (j == y2 - 1)
				  {
					  continue; //??????
				  }
				  System.out.print(" ");
			  }
			  System.out.print("\n");
		}
	return 0;
	}


}

