package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		p = a;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < i - t;j++)
			{
				if (*p == a[j])
				{
					break;
				}
			}
				if (j != i - t)
				{
					t++;
					continue;
				}
			p++;
		}
		p = a;
		for (i = 0;i < n - t;i++)
		{
			System.out.printf("%d",*p++);
			if (i != n - t - 1)
			{
				System.out.print(",");
			}
		}
	}
}

