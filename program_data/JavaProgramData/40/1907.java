package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


		double a;
		double b;
		double c;
		double d;
		double m;
		double S;
		double s;
		double n;
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

		s = (a + b + c + d) / 2;
		n = m * PI / 360;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(n)) * (Math.cos(n)));
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(n)) * (Math.cos(n)) >= 0.getValue() != 0)
		{

			System.out.printf("%.4f",S);
		}

			if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(n)) * (Math.cos(n)) < 0.getValue() != 0)
			{
				System.out.print("Invalid input");
			}
			return 0;
	}
}

