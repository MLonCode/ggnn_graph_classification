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
	 double i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead("\n");
	 if (tempVar2 != null)
	 {
		 b = Double.parseDouble(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead("\n");
	 if (tempVar3 != null)
	 {
		 c = Double.parseDouble(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead("\n");
	 if (tempVar4 != null)
	 {
		 d = Double.parseDouble(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead("\n");
	 if (tempVar5 != null)
	 {
		 e = Double.parseDouble(tempVar5);
	 }
	 e = e / 180 * 3.1415926;
	 i = (a + b + c + d) / 2;
	 if ((i - a) * (i - b) * (i - c) * (i - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2) >= 0.getValue() != 0)
	 {
	 System.out.printf("%.4lf",Math.sqrt((i - a) * (i - b) * (i - c) * (i - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2)));
	 }
	 else
	 {
		 System.out.print("Invalid input");
	 }
	 return 0;

	}
}

