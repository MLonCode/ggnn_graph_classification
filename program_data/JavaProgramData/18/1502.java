package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????    **
	//*?????? 1200012839    **
	//*???2012.11.20          **
	//********************************
	public static int[][] a = new int[100][100]; //??????
	public static int xiao(int n) //???????????????a[1][1]
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			int min = a[i][0];
			for (j = 1; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			if (min == 0)
			{
				continue;
			}
			for (j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (i = 0; i < n; i++)
		{
			int min = a[0][i];
			for (j = 1; j < n; j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			if (min == 0)
			{
				continue;
			}
			for (j = 0; j < n; j++)
			{
				a[j][i] -= min;
			}
		}
		return a[1][1];
	}

	public static void suo(int n) //??????????????????
	{
		int i;
		int j;
		for (i = 1; i < n - 1; i++)
		{
			a[0][i] = a[0][i + 1];
		}
		for (i = 1; i < n - 1; i++)
		{
			a[i][0] = a[i + 1][0];
		}
		for (i = 1; i < n - 1; i++)
		{
			for (j = 1; j < n - 1; j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
		return;
	}

	public static int Main() //???
	{
		int n;
		int l;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0; l < n; l++)
		{
			int count = 0; //?????
			for (i = 0; i < n; i++) //??????
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			i = n;
			while (i > 1) //??????????????????????
			{
				count = count + xiao(i);
				suo(i);
				i--;
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}

}

