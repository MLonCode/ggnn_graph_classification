package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
	{
	if (i % 7 != 0 && (i - 7) % 10 != 0 && i < 70)
	{
	sum += i * i;
	}
	else if (i % 7 != 0 && (i - 7) % 10 != 0 && i > 79)
	{
	sum += i * i;
	}
	}
	System.out.printf("%d",sum);
	return 0;
	}
}

