package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ???????????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?11?22? 
	//*************************

	public static int guiling(int count)
	{
		int j;
		int k;
		for (j = 0; j < count; j++)
		{
			int min = a[j][0]; //??????????????
			for (k = 1; k < count; k++) //?????????????
			{
				if (min > a[j][k])
				{
					min = a[j][k];
				}
			}
			for (k = 0; k < count; k++) //????????????
			{
				a[j][k] -= min;
			}
		}
		for (k = 0; k < count; k++) //?????????
		{
			 int min = a[0][k];
			 for (j = 1; j < count; j++)
			 {
				  if (min > a[j][k])
				  {
					  min = a[j][k];
				  }
			 }
			 for (j = 0; j < count; j++) //????????????
			 {
				 a[j][k] -= min;
			 }
		}
	}
	public static int xiaojian(int count)
	{
		int j;
		int k;
		for (j = 1; j < count - 1; j++) //????????????????n-1?n-1????????
		{
			a[0][j] = a[0][j + 1];
			a[j][0] = a[j + 1][0];
			for (k = 1; k < count - 1; k++)
			{
				 a[j][k] = a[j + 1][k + 1];
			}
		}
	}

	public static int n; //?n???????????????n*n?
	public static int[][] a = new int[101][101]; //???????????????????????
	public static int Main()
	{
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			int sum = 0;
			for (j = 0; j < n; j++)
			{
			 for (k = 0; k < n; k++)
			 {
				 a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
			}
			for (int count = n; count > 1; count--) //?????n?????????????2???????
			{
				  guiling(count); //??????
				  sum += a[1][1]; //????a[1][1]??
				  xiaojian(count); //??????
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

