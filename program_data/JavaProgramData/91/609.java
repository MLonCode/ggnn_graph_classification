import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	@file 1000012837_1.cpp
	@date 20101215
	@author ???
	@description ???????
	*/
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		char i;
		char l;
		str1 = new Scanner(System.in).nextLine(); //?????str1
		l = str1.length(); //l??????
		for (i = 0; i < l - 1; i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str1.charAt(i) + str1.charAt(i + 1)); //?????s??i????ASCII???i+1????ASCII?????i?????
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, l - 1, str1.charAt(0) + str1.charAt(l - 1)); //??????????????????s???????ASCII??s???????ASCII?
		str2 = str2.substring(0, l); //??????\0??
		System.out.print(str2);
		System.out.print("\n");
		return 0;
	}
}

