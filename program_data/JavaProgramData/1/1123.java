package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *  Created on: 2012-11-19
	 *  Author:???
	 */
	public static int f(int a,int b)
	{ //?a???????b?????????
		int num = 1;
		int i;
		for (i = b;i <= Math.sqrt(a);i++)
		{ //??b?a???????????a?
			if (a % i == 0)
			{
				num += f(a / i, i); //????a??????????a??????????i??????
			}
		}
		return num; //????
	}
	public static int Main()
	{
		int i;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(a, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

