import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int[] num = new int[100];
		int[] num1 = new int[100];
		int i;
		int r;
		int len;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0; i < len; i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		if (len == 1)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(num[0]);
			System.out.print("\n");
		}
		else
		{
			num1[0] = (num[0] * 10 + num[1]) / 13;
			r = (num[0] * 10 + num[1]) % 13;
			for (i = 2; i < len; i++)
			{
				num1[i - 1] = (r * 10 + num[i]) / 13;
				r = (r * 10 + num[i]) % 13;
			}
			int flag = 0;
			for (i = (num1[0] == 0); i < len - 1; i++)
			{
				System.out.print(num1[i]);
				flag = 1;
			}
			if (flag == 0)
			{
				System.out.print('0');
			}
			System.out.print("\n");
			System.out.print(r);
			System.out.print("\n");
		}

		return 0;
	}
}
