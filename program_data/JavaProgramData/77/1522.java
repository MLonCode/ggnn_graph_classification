package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[110]);
	public static int len;
	public static int px(int xb, char b, char g)
	{
		int i;
		int k;
		for (i = xb; i <= len - 1; i++)
		{
			while (str.charAt(xb) == '*')
			{
				xb++;
			}
			if (str.charAt(xb) == b)
			{
				str = tangible.StringFunctions.changeCharacter(str, xb, '*');
				k = px(xb + 1, b, g);
				System.out.print(xb);
				System.out.print(" ");
				System.out.print(k);
				System.out.print("\n");
			}
			else
			{
				if (str.charAt(xb) == g)
				{
					str = tangible.StringFunctions.changeCharacter(str, xb, '*');
					return xb;
				}
			}
		}
	}
	// ???????????
	// ????????????
	// ?????????? ???????????????????????
	// ?????????????????????
	// ???????????
	// ???1?? ???2???
	// ???????? ?????0
	// ??????????
	// ?????????????????
	// ????????? ???????????????????????????????
	// ??????? ??????????? ????
	// ????? ??????????????
	// ???????????????????
	// ??????? ????? ???????????? ????
	public static int Main()
	{
		char boy;
		char girl;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		boy = str.charAt(0);
		girl = str.charAt(len - 1);
		px(0, boy, girl);
		return 0;
	}
}

