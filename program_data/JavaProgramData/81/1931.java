package <missing>;

public class GlobalMembers
{
	public static int huan(int n,int m)
	{

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  if (n < 0 || n>4 || m < 0 || m>4)
	  {
		  return 0;
	  }
	  else
	  {
	  return 1;
	  }
	}

	public static int Main()
	{
	int[][] a = new int[5][5];
	int n;
	int m;
	int i;
	int j;
	int[] b = new int[5];

	 for (i = 0;i < 5;i++)
	 {
		for (j = 0;j < 5;j++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
		}
	 }
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (huan(n, m) == 0)
	{
	  System.out.print("error\n");
	}
	if (huan(n, m) == 1)
	{
		for (i = 0;i < 5;i++)
		{
		  b[i] = a[n][i];
		  a[n][i] = a[m][i];
		  a[m][i] = b[i];
		}
	  for (i = 0;i < 5;i++)
	  {
		for (j = 0;j < 4;j++)
		{
		  System.out.printf("%d ",a[i][j]);
		}
		System.out.printf("%d\n",a[i][4]);
	  }
	}
		return 0;
	}

}

