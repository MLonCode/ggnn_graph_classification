import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************************************************************
	//*?????????????.cpp                                  *
	//*??????                                                    *
	//*?????2010?11?19?                                        *
	//*??????????????????                            *
	//******************************************************************
	public static int Main() //???
	{ //?????
		String word = new String(new char[100]); //?????
		int n = 0; //??????
		int i = 0;
		word = new Scanner(System.in).nextLine(); //?????
		n = word.length(); //???????
		for (i = 0;i < n;i++) //for??
		{ //????
			if (word.charAt(i) == word.charAt(i - 1) && word.charAt(i - 1) == ' ') //?????????
			{
				continue;
			}
			if (word.charAt(i) == '\0') //??
			{
				break;
			}
			System.out.print(word.charAt(i));
		} //????
		return 0;
	} //?????
}
