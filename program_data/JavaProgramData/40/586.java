package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	double a;
	double b;
	double c;
	double d;
	double de;
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
		de = Double.parseDouble(tempVar5);
	}

	double aa;
	aa = (de / 2) * PI / 180;

	double S;
	double s;


	s = (a + b + c + d) / 2;

	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(aa) * Math.cos(aa));


	if ((s - a) * (s - b) * (s - c) * (s - d) >= 0)
	{
	System.out.printf("%.4f\n",S);
	}
	else
	{
	System.out.print("Invalid input");
	}

		return 0;
	}


}

