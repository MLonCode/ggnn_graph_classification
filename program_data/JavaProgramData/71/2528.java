package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 int y;
		 int m1;
		 int m2;
		 int a;
		 int[] pn = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 int[] rn = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1; i <= n; i++)
		 {
		a = 0;
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   y = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   m1 = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   m2 = Integer.parseInt(tempVar4);
			   }
			   if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			   {
					if (m1 < m2)
					{
						 for (j = m1; j <= (m2 - 1); j++)
						 {
							   a += rn[j];
						 }
					}
					else
					{
						 for (j = m2; j <= (m1 - 1); j++)
						 {
							   a += rn[j];
						 }
					}
					if (a % 7 == 0)
					{
						 System.out.print("YES\n");
					}
					else
					{
						 System.out.print("NO\n");
					}
			   }
			   else
			   {
					if (m1 < m2)
					{
						 for (j = m1; j <= (m2 - 1); j++)
						 {
							   a += pn[j];
						 }
					}
					else
					{
						 for (j = m2; j <= (m1 - 1); j++)
						 {
							   a += pn[j];
						 }
					}
					if (a % 7 == 0)
					{
						 System.out.print("YES\n");
					}
					else
					{
						 System.out.print("NO\n");
					}
			   }
			   a = 0;
		 }
		 return 0;
	}

}

