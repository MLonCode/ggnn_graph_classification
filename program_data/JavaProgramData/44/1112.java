package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int j;
		int temp;
		int flag;
		int i;
		int re_n;
		int[] num = new int[11];
		flag = 0;
		i = 0;
		while ((n >= 10) || (n % 10 != 0))
		{
			temp = n % 10;
			n = n / 10;
			if ((flag == 0) && (temp != 0) || (flag == 1))
			{
				num[i++] = temp;
				flag = 1;
			}
		}

		re_n = 0;
		for (j = 0;j <= i - 1;j++)
		{
			re_n = re_n * 10 + num[j];
		}
		return (re_n);
	}
	public static void Main()
	{
		int flag;
		int n;
		flag = 0;
		while (scanf("%d", n) == 1)
		{
			if (n < 0)
			{
				n = n * (-1);
				System.out.print("-");
			}
			System.out.printf("%d\n",reverse(n));
		}
	}

}
