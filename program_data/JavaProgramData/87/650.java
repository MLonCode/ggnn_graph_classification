package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		int[] f = new int[100];
		int[] sum = new int[100];
		int m;
		int n;
		for (i = 0;i <= 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f[i] = Integer.parseInt(tempVar6);
			}
			if (a[i] == 0)
			{
				break;
			}
		}
		j = i;
		for (i = 0;i < j;i++)
		{
			m = a[i] * 3600 + b[i] * 60 + c[i];
			n = (d[i] + 12) * 3600 + e[i] * 60 + f[i];
			sum[i] = n - m;
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

