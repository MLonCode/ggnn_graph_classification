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
		 int num;
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
		 while (a != 0)
		 {
			 num = 0;
			 d = d + 12;
			num = num + 3600 * (d - a - 1);
			num = num + 3600 - b * 60 - c;
			num = num + 60 * e + f;
			System.out.printf("%d\n",num);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				b = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				c = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				d = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				e = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				f = Integer.parseInt(tempVar12);
			}
		 }
	return 0;
	}
}

