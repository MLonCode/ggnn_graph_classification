package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);
	public static String b = new String(new char[1000]);
	public static int Main()
	{
		int len;
		int n = 0;
		int i;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ' && a.charAt(i - 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ' && a.charAt(i - 1) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
				j++;
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ' && a.charAt(i - 1) == ' ')
			{
			}
			else if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ' && a.charAt(i - 1) == ' ')
			{
			}
		}
		System.out.printf("%s",b);

	}

}

