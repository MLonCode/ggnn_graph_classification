package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n = 0; //????????????????
		int sum = 0; //???????????????????????????
		int num = 0;
		double x = 0; //??????????????????????????????????
		double y = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = (double)num / sum; //????????????
		for (int i = 0;i < n - 1;i++) //?????????????????????????????
		{
			sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = (double)num / sum;
			if ((y - x) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((x - y) > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	} //?????
}

