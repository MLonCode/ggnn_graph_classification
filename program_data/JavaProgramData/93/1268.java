package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 105 == 0)
		{
			System.out.print("3 5 7");
		}
		else
		{
			if (a % 15 == 0 || a % 21 == 0 || a % 35 == 0)
			{
		if (a % 15 == 0)
		{
			System.out.print("3 5");
		}
			if (a % 21 == 0)
			{
				System.out.print("3 7");
			}
				if (a % 35 == 0)
				{
					System.out.print("5 7");
				}
			}
		else
		{
			if (a % 3 == 0 || a % 5 == 0 || a % 7 == 0)
			{
		if (a % 3 == 0)
		{
			System.out.print("3");
		}
		if (a % 5 == 0)
		{
			System.out.print("5");
		}
		if (a % 7 == 0)
		{
			System.out.print("7");
		}
			}
		else
		{
			System.out.print("n");
		}
		}
		}
		return 0;
	}
}

