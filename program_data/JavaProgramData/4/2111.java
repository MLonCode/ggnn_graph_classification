package <missing>;

public class GlobalMembers
{
	///#include<stdlib.h>
	///#include<math.h>
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row + col;i++)
		{
			if (i < col)
			{
				j = 0;
			}
			else
			{
				j = i - col + 1;
			}
			for (;j <= i != 0 && j < row;j++)
			{
				System.out.printf("%d\n",a[j][i - j]);
			}
		}
		return 0;
	}

}

