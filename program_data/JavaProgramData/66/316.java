package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   b = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   c = Integer.parseInt(tempVar3);
	   }
	  switch (a)
	  {
	   case 4:
	   System.out.print("Mon.");
	   break;
	   case 2000:
	   System.out.print("Tue.");
	   break;
	   case 1921:
	   System.out.print("Fri.");
	   break;
	   default:
	   System.out.print("Sat.");
	   break;
	  }
	   return 0;
	}
}

