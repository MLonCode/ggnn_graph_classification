package <missing>;

public class GlobalMembers
{
	/*
	 * ????????????.cpp
	 * ?????
	 * ????: 2012-10-29
	 * ???????????
	 */
	public static int Main()
	{ //?????
		int[] a = new int[100000]; //????a[100000]
		int n = 1; //???????
		int k = 1;
		int m = 1;
		int i = 0;
		int j = 0;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{ //?????????
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = m;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{ //???????
			if (a[j] == k)
			{ //????????k
				for (t = j;t < n;t++)
				{
					a[t] = a[t + 1]; //??????
				}
				j--;
				n--; //???j?n??
			}
			else
			{
				continue; //????
			}
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		return 0;
	} //?????
}

