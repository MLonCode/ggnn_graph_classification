package <missing>;

public class GlobalMembers
{
	/*???2011?11?28?
	 *??????
	 *????division.cpp
	 *????? - 1090 ????
	 */


	public static int Main()
	{
		int n = 0; //???????????n?????plate????apple
		int integer = 0;
		int division = new int(int, int); //????putapple??????????plate?????
														//apple???????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			integer = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(division(integer, integer));
			System.out.print("\n");
		}
		return 0;
	}


	public static int division(int integer, int limit)
	{
		if (limit <= 1)
		{
			return 0;
		}
		switch (integer)
		{
		case 1:
			return 1;
			break;
		default:
		{
			int sum = 0;
			for (int a = 1; a <= integer; a++)
			{
				if (integer % a != 0)
				{
					continue;
				}
				else if (integer / a > limit)
				{
					continue;
				}
				else
				{
					sum += division(a, integer / a);
				}
			}
			return sum;
		}
		break;
		}
	}

}

