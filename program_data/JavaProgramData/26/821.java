package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[101]);
		char[] dy = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		zfc = new Scanner(System.in).nextLine();
		int l = zfc.length();
		int j = 0;
		int k;
		for (int i = 0;i < l;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				dy[j] = zfc.charAt(i);
				j++;
			}
			else if (zfc.charAt(i) == ' ')
			{
				if (zfc.charAt(i + 1) != ' ')
				{
					dy[j] = ' ';
					j++;
				}
			}
		}
		for (k = 0;k < j;k++)
		{
			System.out.printf("%c",dy[k]);
		}



		return 0;
	}

}
