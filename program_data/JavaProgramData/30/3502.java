package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			if (i % 7 != 0)
			{
				if (i != 7)
				{
					if ((int)(i / 10) != 7)
					{
						if (i % 10 != 7)
						{
							s += i * i;
						}
					}
				}
			}
			i++;
		}
		System.out.printf("%d",s);
		return 0;
	}
}

