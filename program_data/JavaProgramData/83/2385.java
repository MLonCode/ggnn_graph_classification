package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int i;
		int[] a = new int[10];
		int[] b = new int[10];
		float[] c = new float[10];
		float sum;
		float q;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] >= 90)
			{
				c[i] = 4.0F;
			}
			else if (b[i] >= 85)
			{
				c[i] = 3.7F;
			}
			else if (b[i] >= 82)
			{
				c[i] = 3.3F;
			}
			else if (b[i] >= 78)
			{
				c[i] = 3.0F;
			}
			else if (b[i] >= 75)
			{
				c[i] = 2.7F;
			}
			else if (b[i] >= 72)
			{
				c[i] = 2.3F;
			}
			else if (b[i] >= 68)
			{
				c[i] = 2.0F;
			}
			else if (b[i] >= 64)
			{
				c[i] = 1.5F;
			}
			else if (b[i] >= 60)
			{
				c[i] = 1.0F;
			}
			else
			{
				c[i] = 0F;
			}
		}
		sum = 0F;
		s = 0;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i] * c[i];
		}
		for (i = 0;i < n;i++)
		{
			s = s + a[i];
		}
		q = sum / s;
		System.out.printf("%.2lf",q);
	}












}

