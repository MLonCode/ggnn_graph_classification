package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int year;
		  int month;
		  int day;
		  int D = 0;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  year = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  month = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  day = Integer.parseInt(tempVar3);
		  }
		  if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		  {
				   int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				   for (i = 0;i < month - 1;i++)
				   {
				   D = D + a[i];
				   }
				   D = D + day;
		  }
		  else
		  {
				   int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				   for (i = 0;i < month - 1;i++)
				   {
				   D = D + a[i];
				   }
				   D = D + day;
		  }
		  System.out.printf("%d",D);
		  System.in.read();
		  System.in.read();
		  return 0;
	}
}

