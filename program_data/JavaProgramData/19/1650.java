import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000062703.cpp
	 *
	 *  Created on: 2010-11-12
	 *      Author: Administrator
	 */
	public static int Main()
	{
		String a = new String(new char[101]); //?????
		String sub = new String(new char[101]);
		String c = new String(new char[101]);
		a = new Scanner(System.in).nextLine(); //????a
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la; //??????la,ls,i,j,flag
		int ls;
		int i;
		int j;
		int flag;
		la = a.length();
		ls = sub.length(); //????a?sub???
		for (i = 0;i <= la - ls;i++)
		{
			if (i != 0 && a.charAt(i - 1) != ' ')
			{ //??a[i]????????????????????????????????a[0]
				System.out.print(a.charAt(i));
				continue; //????????
			}
			flag = 1; //??flag???1
			for (j = 0;j < ls;j++)
			{
				if (a.charAt(j + i) != sub.charAt(j))
				{ //???????????????????????
					flag = 0; //??flag?0
					System.out.print(a.charAt(i));
					break; //??????
				}
			}
				if (flag != 0)
				{ //?flag?????1????????????
					System.out.print(c);
					i = i + ls - 1; //?????????????
				}
		}
		for (j = 0;j < ls;j++)
		{ //????????????????
			flag = 1;
			if (a.charAt(j + la - ls) != sub.charAt(j))
			{
				flag = 0;
				break;
			}
		}
		if (flag == 0 || a.charAt(la - ls - 1) != ' ')
		{ //??flag??0?????ls+1??????????????????sub???
			for (i = la - ls + 1;i < la;i++) //??a???ls-1???????????????a[la-ls])
			{
			System.out.print(a.charAt(i));
			}
		}
		return 0; //????
	}

}

