package <missing>;

public class GlobalMembers
{
	/*
	 * DeleteNumber.cpp
	 *
	 *  Created on: 2012-11-2
	 *  Author: ??
	 *  ??????????????????????????????????????
	 ?????????????????????????????
	 */

	//?????

	public static int Main()
	{
		int n; //????n?k??????
		int k;
		int num = 0;
		int[] a = new int[100010]; //??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0; j < n - num; j++) //?????????
		{
			if (a[j] == k) //????????k
			{
				num = num + 1; //???????
				for (int t = j; t < n - num; t++)
				{
					a[t] = a[t + 1]; //????????
				}
				if (a[j] == k)
				{
					j = j - 1; //???????k????
				}
			}
		}
		for (int i1 = 0; i1 < n - num - 1; i1++)
		{
			System.out.print(a[i1]);
			System.out.print(" ");
		}
		System.out.print(a[n - num - 1]);
		return 0; //??
	}

}

