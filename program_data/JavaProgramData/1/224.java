package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012739_34_1.cpp
	 *
	 *  Created on: 2010-12-3
	 *      Author: ???
	 *		Title: 1090 ????
	 */



	public static int cnt = 0; //????????

	public static void slv(int nm,int pr) //nm????????pr???????
	{
		int i;
		if (nm >= pr) //???????????
		{
			cnt++; //??????
			if (pr == 1) //???????????2??
			{
				pr++;
			}
			for (i = pr;i <= nm;i++) //??????
			{
				if (nm % i == 0) //??nm???
				{
					slv(nm / i, i); //nm??i???
				}
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			cnt = 0; //???????
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			slv(num, 1); //??cnt
			System.out.print(cnt);
			System.out.print("\n");
		}
	}
}

