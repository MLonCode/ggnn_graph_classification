package <missing>;

public class GlobalMembers
{
	//
	//	?????	??2?N??
	//	?????	??2?N????
	//	?????	?  ? ? ? ?? 1000012733 ?
	//	?????	2010 ? 12 ? 18 ?
	//
	public static int Main()
	{
		int n; /*??????????????n??2?????????2??????i?j?k?l????????len??
		int i;
		int j;
		int k;
		int len;
		int temp;
		int l;
												?????result????temp??????????????2?????????????????*/
		String result = new String(new char[1000]); //???????result????2???????
		int[] t = new int[1000]; //??????t?????????2?????????????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0, 1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(t, 0, (Integer.SIZE / Byte.SIZE)); //?????result?t??????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		result = tangible.StringFunctions.changeCharacter(result, 0, '2'); //????result?????2
		for (i = 1; i < n; i++) //??2?n?????? n - 1 ? ?????? n = 0 ? n = 1 ??????? ?
		{
			len = result.length(); //???????result???
			k = 0; //k???0
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(t, 0, (Integer.SIZE / Byte.SIZE)); //?t????????
			for (j = len - 1; j >= 0; j--) //?????result??????????????
			{
				temp = result.charAt(j) - '0'; //??temp????????result?????????
				t[k] += temp * 2; //??????????temp??2
				if (t[k] >= 10)
				{
					t[k + 1] += 1;
					t[k] = t[k] - 10;
				} //????????????????10???????
				k++; //?????k??????1
			}
			if (t[k] == 0) //???????????????????k??1?????????????
			{
				k = k - 1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(result, 0, 1000); //??result???????result??????
			for (l = 0; l <= k; l++)
			{
				result = tangible.StringFunctions.changeCharacter(result, k - l, '0' + t[l]); //??????????????result???
			}
		}
		if (n == 1)
		{
			System.out.print(2);
			System.out.print("\n");
		}
		else if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			System.out.print(result);
			System.out.print("\n");
		}
		return 0;
	}
}

