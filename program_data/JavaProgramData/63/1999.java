package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int k;
		int sum;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < x2;i++)
		{
			 for (j = 0;j < y2;j++)
			 {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 b[i][j] = Integer.parseInt(tempVar6);
			 }
			 }
		}
			 for (i = 0;i < x1;i++)
			 {
			   for (j = 0;j < y2;j++)
			   {
				 for (k = 0,sum = 0;k < x2;k++)
				 {
				 sum = sum + a[i][k] * b[k][j];
				 }
				 c[i][j] = sum;
			   }
			 }
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < (y2 - 1);j++)
			{
			System.out.printf("%d ",c[i][j]);
			}
			System.out.printf("%d",c[i][j]);
			System.out.print("\n");
		}

	}


}

