package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		double a;
		double b;
		double c;
		double A;
		double B;
		double x1;
		double x2;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if ((b * b - 4 * a * c) == 0)
			{
				x = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x);
			}
			if ((b * b - 4 * a * c) < 0)
			{
				if (b == 0)
				{
					A = 0.00000;
					B = Math.sqrt(4 * a * c - (b * b)) / (2 * a);
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",A,B,A,B);
				}
					else
					{
					A = -b / (2 * a);
					B = Math.sqrt(4 * a * c - (b * b)) / (2 * a);
					  System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",A,B,A,B);
					}
			}
		}
		return 0;
	}



}

