package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int d;
	  int e;
	  int f;
	  int s;
	  int m;
	  int h;
	  int[] sum = new int[100];
	  int i;
	  int k = 0;
	  for (i + 0;i <= 100;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  b = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  c = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  d = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  e = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  f = Integer.parseInt(tempVar6);
	  }
	  if (a == 0)
	  {
		  break;
	  }
	  else
	  {
		 d += 12;
		  if (f - c < 0)
		  {
		   if (e == 0)
		   {
			 d = d - 1;
			 e = 60;
		   }
		   e = e-1;
		   f = f + 60;
		  }
		  s = f - c;
		  if (e - b < 0)
		  {
			d = d - 1;
			e = e+60;
		  }
		  m = e - b;
		  h = d - a;
		  sum[k] = 3600 * h + 60 * m + s;
		  k++;
	  }
	  }
	  for (i = 0;i < k;i++)
	  {
	  System.out.printf("%d\n",sum[i]);
	  }
	return 0;
	}

}

