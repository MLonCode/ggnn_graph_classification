void f(int, int);
int i;
int j;
char[][][] a =
{
	{
		{0, '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'},
		{'\0', '\0'}
	}
};
int main()
{
	int i;
	int j;
	int n;
	int m;
	int l = 0;
	int sum = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		for (j = 1; j <= n; j++)
		{
			a[i][j][0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[i][j][1] = a[i][j][0];
		}
	}
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i < m; i++)
	{
		f(n, l);
		l = 1 - l;
	}
	for (i = 1; i <= n; i++)
	{
		for (j = 1; j <= n; j++)
		{
			if (a[i][j][l] == '@')
			{
				sum++;
			}
		}
	}
	System.out.print(sum);
	System.out.print("\n");
	return 0;
}
void f(int n, int l)
{
	for (i = 1; i <= n; i++)
	{
		for (j = 1; j <= n; j++)
		{
			if (a[i][j][l] == '@')
			{
				if (a[i - 1][j][l] != '#')
				{
					a[i - 1][j][1 - l] = '@';
				}
				if (a[i + 1][j][l] != '#')
				{
					a[i + 1][j][1 - l] = '@';
				}
				if (a[i][j - 1][l] != '#')
				{
					a[i][j - 1][1 - l] = '@';
				}
				if (a[i][j + 1][l] != '#')
				{
					a[i][j + 1][1 - l] = '@';
				}
			}
		}
	}
}



