package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int n;
	   int i;
	   int t;
	   int[] a = new int[200];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 1;i <= n;i++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
	   }
	   for (i = n + 1;i <= n + n;i++)
	   {
	   a[i] = a[i - n];
	   }
	   for (i = n - m + 1;i <= (n + n - m - 1);i++)
	   {
	   System.out.printf("%d ",a[i]);
	   }
	   System.out.printf("%d",a[n + n - m]);
	}


}

