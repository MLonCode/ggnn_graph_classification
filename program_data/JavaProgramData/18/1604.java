package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][] a = new int[200][200];
	public static int temp;
	public static int[] sum = new int[200];

	public static void zero(int i)
	{
		int mi = 1000;
		for (int j = i;j <= n;j++)
		{
			for (int k = i;k <= n;k++)
			{
				mi = Math.min(*(*(a + j) + k),mi);
			}
			for (int k = i;k <= n;k++)
			{
				*(*(a + j) + k) = *(*(a + j) + k) - mi;
			}
			mi = 1000;
		}
		mi = 1000;
		for (int k = i;k <= n;k++)
		{
			for (int j = i;j <= n;j++)
			{
				mi = Math.min(*(*(a + j) + k),mi);
			}
			for (int j = i;j <= n;j++)
			{
				*(*(a + j) + k) = *(*(a + j) + k) - mi;
			}
			mi = 1000;
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int l = 1;l <= n;l++)
		{
			sum[l] = 0;
			for (int j = 1;j <= n;j++)
			{
				for (int k = 1;k <= n;k++)
				{
					*(*(a + j) + k) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			for (int i = 1;i <= n;i++)
			{
				temp = (*(a + 1) + i);
				*(*(a + 1) + i) = *(*(a + 2) + i);
				*(*(a + 2) + i) = temp;
			}
			for (int i = 1;i <= n;i++)
			{
				temp = (*(a + i) + 1);
				*(*(a + i) + 1) = *(*(a + i) + 2);
				*(*(a + i) + 2) = temp;
			}
			for (int i = 1;i <= n - 1;i++)
			{
				zero(i);
				sum[l] += *(*(a + i) + i);
				for (int k = i + 1;k <= n;k++)
				{
					temp = (*(a + i + 1) + k);
					*(*(a + i + 1) + k) = *(*(a + i + 2) + k);
					*(*(a + i + 2) + k) = temp;
				}
				for (int j = i + 1;j <= n;j++)
				{
					temp = (*(a + j) + i + 1);
					*(*(a + j) + i + 1) = *(*(a + j) + i + 2);
					*(*(a + j) + i + 2) = temp;
				}
			}
			System.out.print(sum[l]);
			System.out.print("\n");
		}
		return 0;
	}
}

