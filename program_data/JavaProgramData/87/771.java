package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int t = 0;
		int i;
		int[] sum = new int[100];
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				e[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				f[i] = Integer.parseInt(tempVar6);
			}
			t++;
			if (a[i] == 0)
			{
				break;
			}
		}
		for (i = 0;i < t - 1;i++)
		{
			sum[i] = (d[i] - a[i] + 11) * 3600 + f[i] + e[i] * 60 + 60 - c[i] + (59 - b[i]) * 60;
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}

}

