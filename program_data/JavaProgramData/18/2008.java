package <missing>;

public class GlobalMembers
{
	public static int calc(int[][] s, int n)
	{
		int min;
		for (int i = 0; i < n; i++)
		{
			min = s[i][0];
			for (int j = 1; j < n; j++) //?????????
			{
				if (s[i][j] < min)
				{
					min = s[i][j];
				}
			}
			for (int j = 0; j < n; j++) //?????
			{
				s[i][j] -= min;
			}
		}
		for (int j = 0; j < n; j++)
		{
			min = s[0][j];
			for (int i = 1; i < n; i++) //?????????
			{
				if (s[i][j] < min)
				{
					min = s[i][j];
				}
			}
			for (int i = 0; i < n; i++) //?????
			{
				s[i][j] -= min;
			}
		}
		return s[1][1]; //??s[1][1]
	}

	public static int Main()
	{
		int[][] s = new int[100][100];
		int n;
		int sum;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1; k <= n; k++)
		{
			for (int i = 0; i < n; i++) //??
			{
				for (int j = 0; j < n; j++)
				{
					s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			m = n;
			sum = 0;
			for (int order = 1; order < n; order++)
			{
				sum += calc(s, m); //??????s[1][1]
				m--;
				for (int i = 1; i < n - 1; i++) //?????
				{
					for (int j = 0; j < n; j++)
					{
						s[i][j] = s[i + 1][j];
					}
				}
				for (int j = 1; j < n - 1; j++) //?????
				{
					for (int i = 0; i < m; i++)
					{
						s[i][j] = s[i][j + 1];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

