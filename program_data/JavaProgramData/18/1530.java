package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] a = new int[100][100];
	public static int sum;
	public static void col(int c)
	{
		 if (c == n)
		 {
			  System.out.print(sum);
			  System.out.print("\n");
			  return;
		 }
		 int min;
		 for (int i = 0; i <= n - c; i++)
		 {
				 min = a[i][0];
				 for (int j = 1; j <= n - c; j++)
				 {
						  if (a[i][j] < min)
						  {
							  min = a[i][j];
						  }
				 }
				 if (min != 0)
				 {
						 for (int j = 0; j <= n - c; j++)
						 {
								 a[i][j] = a[i][j] - min;
						 }
				 }
		 }
		 for (int i = 0; i <= n - c; i++)
		 {
				 min = a[0][i];
				 for (int j = 1; j <= n - c; j++)
				 {
						  if (a[j][i] < min)
						  {
							  min = a[j][i];
						  }
				 }
				 if (min != 0)
				 {
						for (int j = 0; j <= n - c; j++)
						{
								a[j][i] = a[j][i] - min;
						}
				 }
		 }
		 sum += a[1][1];
		 a[1][1] = a[2][2];
		 for (int i = 1; i < n - c; i++)
		 {
				 a[0][i] = a[0][i + 1];
		 }
		 for (int i = 1; i < n - c; i++)
		 {
				 a[i][0] = a[i + 1][0];
		 }
		 for (int i = 1; i < n - c; i++)
		 {
			 for (int j = 1; j < n - c; j++)
			 {
				 a[i][j] = a[i + 1][j + 1];
			 }
		 }
		 col(c + 1);

	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int l = 0; l < n; l++)
		{
				for (int i = 0; i < n; i++)
				{
						for (int j = 0; j < n; j++)
						{
								a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						}
				}
				sum = 0;
				col(1);
		}
		return 0;
	}

}

