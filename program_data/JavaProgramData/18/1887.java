package <missing>;

public class GlobalMembers
{
	/*
	 * 201311291.cpp
	 *
	 *  Created on: 2013-11-29
	 *      Author: 13248
	 */

	public static int[][] x = new int[1000][1000];
	public static int juzheng(int y)
	{
		if (y == 1)
		{
			return 0;
		}
		for (int i = 1;i <= y;i++)
		{
			int min = 100000;
			for (int j = 1;j <= y;j++)
			{
				if (x[i][j] < min)
				{
					min = x[i][j];
				}
			}
			for (int j = 1;j <= y;j++)
			{
				x[i][j] = x[i][j] - min;
			}
		}
		for (int i = 1;i <= y;i++)
		{
				int min = 100000;
				for (int j = 1;j <= y;j++)
				{
					if (x[j][i] < min)
					{
						min = x[j][i];
					}
				}
				for (int j = 1;j <= y;j++)
				{
					x[j][i] = x[j][i] - min;
				}
		}
		int min1 = x[2][2];
		for (int i = 2;i < y;i++)
		{
			x[1][i] = x[1][i + 1];
		}
		for (int i = 2;i < y;i++)
		{
				x[i][1] = x[i + 1][1];
		}
		for (int i = 3;i <= y;i++)
		{
			for (int j = 3;j <= y;j++)
			{
		  x[i - 1][j - 1] = x[i][j];
			}
		}

		return min1 + juzheng(y - 1);
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
			   for (int k = 1;k <= n;k++)
			   {
				   x[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
			}
			//cout<<juzheng(b,n)<<endl;
			System.out.print(juzheng(n));
			System.out.print("\n");
		}

				return 0;
	}
}

