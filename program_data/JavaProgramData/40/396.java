package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double surface = new double(double a,double b,double c,double d,double e,double s);
		double a;
		double b;
		double c;
		double d;
		double e;
		double s;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		S = surface(a, b, c, d, e, s);

	}
	public static double surface(double a,double b,double c,double d,double e,double s)
	{
		double S;
		s = 0.5 * (a + b + c + d);
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * 3.1415926 / 360) * Math.cos(e * 3.1415926 / 360));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e * 3.1415926 / 360) * Math.cos(e * 3.1415926 / 360) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4lf",S);
		}
		return S;
	}

}

