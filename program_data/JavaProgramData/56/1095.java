package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int a = n / 10;
	  int b = n % 10;
	  int m = 0;
	  int t;
	  while (a != 0)
	  {
	  m = b * 10;
	  t = a;
	  a = a / 10;
	  b = t % 10;
	  b += m;
	  }
	  System.out.printf("%d\n",b);
	  return 0;


	}
}

