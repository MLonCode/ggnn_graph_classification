package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[1000]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String end = new String(new char[2000]);
		int i;
		int j;
		int lensen;
		int lena;
		int lenb;
		sen = tangible.StringFunctions.changeCharacter(sen, 0, ' ');
		a = tangible.StringFunctions.changeCharacter(a, 0, ' ');
		b = tangible.StringFunctions.changeCharacter(b, 0, ' ');
		sen = tangible.StringFunctions.changeCharacter(sen, 1, new Scanner(System.in).nextLine());
		a = tangible.StringFunctions.changeCharacter(a, 1, ConsoleInput.readToWhiteSpace(true));
		b = tangible.StringFunctions.changeCharacter(b, 1, ConsoleInput.readToWhiteSpace(true));

		lensen = sen.length() + 1;
		lena = a.length() + 1;
		lenb = b.length() + 1;

		sen = tangible.StringFunctions.changeCharacter(sen, lensen - 1, a[lena - 1] = b[lenb - 1] = ' ');
		sen = tangible.StringFunctions.changeCharacter(sen, lensen, a[lena] = b[lenb] = '\0');


		for (i = 0,j = 0;i < lensen;++i,++j)
		{
			if (strncmp(sen.Substring(i),a,lena) == 0)
			{
				end.Substring(j) = b;
				i = i + lena - 1;
				j = j + lenb - 1;
			}
			else
			{
				end = tangible.StringFunctions.changeCharacter(end, j, sen.charAt(i));
			}
		}

		end = end.substring(0, j - 1);
		System.out.print(end.charAt(1));
		System.out.print("\n");
		return 0;
	}

}

