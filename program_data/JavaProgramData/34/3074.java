package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Integer.parseInt(tempVar);
	 }
	 if (a == 1)
	 {
	  System.out.print("End");
	 }
	 else
	 {
	  while (a != 1)
	  {
	  while (a % 2 == 0)
	  {
	  b = a / 2;
	  System.out.printf("%d/2=%d\n",a,b);
	  a = b;
	  }
	 while (a % 2 != 0 && a != 1)
	 {
	  b = a * 3 + 1;
	  System.out.printf("%d*3+1=%d\n",a,b);
	  a = b;
	 }
	  }
	 System.out.print("End");
	 }
	}

}

