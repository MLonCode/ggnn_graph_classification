package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
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
		if ((((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(e / 360 * PI) * Math.cos(e / 360 * PI)) >= 0)
		{
		S = Math.sqrt(((a + b + c + d) / 2 - a) * ((a + b + c + d) / 2 - b) * ((a + b + c + d) / 2 - c) * ((a + b + c + d) / 2 - d) - a * b * c * d * Math.cos(e / 360 * PI) * Math.cos(e / 360 * PI));
		System.out.printf("%.4f",S);
		}
		else
		{
			System.out.print("Invalid input");
		}


		return 0;

	}


}

