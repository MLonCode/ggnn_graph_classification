package <missing>;

public class GlobalMembers
{
	public static int f(int m, int min)
											??????????????*/
	{
		int i;
		int sum = 0;
		if (m == min || m == 1) //???????????????????1???1?
		{
			return 1;
		}
		else if (m < min) //????????????????????
		{
			return 0;
		}
		else if (m > min) //??????????????????????????????????
		{
			for (i = min;i <= m;i++)
			{
				if (m % i == 0)
				{
					sum += f(m / i, i);
				}
			}
			return sum;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] sum = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = f(a[i], 2); //??????????????
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

