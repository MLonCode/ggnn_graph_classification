package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[] a = new int[20000];
		 int i;
		 int j;
		 int m = 0;
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
							   a[i] = Integer.parseInt(tempVar2);
						   }
		 }
						   for (i = 0;i < n;i++)
						   {
											m = 0;
							   for (j = 0;j < i;j++)
							   {
												if (a[j] == a[i])
												{
												m = 1;
												}
							   }
												if (m == 0 && i == 0)
												{
												System.out.printf("%d",a[i]);
												}
												if (m == 0 && i > 0)
												{
												System.out.printf(" %d",a[i]);
												}
						   }

				return 0;
	}

}

