package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		int[] b = new int[102];
		int[] c = new int[102];
		int[] d = new int[102];
		int e;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		e = (int)a.length();
		for (i = 0;i < e;i++)
		{
			b[i] = a.charAt(i) - '0';
		}
		if (e == 2 && (b[0] == 1 && b[1] < 3))
		{
			System.out.printf("0\n%d",10 * b[0] + b[1]);
		}
		else if (e == 1)
		{
			System.out.printf("0\n%d",b[0]);
		}
		else
		{
		c[0] = b[0] * 10 + b[1];
		for (j = 1;j < e;j++)
		{
			c[j] = b[j + 1];
		}
		d[0] = c[0] / 13;
		c[0] = c[0] % 13;
		for (j = 0;j < e-1;j++)
		{
			d[j + 1] = (10 * c[j] + c[j + 1]) / 13;
			c[j + 1] = (10 * c[j] + c[j + 1]) % 13;
		}
		if (d[0] == 0)
		{
			for (j = 1;j < e-1;j++)
			{
				System.out.printf("%d",d[j]);
			}
		}
		else
		{
			for (j = 0;j < e-1;j++)
			{
				System.out.printf("%d",d[j]);
			}
		}
		System.out.print("\n");
		System.out.printf("%d",c[e-2]);
		}
		return 0;
	}
}
