package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int x1;
	 int y1;
	 int x2;
	 int y2;
	 int i;
	 int j;
	 int k;
	 int[][] a = new int[100][100]; //for(i=0;i<10;i++)for(j=0;j<10;j++)printf("%d",c[i][j]);
	 int[][] b = new int[100][100];
	 int[][] c = new int[100][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
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
	 String tempVar5 = ConsoleInput.scanfRead();
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
	  for (k = 0;k < y1;k++)
	  {
	  c[i][j] += a[i][k] * b[k][j]; //printf("%d",c[i][j]);}
	  }
	 }
	 }
	 for (i = 0;i < x1;i++)
	 {
	 for (j = 0;j < y2;j++)
	 {
	  if (j == (y2 - 1))
	  {
		  if (i != (x1 - 1))
		  {
			  System.out.printf("%d\n",c[i][j]);
		  }
		  else
		  {
			  System.out.printf("%d",c[i][j]);
		  }
	  }
	  else
	  {
		  System.out.printf("%d ",c[i][j]);
	  }
	 }
	 }

	}
}

