import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]); //??????
		str = new Scanner(System.in).nextLine(); // ?????
		int len; //??????
		len = str.length(); //???????
		for (int i = 0;i <= len;i++) //??????i
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') //???i????i+1??????????????
			{
				for (int j = i + 1;j < len;j++) //??????j,
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1)); //?i+2?????????
				}
				i = i - 1; //?i??
			}
		}
			System.out.print(str);
			System.out.print("\n");
			return 0;
	}

}

