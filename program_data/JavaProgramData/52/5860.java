package <missing>;

public class GlobalMembers
{
	/******************************************
	?? ???1300017667
	?? 20131211
	?? ??????
	******************************************/
	public static int len; //????????????????
	public static int step;
	public static int[] num = new int[102]; //??????????
	public static void move(tangible.RefObject<Integer> p, int n)
	{
		if (n == 0) //??0????????????
		{
			return;
		}
		int temp = (p.argValue + len - 1); //???????????
		int i;
		for (i = len - 1; i >= 1; i--)
		{
			*(p.argValue + i) = *(p.argValue + i - 1); //???????????????????????????????
		}
		p.argValue = temp; //???????????
		move(p, n - 1); //????????????n - 1?????
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE)); //????
		len = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		step = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0; i <= len - 1; i++) //???????
		{
			num[i] = ConsoleInput.readToWhiteSpace(true);
		}
	tangible.RefObject<Integer> tempRef_num = new tangible.RefObject<Integer>(num);
		move(tempRef_num, step); //??
		num = tempRef_num.argValue;
		for (i = 0; i <= len - 1; i++) //?????????
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.print((num + i));
		}
		return 0;
	}
}

