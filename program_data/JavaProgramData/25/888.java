package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a[99] = 2;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1;j <= n - 1;j++)
		{
			for (int i = 99;i >= 0;i--)
			{
				a[i] = a[i] * 2;
			}
			for (int i = 99;i >= 0;i--)
			{
				if (a[i] >= 10)
				{
					a[i] = a[i] - 10;
					a[i - 1] = a[i - 1] + 1;
				}
			}
		}
		int m = 0;
		for (int i = 0;i <= 99;i++)
		{
			if (a[i] != 0)
			{
				m = i;
				break;
			}
		}
		if (n != 0)
		{
			for (int i = m;i <= 99;i++)
			{
				System.out.print(a[i] + 48);
			}
		}
		else
		{
			System.out.print("1");
		}
		return 0;
	}

}

