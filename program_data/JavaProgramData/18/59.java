package <missing>;

public class GlobalMembers
{
	public static void r(int m)
	{
		int x;
		int y;
		int min;
		for (x = 0; x < m; x++)
		{
			min = a[x][0];
			for (y = 0; y < m; y++)
			{
				if (a[x][y] < min)
				{
					min = a[x][y];
				}
			}
			for (y = 0; y < m; y++)
			{
				a[x][y] = a[x][y] - min;
			}
		}
	}
	public static void l(int m)
	{
		int x;
		int y;
		int min;
		for (y = 0; y < m; y++)
		{
			min = a[0][y];
			for (x = 0; x < m; x++)
			{
				if (a[x][y] < min)
				{
					min = a[x][y];
				}
			}
			for (x = 0; x < m; x++)
			{
				a[x][y] = a[x][y] - min;
			}
		}
	}
	public static void fun(int m)
	{
		int i;
		int j;
		for (i = 0; i < m; i++)
		{
			for (j = 2; j < m; j++)
			{
				 a[i][j - 1] = a[i][j];
			}
		}
		for (j = 0; j < m - 1; j++)
		{
			for (i = 2; i < m; i++)
			{
				a[i - 1][j] = a[i][j];
			}
		}
	}
	public static void Try(int i)
	{
		r(n - i);
		l(n - i);
		s[i] = a[1][1];
		fun(n - i);
		if (i < n - 1)
		{
			Try(i + 1);
		}
	}
	public static int[][] a = new int[100][100];
	public static int n;
	public static int[] s = new int[100];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sum = 0;
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			Try(0); //�&raquo;&micro;�&Oacute;&Atilde;&ordm;&macr;&Ecirc;&yacute;
			for (j = 0; j < n - 1; j++)
			{
				sum = sum + s[j]; //sum&micro;&Auml;�&Uuml;&ordm;&Iacute;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}












}

