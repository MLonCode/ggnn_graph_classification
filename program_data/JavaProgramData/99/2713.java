package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] year = new int[sum];
		double a1;
		double b1;
		double c1;
		double d1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (year[i] < 19)
			{
				a++;
			}
			else if (year[i] < 36)
			{
				b++;
			}
			else if (year[i] < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
			a1 = (double)a / n * 100;
			b1 = (double)b / n * 100;
			c1 = (double)c / n * 100;
			d1 = (double)d / n * 100;
			System.out.printf("1-18: %.2lf%%\n",a1);
			System.out.printf("19-35: %.2lf%%\n",b1);
			System.out.printf("36-60: %.2lf%%\n",c1);
			System.out.printf("60??: %.2lf%%\n",d1);
			return 0;
	}

}

