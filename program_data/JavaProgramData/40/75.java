package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		 double m;
		 double n;
		 double e;
		 double s;

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
		 e = (a + b + c + d) / 2;
		 n = 3.1415926 * m / 360;
		 if ((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * Math.pow(Math.cos(n),2) < 0)
		 {
			 System.out.print("Invalid input");
		 }
		 else
		 {
		 s = Math.sqrt((e - a) * (e - b) * (e - c) * (e - d) - a * b * c * d * Math.pow(Math.cos(n),2));

		 System.out.printf("%.4f",s);
		 }




	}


}

