package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int i;
		int j;
		if (x == 3 || x == 5 || x == 7)
		{
			return 1;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(x);i += 2)
			{
				if (x % i == 0)
				{
					return 0;
					break;
				}
			}
			return 1;
		}
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				if (prime(j) + prime(i - j) == 2)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
	}


}

