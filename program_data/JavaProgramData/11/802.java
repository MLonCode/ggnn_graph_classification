package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
	 int z;
	 if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0))
	 {
		 z = 1;
	 }
	 else
	 {
		 z = 0;
	 }
	 return z;
	}
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
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
	 int z;
	 int i;
	 int sum = 0;
	 z = f(year);
	 int[] a = new int[12];
	 a[0] = 31;
	 a[2] = 31;
	 a[3] = 30;
	 a[4] = 31;
	 a[5] = 30;
	 a[6] = 31;
	 a[7] = 31;
	 a[8] = 30;
	 a[9] = 31;
	 a[10] = 30;
	 a[11] = 31;
	 if (z == 1)
	 {
		 a[1] = 29;
	 }
	 else
	 {
		 a[1] = 28;
	 }
	 for (i = 0;i < month - 1;i++)
	 {
	 sum = sum + a[i];
	 }
	 sum = sum + day;
	 System.out.printf("%d",sum);
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

