package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int i;
		int k;
		int l;
		int min;
		int sum = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1; l <= n; l++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (k = n;; k--)
			{
				for (i = 0; i < k; i++)
				{
					min = a[i][0];
					for (j = 0; j < k; j++)
					{
						if (a[i][j] < min)
						{
							min = a[i][j];
						}
					}
					for (j = 0; j < k; j++)
					{
						a[i][j] -= min;
					}
				}
				for (i = 0; i < k; i++)
				{
					min = a[0][i];
					for (j = 0; j < k; j++)
					{
						if (a[j][i] < min)
						{
							min = a[j][i];
						}
					}
					for (j = 0; j < k; j++)
					{
						a[j][i] -= min;
					}
				}
				sum += a[1][1];
				if (k == 2)
				{
					break;
				}
				for (i = 1; i <= k - 2; i++)
				{
					a[0][i] = a[0][i + 1];
					a[i][0] = a[i + 1][0];
					for (j = 1; j <= k - 2; j++)
					{
						a[i][j] = a[i + 1][j + 1];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		System.in.read();
		System.in.read();
		return 0;
	}








}

