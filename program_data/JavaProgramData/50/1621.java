package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= 12;i++)
		{
			if ((w + 12) % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				w = w + 31;
			}
			else if (i == 2)
			{
				w = w + 28;
			}
			else
			{
				w = w + 30;
			}
		}
	}
}

