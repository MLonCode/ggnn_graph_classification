package <missing>;

public class GlobalMembers
{
	//***************************
	//**???6.cpp
	//**??????
	//**???2013.10.23
	//**?????????
	//***************************
	//??????????????????????????????
	public static int Main()
	{
		// n????????a?????????????b?????????????j?k???
		int n;
		int high;
		int low;
		int[] a = new int[100];
		int[] b = new int[50];
		int j = 0;
		int k = 0;
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; i++)
		{
			high = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			a[i] = (high <= 140 && high >= 90 && low <= 90 && low >= 60);
			if (a[i] == 0) // ??????
			{
				j++; // b????????
				k = 0; // ??????0
			}
			else // ?????
			{
				k++; // ?????1
				b[j] = k;
				if (b[j] > max)
				{
					max = b[j];
				}
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

