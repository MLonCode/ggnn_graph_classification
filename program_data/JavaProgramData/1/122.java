package <missing>;

public class GlobalMembers
{
	public static int fun(int m,int n)
	{
		//m????n????

		//??????????????????????;
		if (m > Math.sqrt(n))
		{
			return 0;
		}
		//????????????
		if (n % m == 0)
		{
			return fun(m + 1, n) + fun(m, n / m) + 1;
		}
		else
		{
			return fun(m + 1, n);
		}
		//????????????????????????????????????????+1?
		//??????????+1
	}
	//????????????
	public static int Main()
	{
		int i;
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= x;i++)
		{
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(fun(2, y) + 1);
		System.out.print("\n");
		}
		return 0;
	}

}

