package <missing>;

public class GlobalMembers
{
	/*
	 * ????factorization.cpp
	 * ??????
	 * ????:2012-11-26
	 * ???????
	 */

	public static int j = 2; //??????j

	public static int kinds(int x)
	{ //????kinds
		int sum = 1;
		if (x == 1)
		{
			return 0; //?????????1????1?????????0
		}
		for (int i = j;i <= Math.sqrt(x);i++) //?for????x????????1??i??
		{
			if (x % i == 0) //??x???i?????????i??????????
			{
				sum += kinds(x / i); //??????x/i????
				j = i + 1; //??????i????????x????
			}
		}
		return sum; //???????????
	}
	public static int Main()
	{ //???
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int x = 0; //????x
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(kinds(x));
			System.out.print("\n");
			j = 2; //??
		}
		return 0; //?????
	}
}

