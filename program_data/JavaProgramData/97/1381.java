package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n / 100 > 0)
		{
			System.out.printf("%d\n",n / 100);
		}
		else
		{
			System.out.print("0\n");
		}
		n = n % 100;
		if (n / 50 > 0)
		{
			System.out.printf("%d\n",n / 50);
		}
		else
		{
			System.out.print("0\n");
		}
		n = n % 50;
		if (n / 20 > 0)
		{
			System.out.printf("%d\n",n / 20);
		}
		else
		{
			System.out.print("0\n");
		}
		n = n % 20;
		if (n / 10 > 0)
		{
			System.out.printf("%d\n",n / 10);
		}
		else
		{
			System.out.print("0\n");
		}
		n = n % 10;
		if (n / 5 > 0)
		{
			System.out.printf("%d\n",n / 5);
		}
		else
		{
			System.out.print("0\n");
		}
		n = n % 5;
		System.out.printf("%d",n % 5);
		return 0;
	}
}

