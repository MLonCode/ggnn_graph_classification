package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0F)
			{
				double delta;
				double m;
				double n;
				double x1;
				double x2;
				delta = b[i] * b[i] - 4 * a[i] * c[i];
				if (b[i] == 0F)
				{
					m = 0;
				}
				else
				{
					m = -(b[i] / (2 * a[i]));
				}
				n = Math.sqrt(Math.abs(delta)) / (2 * a[i]);
				if (delta == 0)
				{
					System.out.printf("x1=x2=%.5f\n",m);
				}
				else if (delta > 0)
				{
					x1 = m + n;
					x2 = m - n;
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
				else
				{
					if (b[i] == 0F)
					{
					System.out.printf("x1=-%.5f+%.5fi;",m,n);
					System.out.printf("x2=-%.5f-%.5fi\n",m,n);
					}
					else
					{
					System.out.printf("x1=%.5f+%.5fi;",m,n);
					System.out.printf("x2=%.5f-%.5fi\n",m,n);
					}
				}
			}
		}
	}


}

