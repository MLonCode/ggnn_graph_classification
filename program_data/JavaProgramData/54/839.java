package <missing>;

public class GlobalMembers
{
	/*
	 * houzi.cpp
	 *
	 *  Created on: 2011-11-16
	 *      Author: ??
	 */
	public static int Main()
	{
		int n;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n + 1];
		apple[1] = n + k;
		while (true)
		{
		for (i = 2;i <= n;i++)
		{
			apple[i] = (apple[i - 1] - k) / n * (n - 1);
			if (apple[i] % n != k)
			{
				break;
			}
		}
		if (i == n + 1)
		{
			break;
		}
		else
		{
			apple[1] = apple[1] + n;
		}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(apple[i]);
			System.out.print("\n");
		   break;
		}
		return 0;
	}

}

