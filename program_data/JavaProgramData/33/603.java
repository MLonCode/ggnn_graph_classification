package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[1000][256];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;zfc[i][j] != '\0';j++)
			{
				if (zfc[i][j] == 'A')
				{
					zfc[i][j] = 'T';
				}
				else
				{
					if (zfc[i][j] == 'T')
					{
					zfc[i][j] = 'A';
					}
				else
				{
					if (zfc[i][j] == 'G')
					{
					zfc[i][j] = 'C';
					}
				else
				{
					if (zfc[i][j] == 'C')
					{
					zfc[i][j] = 'G';
					}
				}
				}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;zfc[i][j] != '\0';j++)
			{
				System.out.printf("%c",zfc[i][j]);
			}
				if (zfc[i][j] == '\0')
				{
				System.out.print("\n");
				}
		}


		return 0;
	}




}

