package <missing>;

public class GlobalMembers
{
	/*
	 *  qizhongceshi9.cpp
	 *  ???????????????????????????????
	 *  Created on: 2010-11-13
	 *      Author: william
	 */
	public static int Main() //???
	{
		int[] a = new int[16]; //??????k i j ???a[]
		int k;
		int i;
		int j;
		for (k = 0;;k++) //for??
		{
			int n = -1; //?????? n num ????
			int num = 0;
			for (i = 0;i < 16;i++) //for?? ???a??
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n++; //????? n?1
				if (a[i] == 0) //??????????0
				{
					break; //?????
				}
			}
			if (a[0] == -1) //??????????-1 ?????
			{
				break;
			}
			for (i = 0;i < n;i++) //for??
			{
				for (j = i + 1;j < n;j++) //for??
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i]) //???????? ??2???
					{
						num++; //num??
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0; //??
	} //??
}

