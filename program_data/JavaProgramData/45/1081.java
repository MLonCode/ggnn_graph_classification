package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] zfc = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] word = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] temp = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int a = 0;
		int len1;
		int len2;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;i < 51;i++)
		{
			if (zfc[i] == ' ')
			{
				a = i;
				break;
			}
		}
		for (i = 0;i < a;i++)
		{
			s[i] = zfc[i];
		}
		len1 = zfc.length();
		for (i = 0;i <= len1 - a - 1;i++)
		{
			word[i] = zfc[i + a + 1];
		}
		len2 = word.length();
		for (i = 0;i < len2 - 1;i++)
		{
			for (j = 0;j < a;j++)
			{
				temp[j] = word[j + i];
			}
			if (strcmp(temp,s) == 0)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}


}
