package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int counter;
		char[][] a = new char[102][102];
		char[][] b = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n + 2;i++)
		{
		   for (j = 0;j < n + 2;j++)
		   {
			   a[i][j] = '#';
		   }
		}
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2;k <= m;k++)
		{
			for (i = 0;i <= n + 1;i++)
			{
			  for (j = 0;j <= n + 1;j++)
			  {
					b[i][j] = a[i][j];
			  }
			}
		   for (i = 1;i <= n;i++)
		   {
			  for (j = 1;j <= n;j++)
			  {
				 if (a[i][j] == '@')
				 {

					if (a[i - 1][j] == '.')
					{
						b[i - 1][j] = '@';
					}
					if (a[i + 1][j] == '.')
					{
						b[i + 1][j] = '@';
					}
					if (a[i][j - 1] == '.')
					{
						b[i][j - 1] = '@';
					}
					if (a[i][j + 1] == '.')
					{
						b[i][j + 1] = '@';
					}
				 }
			  }
		   }
		   for (i = 0;i <= n + 1;i++)
		   {
			  for (j = 0;j <= n + 1;j++)
			  {
					a[i][j] = b[i][j];
			  }
		   }
		}
		counter = 0;
		for (i = 1;i <= n;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
			   if (a[i][j] == '@')
			   {
				   counter++;
			   }
		   }
		}
		System.out.print(counter);
		return 0;
	}
}

