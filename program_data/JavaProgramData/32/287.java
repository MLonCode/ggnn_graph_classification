package <missing>;

public class GlobalMembers
{
	public static void minus(String a, String b, String result)
	{
		int la;
		int lb;
		int lresult;
		int flag = 0;
		int t = 0;
		int s;
		int c = 0;
		int i;
		char temp1;
		la = a.length() - 1;
		lb = b.length() - 1;
		while (la >= 0)
		{
			if (lb < 0)
			{
				s = a[la--] - 48;
			}
			else
			{
				s = a[la--] - b[lb--];
			}
			result[t++] = s - c + 48;
			if (result[t - 1].compareTo(48) < 0)
			{
				result[t - 1] += 10;
				c = 1;
			}
			else
			{
				c = 0;
			}
		}
		while (result[t].equals(0))
		{
			t--;
		}
		while (result[t].equals('0'))
		{
			result[t] = null;
			t--;
		}
		lresult = t;
		for (i = 0;i <= lresult / 2;i++)
		{
			temp1 = result[i];
			result[i] = result[lresult - i];
			result[lresult - i] = temp1;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[max][max];
		char[][] b = new char[max][max];
		char[][] result = new char[max][max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			minus(a[i], b[i], result[i]);
			System.out.printf("%s\n",result[i]);
		}
	}
}

