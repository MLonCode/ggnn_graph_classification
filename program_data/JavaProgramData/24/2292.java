import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**********************************
	/* ?  ?: ??????
	/* ?  ?: ???  1200012861
	/* ?  ?: 2012?12?24?
	**********************************/


	public static int Main()
	{
		String str = new String(new char[2000]);
		int maxLen = 0;
		int minLen = 100;
		int tempLen = 0;
		int i;
		int len;
		int minStart;
		int maxStart;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0; i <= len; i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			{
				tempLen++; //??????????????????+1
			}
			else //??????????
			{
				if (tempLen < minLen) //???????????????????
				{
					minLen = tempLen; //????
					minStart = i - minLen; //??????????????
				}
				if (tempLen > maxLen) //???????????????????
				{
					maxLen = tempLen; //????
					maxStart = i - maxLen; //??????????????
				}
				tempLen = 0;
			}
		}
		for (i = maxStart; i < maxStart + maxLen; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		for (i = minStart; i < minStart + minLen; i++)
		{
			System.out.print(str.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}
