package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                       **
	//*????? 1100012762                **
	//*???2011.11.15                     **
	//****************************************
	public static int f(int n) //????????????????????1????????????
	{
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		else
		{
			if (n % 2 == 0)
			{
				System.out.print(n);
				System.out.print("/2=");
				System.out.print(n / 2);
				System.out.print("\n");
				n /= 2;
			}
			else
			{
				System.out.print(n);
				System.out.print("*3+1=");
				System.out.print(n * 3 + 1);
				System.out.print("\n");
				n = n * 3 + 1;
			}
			return f(n);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(n);
		return 0;
	}
}

