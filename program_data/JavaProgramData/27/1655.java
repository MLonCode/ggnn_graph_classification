package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			double a;
			double b;
			double c;
			double x1;
			double x2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			double d = b * b - 4 * a * c;
			if (d > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			else if (d == 0)
			{
				x1 = -b / (2 * a);
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				if (b != 0)
				{
				x1 = -b / (2 * a);
				x2 = Math.sqrt(4 * a * c - b * b) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
				}
				else
				{
				x1 = b / (2 * a);
				x2 = Math.sqrt(4 * a * c - b * b) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x2,x1,x2);
				}
			}
		}


	}



}

