package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double S;
		double s;
		double a;
		double b;
		double c;
		double d;
		double m;
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
			m = Double.parseDouble(tempVar5);
		}
		s = (double)1 / 2 * (a + b + c + d);
		S = (double)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((m / 360) * 3.1415926) * Math.cos((m / 360) * 3.1415926));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((m / 360) * 3.1415926) * Math.cos((m / 360) * 3.1415926) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",S);
		}
	}

}

