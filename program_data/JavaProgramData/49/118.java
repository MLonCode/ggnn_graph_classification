package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]); // ????????
		int i; // ??????i, j, ii, ?????q,?????len
		int j;
		int ii;
		int jj;
		int len;
		int q;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length(); // ????????
		for (q = 2; q <= len; q++) // ???????????????
		{
			for (i = 0; str.charAt(i) != 0; i++) // ???????
			{
				ii = i; // ??????????

				// ????????????????????????
				while ((str.charAt(ii) == str.charAt(i + q + i - 1 - ii)) && (ii < i + q / 2))
				{
					ii++;
				}
				if (ii == i + q / 2) // ???????????????????
				{
					for (j = i; j <= i + q - 1; j++) // ??????
					{
						System.out.print(str.charAt(j));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

