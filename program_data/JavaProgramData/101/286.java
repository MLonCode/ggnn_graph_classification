package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int[] statement = new int[4];
		String rank = new String(new char[4]);
		for (A = 1;A <= 3;A++)
		{
			for (B = 1;B <= 3;B++)
			{
				if (A == B)
				{
					continue;
				}
				C = 6 - A - B;
				statement[A] = ((B > A) + (C == A));
				statement[B] = ((A > B) + (A > C));
				statement[C] = ((C > B) + (B > A));
				rank = tangible.StringFunctions.changeCharacter(rank, A, 'A');
				rank = tangible.StringFunctions.changeCharacter(rank, B, 'B');
				rank = tangible.StringFunctions.changeCharacter(rank, C, 'C');
				if (statement[1] == 2 && statement[2] == 1 && statement[3] == 0)
				{
						System.out.print(rank.charAt(1));
						System.out.print(rank.charAt(2));
						System.out.print(rank.charAt(3));
						System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

