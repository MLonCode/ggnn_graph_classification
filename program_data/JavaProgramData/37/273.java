package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[100000]); //sentence ?????
		int n; //n ?????i ?????len ??????character ????????
		int i;
		int len;
		int[] character = new int[26];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			for (i = 0; i <= 25; i++)
			{
				character[i] = 0; //???????????
			}
			sentence = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = sentence.length();
			for (i = 0; i <= len - 1; i++) //????????????????????
			{
				character[(int)(sentence.charAt(i) - 'a')]++;
			}
			for (i = 0; i <= len - 1; i++) //???????????????????
			{
				if (character[(int)(sentence.charAt(i) - 'a')] == 1)
				{
					System.out.print(sentence.charAt(i));
					System.out.print("\n");
					break; //?????????????????????
				}
			}
			if (i == len) //??????????? i ????????? len???�no�
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

