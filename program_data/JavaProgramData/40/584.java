package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double t;
		double s;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			t = Double.parseDouble(tempVar5);
		}
		p = (0.5 * (a + b + c + d) - a) * (0.5 * (a + b + c + d) - b) * (0.5 * (a + b + c + d) - c) * (0.5 * (a + b + c + d) - d) - a * b * c * d * Math.cos(t / 360 * 3.1415926) * Math.cos(t / 360 * 3.1415926);
		if (p >= 0)
		{
		s = Math.sqrt(p);
		System.out.printf("%.4lf\n",s);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
	}
}

