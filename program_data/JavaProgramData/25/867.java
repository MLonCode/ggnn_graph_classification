package <missing>;

public class GlobalMembers
{
	public static char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static void temp() //????a??
	{
		int yushu = 0;
		for (int j = 100;j > 0;j--)
		{
			char c = a[j] + a[j] - '0' + yushu;
			if (c <= '9')
			{
			a[j] = c;
			yushu = 0;
			}
			else
			{
				a[j] = c - 10;
				yushu = 1;
			}
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 110;i++)
		{
			a[i] = '0';
		}
		a[100] = '1';
		for (int i = 0;i < n;i++) //??n???
		{
			temp();
		}
		int x = 0;
		for (int i = 0;i < 110;i++) //?????
		{
			if (a[i] != '0')
			{
				x = i;
				break;
			}
		}
		for (int i = x;i < 101;i++) //??
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

