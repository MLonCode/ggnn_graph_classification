package <missing>;

public class GlobalMembers
{
	/*??
	???????????????????????????????????????n????????????????m????????m????????m??(m<n)?
	
	??????????m???????n-m??????????????????????
	
	????????????????????????????????????????????
	
	??????????????????????????????
	
	????
	????????????????n(n<=100)??????m??????n?????????????????????
	
	????
	???????????????????????????????????????
	
	????
	11 4
	15 3 76 67 84 87 13 67 45 34 45
	
	????
	67 45 34 45 15 3 76 67 84 87 13
	
	*/
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] ain = new int[234];
		m++;
		int[] p = ain;
		int[] q = ain;
		for (int i = 1;i <= n;i++,p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		q = p;
		for (int i = 1; i <= m; ++i)
		{
			--p;
		}
		for (int i = 1; i <= m; ++i)
		{
			q[0]++=p[0]++;
		}
		q = p;
		for (int i = 1; i <= m; ++i)
		{
			--p;
		}
		for (int i = 1; i <= n - m; ++i)
		{
			*--q = --p;
		}
		q = ain[n];
		for (int i = 1; i <= m; ++i)
		{
			p[0]++=q[0]++;
		}
		System.out.print(ain[1]);
		for (int i = 2; i <= n; ++i)
		{
			System.out.print(' ');
			System.out.print(ain[i]);
		}
		return 0;
	}

}

