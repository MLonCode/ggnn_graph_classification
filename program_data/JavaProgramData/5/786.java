package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		int l = a.length();
		int k = 0;
		for (int i = 0;i < l;i++)
		{
			if ((a.charAt(i) == 'A' || a.charAt(i) == 'G' || a.charAt(i) == 'C' || a.charAt(i) == 'T') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G'))
			{
				if (a.charAt(i) == b.charAt(i))
				{
				   k++;
				}
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		double j;
		j = 1.0 * k / l;
		if (j > m)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

