package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k = 0;
	int j;
	int m;
	int t = 0;
	char[][] s =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < m - 1;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (s[j][0] == '@')
			{
				if (s[j][1] == '.')
				{
					s[j][1] = '1';
				}
				 if (s[j - 1][0] == '.')
				 {
					s[j - 1][0] = '1';
				 }
				  if (s[j + 1][0] == '.')
				  {
					s[j + 1][0] = '1';
				  }
			}
		  for (k = 1;k <= 100;k++)
		  {
			  if (s[j][k] == '@')
			  {
				  if (s[j][k + 1] == '.')
				  {
					  s[j][k + 1] = '1';
				  }
				  if (s[j][k - 1] == '.')
				  {
					  s[j][k - 1] = '1';
				  }
				  if (s[j - 1][k] == '.')
				  {
					  s[j - 1][k] = '1';
				  }
				  if (s[j + 1][k] == '.')
				  {
					  s[j + 1][k] = '1';
				  }
			  }
		  }
		}
		for (j = 1;j <= n;j++)
		{
		  for (k = 0;k < 100;k++)
		  {
			  if (s[j][k] == '1')
			  {
				  s[j][k] = '@';
			  }
		  }
		}
	}
		for (j = 1;j <= n;j++)
		{
		  for (k = 0;k < 100;k++)
		  {
			  if (s[j][k] == '@')
			  {
				  t++;
			  }
		  }
		}
		System.out.printf("%d",t);
	return 0;
	}

}

