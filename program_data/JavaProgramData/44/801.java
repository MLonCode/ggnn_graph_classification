package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int i = 1;i <= 6;i++)
		{
			char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char l;
			for (int i = 1;i <= 50;i++)
			{
				a[i] = System.in.read();
				if (a[i] == '-')
				{
					a[0] = '-';
					i--;
				}
				if (a[i] == '\n')
				{
					l = i - 1;
					break;
				}
			}
			if (a[0] == '-')
			{
				System.out.print(a[0]);
			}
			for (int i = l;i >= 1;i--)
			{
				if (a[i] != '0')
				{
					l = i;
					break;
				}
			}
			for (int i = l;i >= 1;i--)
			{
				System.out.print(a[i]);
			}
			if (l == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		return 0;
	}
}
