package <missing>;

public class GlobalMembers
{
	//????????


	public static int Main()
	{
		int n; //????  ???????  ???????  ????
		int[] a = new int[20000];
		int t = 1;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i < n;i++) //??n???
		{
			temp = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < t;j++) //??????????? ???? ?????? ??????
			{
				if (temp == a[j])
				{
					break;
				}
				if (j == t - 1) //?????  ???????? ??????????????????????
				{
					a[t] = temp;
					t += 1;
				}
			}
		}
		for (int i = 0;i < t - 1;i++) //?????
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[t - 1]);
		System.out.print("\n");
		return 0;
	}
}

