package <missing>;

public class GlobalMembers
{
	//******************************************************************************
	//???????? 
	//?????? 
	//???11-1 
	//******************************************************************************


	public static int Main()
	{
		int[][] a = new int[111][111]; //????????????
		int[][] b = new int[111][111]; //????????????
		int n; //?????
		char[][] c = new char[111][111]; //??????????
		int day; //???
		int sum = 0;
		char ch; //??????????????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; i++) //???????????
		{
		c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}

		for (int i = 1; i <= n; i++)
		{ //?????????"." = 1, "#" = 0, "@" = -1

			for (int j = 1; j <= n; j++) //??????1-n??1-n??????????????
			{
				ch = c[i][j - 1];

				if (ch == '.')
				{
				a[i][j] = 1;
				}

				else if (ch == '#')
				{
				a[i][j] = 0;
				}

				else
				{
				a[i][j] = -1;
				}
			}

		}

		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < day - 1; i++) //??n???????n-1???
		{
			for (int k = 1; k <= n; k++)
			{
			for (int j = 1; j <= n; j++)
			{
			b[k][j] = a[k][j]; //??a?????b?????b????a
			}
			}

			for (int r = 1; r <= n; r++)
			{
			for (int co = 1; co <= n; co++)
			{
				if (a[r][co] == -1) //??????????????????
				{
					if (a[r - 1][co] == 1) //????????????????= -1
					{
					b[r - 1][co] = -1;
					}

					if (a[r + 1][co] == 1)
					{
					b[r + 1][co] = -1;
					}

					if (a[r][co - 1] == 1)
					{
					b[r][co - 1] = -1;
					}

					if (a[r][co + 1] == 1)
					{
					b[r][co + 1] = -1;
					}
				}
			}
			}

			for (int r = 1; r <= n; r++) //????????b??????b??a???????????
			{
			for (int co = 1; co <= n; co++)
			{
			a[r][co] = b[r][co];
			}
			}
		}



		for (int i = 1; i <= n; i++) //???????-1?????????
		{
		for (int j = 1; j <= n; j++)
		{
		if (a[i][j] == -1)
		{
		sum++;
		}
		}
		}

		System.out.print(sum);


		return 0;
	}

}

