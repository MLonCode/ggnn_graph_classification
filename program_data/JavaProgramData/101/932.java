package <missing>;

public class GlobalMembers
{
	/*???3??????????????
	 * A??B??????C???????;B??A??????A??C???;C????B????B?A????
	 * ????????????????????????????????3??????
	 *????: 2012-10-17
	 *??: ??
	 */

	public static int Main()
	{
		String rank = new String(new char[3]); //??????
		for (int A = 0; A < 3; A++) //?????????0?1?2?????????????
		{
			for (int B = 0; B < 3; B++)
			{
				if (A != B)
				{
					int C = 3 - A - B; //???????
					if (((B > A) + (A == C) + A == 2) && ((A > B) + (A > C) + B == 2) && ((C > B) + (B > A) + C == 2)) //?????????
					{
						rank = tangible.StringFunctions.changeCharacter(rank, A, 'A'); //?????
						rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
						rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
						System.out.print(rank.charAt(0));
						System.out.print(rank.charAt(1));
						System.out.print(rank.charAt(2));
					}
				}
			}
		}
		return 0;
	}

}

