package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[][] a = new int[25][25];
	 int m;
	 int n;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 0;i < 25;i++)
	 {
	   for (int j = 0;j < 25;j++)
	   {
		   a[i][j] = 0;
	   }
	 }
	 for (int i = 1;i <= m;i++)
	 {
	   for (int j = 1;j <= n;j++)
	   {
		   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	 }
	 for (int i = 1;i <= m;i++)
	 {
	   for (int j = 1;j <= n;j++)
	   {
		  if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
		  {
			  System.out.print(i - 1);
			  System.out.print(" ");
			  System.out.print(j - 1);
			  System.out.print("\n");
		  }
	   }
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}
}

