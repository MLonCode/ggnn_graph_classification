package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		while (true)
		{
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n = n / 2;
				if (n == 1)
				{
					break;
				}
			}
			else
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(((n * 3) + 1));
				System.out.print("\n");
				n = n * 3 + 1;
				if (n == 1)
				{
					break;
				}
			}
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}
}

