package <missing>;

public class GlobalMembers
{
	/**
	 * @file   1000012834_002homework.cpp
	 * @author ???
	 * @date   2010-11-3
	 * @description 
	 *         ???????1134 ??  
	 */
	public static int Main()
	{ //?????
		int i; //???????????????????
		int j;
		int ii;
		int t;
		int flag;
		int[] a = new int[2000]; //????
		while (true) //?????-1????????
		{
			t = 0; //?????
			flag = 1;
			i = 1;
			while (flag == 1) //?????????0????
			{
				a[i++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i - 1] == 0) //????????????
				{
					flag = 0;
				}
				else
				{
					if (a[i - 1] == -1) //????-1??????????
					{
						return 0;
					}
				}
			}

	/*	while ((a[i] = cin.get()) != -1)
		{
			i ++;
			t = 0;
			cin.get();
			while ((a[i++] = cin.get()) != '0')
			{	a[i - 1] -= 48;
				cin.get();
			}
			*/

				i -= 1; //????i????????????0
				for (j = 1; j < i; j++) //??????????,????i++???????-1
				{
					if (a[j] % 2 == 0) //???????????
					{
						for (ii = 1; ii < i; ii++) //????????????????
						{

							//??????????????
							if (a[ii] * 2 == a[j])
							{
							t++; //???????????1
							}
						}
					}
				}
				System.out.print(t);
				System.out.print("\n");
			i = 0;
		}

		return 0;
	} //?????
}

