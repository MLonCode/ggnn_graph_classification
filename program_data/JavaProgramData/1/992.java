package <missing>;

public class GlobalMembers
{
	/*
	 * fenjieyinshi1.cpp
	 *???????
	 *  Created on: 2011-12-1
	 *??:???
	 */
	public static int remember = 0; //???????????0
	public static int number(int const1,int a) //?????
	{
		if (a == 1) //??????1??????????????
		{
			remember++;
			return 1; //??=1
		}
		else
		{
		for (int i = const1;i <= a;i++) //????1??????????
		{
			if (a % i == 0) //??????????
			{
			number(i, a / i); //?????????
			}
		}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] cases = new int[n]; //??????????
		for (int j = 0;j < n;j++)
		{
			cases[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n;j++)
		{
			number(2, cases[j]); //????
			System.out.print(remember);
			System.out.print("\n");
			remember = 0; //?????????
		}
		return 0;
	}
}

