package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//a,b????????,c???,x1,y1,x2,y2??a,b????????,i,j,k?????
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++) //????a
		{
			for (j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++) //????b
		{
			for (j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				c[i][j] = 0; //??c??????
				for (k = 1; k <= y1; k++)
				{
					c[i][j] = a[i][k] * b[k][j] + c[i][j];
				}
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				if (j != y2)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

