package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
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
		double e;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Double.parseDouble(tempVar5);
		}
		double area;
		double s;
		s = (a + b + c + d) / 2;
		area = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(PI * e / 180 / 2) * Math.cos(PI * e / 180 / 2);
		if (area < 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4lf", Math.sqrt(area));
		}
		return 0;
	}

}

