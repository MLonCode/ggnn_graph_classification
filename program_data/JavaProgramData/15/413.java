package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int a;
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;
		int s;
		int[][] x = new int[11][11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (x[i][j] == 0)
				{
					a1 = i;
					b1 = j;
					break;
				}
			}
			if (x[a1][b1] == 0)
			{
				break;
			}
		}
		for (i = a - 1;i >= 0;i--)
		{
			for (j = a - 1;j >= 0;j--)
			{
				if (x[i][j] == 0)
				{
					a2 = i;
					b2 = j;
					break;
				}
			}
			if (x[i][j] == 0)
			{
				break;
			}
		}
			s = (b2 - b1 - 1) * (a2 - a1 - 1);
			System.out.printf("\n%d\n",s);
	}





}

