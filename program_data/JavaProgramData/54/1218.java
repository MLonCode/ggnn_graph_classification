package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *?????????????
	 *  Created on: 2012-11-16
	 *      Author: ???
	 */



	public static int Main()
	{
		int n; //n ????? ?k?????,i??????????????
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n]; //????apple??????????????
		apple[n - 1] = k;
		do
		{
			apple[n - 1] = apple[n - 1] + n; //????????????
			for (i = n - 2;i >= 0;)
			{
				if (apple[i + 1] % (n - 1) == 0) //?????????????(n-1)??
				{
					apple[i] = apple[i + 1] / (n - 1) * n + k; //???????????
					i--;
				}
				else
				{
				  break; //?????
				}
			}
		}while (i >= 0); //for ???????????
		System.out.print(apple[0]);
		System.out.print("\n");
		return 0;
	}
}

