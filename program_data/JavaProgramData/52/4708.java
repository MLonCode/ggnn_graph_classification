package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int[] a = new int[100];
	int[] b = new int[100];
	int n;
	int m;
	int i;
	int k;
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
	for (i = 0;i < n;i++)
	{
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
	}
	for (i = 0;i < n - m;i++)
	{
	   b[i] = a[i];
	}
	  k = 0;
	for (i = n - m;i < n;i++,k++)
	{
	  a[k] = a[i];
	}
	  k = 0;
	for (i = m;i < n;i++,k++)
	{
	  a[i] = b[k];
	}
	  for (i = 0;i < n - 1;i++)
	  {
	   System.out.printf("%d ",a[i]);
	  }
	  System.out.printf("%d",a[n - 1]);
	   return 0;





	}
}

