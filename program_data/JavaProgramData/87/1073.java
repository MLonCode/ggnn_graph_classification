package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h1;
		int m1;
		int s1;
		int h2;
		int m2;
		int s2;
		int t1;
		int t2;
		while (scanf("%d%d%d%d%d%d", h1, m1, s1, h2, m2, s2), h1 != 0 || h2 != 0)
		{
			t1 = h1 * 3600 + m1 * 60 + s1;
			t2 = (h2 + 12) * 3600 + m2 * 60 + s2;
			System.out.printf("%d\n",t2 - t1);
		}
	}
}
