package <missing>;

public class GlobalMembers
{
	/*
	@file 1000012837_6.cpp
	@author ???
	@date 2010-11-26
	@description ??
	*/
	public static int Main()
	{
		int n;
		int m;
		int i;
		int count;
		int count0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--) //???????????
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count0 = 60; //???60?
			for (i = 1; i <= m; i++)
			{
				count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				//????????????????????????????-3????????????????????
				if (count < count0 - 3)
				{
					count0 -= 3;
				}
				//????????????????????????????-3????????????????????????????????count??????
				else if (count < count0 && count >= count0 - 3)
				{
					count0 = count;
				}
				//?????????????????????????????????count0
			}
			System.out.print(count0);
			System.out.print("\n");
		}
		return 0;
	}
}

