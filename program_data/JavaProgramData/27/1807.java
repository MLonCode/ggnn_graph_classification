package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		   double x1;
		   double x2;
		   double a;
		   double b;
		   double c;
		   int n;
		   int i;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   for (i = 0;i < n;i++)
		   {
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
					   if (b * b - 4 * a * c < 0)
					   {
						   if (b == 0)
						   {
							  x1 = (Math.sqrt(4 * a * c - b * b)) / (2 * a);

						  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b,x1,b,x1);
						   }
							else
							{
								System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),(Math.sqrt(4 * a * c - b * b)) / (2 * a),-b / (2 * a),(Math.sqrt(4 * a * c - b * b)) / (2 * a));
							}
					   }
					   else if (Math.sqrt(b * b - 4 * a * c) == 0)
					   {
						   System.out.printf("x1=x2=%.5f\n",(-b) / (2 * a));
					   }
					   else
					   {
						   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
					   System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
					   }

		   }
	 }
}

