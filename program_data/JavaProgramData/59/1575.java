package <missing>;

public class GlobalMembers
{
	public static final int MAXN = 200;
	 public static char[][] a = new char[MAXN + 10][MAXN + 10];

	public static char getAChar()
	{
		int ch = System.in.read();
		while (ch != '#' && ch != '.' && ch != '@')
		{
			ch = System.in.read();
		}
		return ch;
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_n;
int i;
int j;
int m;
int k;
int g;
int sum = 0;
int[] temp1 = new int[MAXN * MAXN + 10];
int[] temp2 = new int[MAXN * MAXN + 10];
int r;
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int n,i,j,m,k,g,sum=0,temp1[MAXN *MAXN+10],temp2[MAXN *MAXN+10],r;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Main_n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= Main_n;i++)
		{
			for (j = 1;j <= Main_n;j++)
			{
				a[i][j] = getAChar();
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (k = 1;k < m;k++)
		{
			r = 1;
			for (i = 1;i <= Main_n;i++)
			{
				for (j = 1;j <= Main_n;j++)
				{
					if (a[i][j] == '@')
					{
						temp1[r] = i;
						temp2[r] = j;
						r += 1;
					}
				}
			}
			for (g = 1;g < r;g++)
			{
				i = temp1[g];
				j = temp2[g];
				if (a[i + 1][j] == '.')
				{
					a[i + 1][j] = '@';
				}
				if (a[i][j + 1] == '.')
				{
					a[i][j + 1] = '@';
				}
				if (a[i - 1][j] == '.')
				{
					a[i - 1][j] = '@';
				}
				if (a[i][j - 1] == '.')
				{
					a[i][j - 1] = '@';
				}
			}
		}
		for (i = 1;i <= Main_n;i++)
		{
			for (j = 1;j <= Main_n;j++)
			{
				if (a[i][j] == '@')
				{
					sum += 1;
				}
			}
		}
		System.out.printf("%d\n",sum);

		return 0;
	}

}

