package <missing>;

public class GlobalMembers
{
	public static int isprime(int n)
	{
	 int i;
	for (i = 2;i < n;i++)
	{
	if (n % i == 0)
	{
	return 0;
	}
	}
	return 1;
	}

	public static int Main()
	{
	int m;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}

	for (i = 3;i <= m / 2;i += 2)
	{
	if (isprime(i) != 0 && isprime(m - i) != 0)
	{
	System.out.printf("%d %d\n",i,m - i);
	continue;
	}
	}
	return 0;
	}
}

