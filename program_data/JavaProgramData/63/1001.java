package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x;
		  int y;
		  int z;
		  int i;
		  int j;
		  int k;
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int[][] c = new int[100][100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y = Integer.parseInt(tempVar2);
		  }
		  for (i = 0;i < x;i++)
		  {
			 for (j = 0;j < y;j++)
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
			  y = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  z = Integer.parseInt(tempVar5);
		  }
		  for (i = 0;i < y;i++)
		  {
			 for (j = 0;j < z;j++)
			 {
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 b[i][j] = Integer.parseInt(tempVar6);
			 }
			 }
		  }
		  for (i = 0;i < x;i++)
		  {
			 for (j = 0;j < z;j++)
			 {
				for (k = 0;k < y;k++)
				{
				  c[i][j] += a[i][k] * b[k][j];
				}
			 }
		  }
		  for (i = 0;i < x;i++)
		  {
			 System.out.printf("%d",c[i][0]);
			 for (j = 1;j < z;j++)
			 {
			 System.out.printf(" %d",c[i][j]);
			 }
			 System.out.print("\n");
		  }
		  System.in.read();
		  System.in.read();
	}



}

