package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int n;
	 int a;
	 int b;
	 int j = 0;
	 int l = 0;
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
		  a = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0))
	  {
		j = j + 1;
	  }
	  else if ((b == 0 && a == 1) || (b == 1 && a == 2) || (b == 2 && a == 0))
	  {
		l = l + 1;
	  }
	 }
	 if (j > l)
	 {
	  System.out.print("A");
	 }
	 else if (j < l)
	 {
	  System.out.print("B");
	 }
	 else
	 {
	  System.out.print("Tie");
	 }
	 return 0;
	}
}

