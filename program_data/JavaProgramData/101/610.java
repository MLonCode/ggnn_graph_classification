package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int a;
		int b;
		int c;
		char[] name = {0, 'A', 'B', 'C'};
		int[][] fan = new int[4][2]; //fan[i][0]????;fan[i][1]=i(1,2,3??a,b,c)
		for (i = 0;i < 4;i++)
		{
			fan[i][0] = 0;
			fan[i][1] = i;
		}
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				c = 3 - a - b;
				if ((((b > a) + (c == a) + a) == 2) && (((a > b) + (a > c) + b) == 2) && (((c > b) + (b > a) + c) == 2))
				{
					fan[1][0] = a;
					fan[1][1] = 1;
					fan[2][0] = b;
					fan[2][1] = 2;
					fan[3][0] = c;
					fan[3][1] = 3;
					for (i = 1;i < 4;i++)
					{
						for (j = 1;j < 4 - i;j++)
						{
							if (fan[j + 1][0] < fan[j][0])
							{
								m = fan[j + 1][0];
								n = fan[j + 1][1];
								fan[j + 1][0] = fan[j][0];
								fan[j + 1][1] = fan[j][1];
								fan[j][0] = m;
								fan[j][1] = n;
							}
						}
					}
					System.out.print(name[fan[1][1]]);
					System.out.print(name[fan[2][1]]);
					System.out.print(name[fan[3][1]]);
				}
			}
		}
		return 0;
	}
}
