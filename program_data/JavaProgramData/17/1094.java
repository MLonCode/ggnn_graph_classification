package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] d = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int l;
		int i;
		int j;
		int s;
		while (scanf("%s",c) != EOF)
		{
		l = c.length();
		for (i = 0;i < l;i++)
		{
			if (c[i] == '(')
			{
				d[i] = '$';
			}
			else if (c[i] == ')')
			{
				d[i] = '?';
				for (j = i - 1, s = 1;j >= 0 && s == 1;j--)
				{
					if (d[j] == '$')
					{
						d[j] = d[i] = ' ';
						s = 0;
					}
				}
			}
			else
			{
				d[i] = ' ';
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",c[i]);
		}
		System.out.print("\n");
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",d[i]);
		}
		System.out.print("\n");
		}
	}

}
