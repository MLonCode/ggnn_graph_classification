package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //????a,b,c,????A,B,C???(0-2)
		int b;
		int c;
		String man = new String(new char[3]); //?????man,???????????
		for (a = 0;a < 3;a++) //??,A,B,C???
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					int a1 = (b > a) + (c == a); //A??B??????C???????
					int b1 = (a > b) + (a > c); //B??A??????A??C???
					int c1 = (c > b) + (b > a); //C????B????B?A???
					if (((a + a1) == 2) && ((b + b1) == 2) && ((c + c1) == 2)) //??????????????????,??????(0-2)???????????2
					{
						man = tangible.StringFunctions.changeCharacter(man, a, 'A'); //?????????
						man = tangible.StringFunctions.changeCharacter(man, b, 'B');
						man = tangible.StringFunctions.changeCharacter(man, c, 'C');
						for (int i = 0;i <= 2;i++) //???????????
						{
							System.out.print(man.charAt(i));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

