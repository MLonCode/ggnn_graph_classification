import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2010-11-6
	 *      Author: X200
	 */
	public static int Main()
	{
		String str = new String(new char[10001]); //????str[]?
		String c1 = new String(new char[101]); //???????c1,c2?
		String c2 = new String(new char[101]);
		int i; //??????????????
		int j;
		int a;
		int b;
		int c;
		str = new Scanner(System.in).nextLine(); //?????????
		c1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = str.length(); //???????????
		b = c1.length();
		c = c2.length();
		for (i = 0;i < a;i++)
		{ //??????????
			if (((str.charAt(i - 1) == 32) && (str.charAt(i + b) == 32)) || ((i == 0) && (str.charAt(i + b) == 32)) || (str.charAt(i - 1) == 32) && (i + b == a))
			{
			if (str.charAt(i) == c1.charAt(0))
			{ //???????????????c1??????
				for (j = i;j <= i + b - 1;j++)
				{ //???????????c1???
					if (str.charAt(j) != c1.charAt(j - i)) //?????????
					{
						break;
					}
				}
				if (j == (i + b))
				{ //?????
					if (c > b)
					{ //??c2?c1??
						for (j = a - 1;j >= i + b;j--)
						{ //???????????????c-b??
							str = tangible.StringFunctions.changeCharacter(str, j + c - b, str.charAt(j));
						}
						for (j = i;j <= i + c - 1;j++)
						{ //??c1??c2.
							str = tangible.StringFunctions.changeCharacter(str, j, c2.charAt(j - i));
						}
						a = a + c - b; //???????????
						i = i + c - 1; //??????????????
					}
					else
					{ //?????????
						for (j = i + b;j <= a - 1;j++)
						{ //???????????????b-c??
							str = tangible.StringFunctions.changeCharacter(str, j + c - b, str.charAt(j));
						}
						for (j = i;j <= i + c - 1;j++)
						{ //??c1??c2?
							str = tangible.StringFunctions.changeCharacter(str, j, c2.charAt(j - i));
						}
						a = a + c - b; //???????????
						i = i + c; //??????????????
					}
				}
			}
			}
		}
		for (i = 0;i < a;i++)
		{ //?????????
			System.out.print(str.charAt(i));
		}
		return 0; //?????
	}

}

