package <missing>;

public class GlobalMembers
{
	//**************************
	//*?????              *
	//*?????? 1200012775 *
	//*???2012/10/29        *
	//**************************
	public static int Main()
	{
		int[] a = new int[15]; //????????
		int t;
		int i;
		int j;
		int k;
		int m;
		int n;
		for (i = 1; ; i++) //????
		{
			for (j = 0; j <= 14; j++) //??????????0
			{
				a[j] = 0;
			}
			for (j = 0; ; j++)
			{
				t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (t == 0) //??????0
				{
					break; //????
				}
				else //??
				{
					a[j] = t; //?????
				}
			}
			m = 1; //??????
			if (a[0] != -1) //???????0
			{
				m = 0; //?????
			}
			for (j = 1; j < 15; j++)
			{
				if (a[j] != 0) //???????????
				{
					m = 0; //?????
				}
			}
			if (m == 1) //?????
			{
				System.out.print("0");
				System.out.print("\n");
				break; //??
			}
			n = 0; //??????0?
			for (j = 0; j <= 14; j++) //???????
			{
				for (k = j + 1; k <= 14; k++) //????????
				{
					if (a[j] != 0 && a[k] != 0 && (a[j] == 2 * a[k] || a[k] == 2 * a[j])) //???????0?????????2?
					{
						n = n + 1; //???1
					}
				}
			}
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}
}

