package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		int sum;
		int min;
		int z;
		int[][] a = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k = k + 1)
		{
			sum = 0;
			for (i = 0;i < n;i = i + 1)
			{
				for (j = 0;j < n;j = j + 1)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (l = n;l > 1;l = l - 1)
			{
				for (i = 0;i < l;i = i + 1)
				{
					min = a[i][0];
					for (j = 1;j < l;j = j + 1)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0;j < l;j = j + 1)
					{
						a[i][j] = a[i][j] - min;
					}
				}
				for (i = 0;i < l;i = i + 1)
				{
					min = a[0][i];
					for (j = 1;j < l;j = j + 1)
					{
						if (a[j][i] < min)
						{
							min = a[j][i];
						}
					}
					for (j = 0;j < l;j = j + 1)
					{
						a[j][i] = a[j][i] - min;
					}
				}
				sum = sum + a[1][1];
				if (l != 2)
				{
					for (i = 1;i < l;i = i + 1)
					{
						a[0][i] = a[0][i + 1],a[i][0] = a[i + 1][0];
					}
					for (i = 1;i < l;i = i + 1)
					{
						for (j = 1;j < l;j = j + 1)
						{
							a[i][j] = a[i + 1][j + 1];
						}
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

