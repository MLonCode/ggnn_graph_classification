import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j;
		int k;
		int[] b = new int[101];
		int[] c = new int[101];
		int lenA;
		int yushu;
		int pro;
		a = new Scanner(System.in).nextLine();
		lenA = a.length();
		for (i = 0, j = 1; i <= lenA - 1; i++)
		{
			b[j++] = a.charAt(j - 1) - '0';
		}
		if ((lenA == 2 && b[1] * 10 + b[2] <= 12) || lenA == 1)
		{
			if (lenA == 1)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(b[1]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print((b[1] * 10 + b[2]) % 13);
				System.out.print("\n");
			}
		}
		else
		{
			if (b[1] * 10 + b[2] >= 13)
			{
				yushu = (b[1] * 10 + b[2]) % 13;
				c[2] = (b[1] * 10 + b[2] - yushu) / 13;
				for (i = 3; i <= lenA; i++)
				{
					pro = yushu * 10 + b[i];
					yushu = pro % 13;
					c[i] = (pro - yushu) / 13;
				}
				for (k = 2; k <= lenA; k++)
				{
					System.out.print(c[k]);
				}
				System.out.print("\n");
			}
			else
			{
				yushu = (b[1] * 100 + b[2] * 10 + b[3]) % 13;
				c[3] = (b[1] * 100 + b[2] * 10 + b[3] - yushu) / 13;
				for (i = 4; i <= lenA; i++)
				{
					pro = yushu * 10 + b[i];
					yushu = pro % 13;
					c[i] = (pro - yushu) / 13;
				}
				for (k = 3; k <= lenA; k++)
				{
					System.out.print(c[k]);
				}
				System.out.print("\n");
			}
			System.out.print(yushu);
			System.out.print("\n");
		}
		return 0;
	}
}
