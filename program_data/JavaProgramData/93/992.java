package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 5 == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print("\n");
		}
		else if (a % 5 == 0 && a % 7 == 0)
		{
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		else if (a % 3 == 0 && a % 7 == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		else if (a % 3 == 0)
		{
			System.out.print(3);
			System.out.print("\n");
		}
		else if (a % 5 == 0)
		{
			System.out.print(5);
			System.out.print("\n");
		}
		else if (a % 7 == 0)
		{
			System.out.print(7);
			System.out.print("\n");
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}
}

