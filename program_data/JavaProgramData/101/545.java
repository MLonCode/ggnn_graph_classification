package <missing>;

public class GlobalMembers
{
	//*************************************************
	//*???????                              ****
	//*??????   1100013009                   ****
	//*???2011.10.15                            ****
	//*?????????????????          ****
	//*************************************************
	public static int Main()
	{
		int a; // ?????????????????????max1?max2?max
		int b;
		int c;
		for (a = 1; a <= 3; a++) // ????a?1??3
		{
			for (b = 1; b <= 3; b++) // ????b?1??3
			{
				for (c = 1;c <= 3; c++) // ????c?1??3
				{
					 if (a + (b > a) + (c == a) == 3 && b + (a > b) + (a > c) == 3 && c + (c > b) + (b > a) == 3)
					 {
													// ???????a, b, c
						 int k; // ??????k, i, j, ?????min???a, b, c,????????n[3]
						 int min = 10;
						 int[] n = new int[3];
						 int i;
						 int j;
						 String m = new String(new char[3]); // ????A, B, C???m[3]
						 m = tangible.StringFunctions.changeCharacter(m, 0, 'A'); // ????????????
						 m = tangible.StringFunctions.changeCharacter(m, 1, 'B');
						 m = tangible.StringFunctions.changeCharacter(m, 2, 'C');
						 n[0] = a;
						 n[1] = b;
						 n[2] = c;
						 for (k = 0; k < 3; k++) // ????
						 {
							 for (i = 0; i < 3; i++) // ????????????????
							 {
								 if (min > n[i])
								 {
									 min = n[i];
									 j = i; // ?j??i???????????
								 }
							 }
								 System.out.print((char)(m.charAt(j)));
								 n[j] = 10; // ????????0???????????????
								 min = 10; // ?????????????????????
						 }
					 }
				}
			}
		}
					 return 0;
	}

}

