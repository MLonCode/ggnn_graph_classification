package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double t1;
		double t2;
	  int i;
	  int j;
	  int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	  for (i = 1;i < n + 1;i++)
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

	   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
	   if (b * b - 4 * a * c < 0)
	   {
		   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a) + 0,Math.sqrt(-(b * b - 4 * a * c)) / (2 * a),-b / (2 * a) + 0,Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
	   }
	   else
	   {
	   if (x1 == x2)
	   {
		   System.out.printf("x1=x2=%.5f\n",x1);
	   }
	   else
	   {
		 System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
	   }
	   }
	  }

	   return 0;
	}

}

