public class student
{
  public int num;
  public int chin;
  public int math;
  public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 student[] stu;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 stu = (student)malloc(n * (Integer.SIZE / Byte.SIZE) * 4);
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  stu[i].num = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  stu[i].chin = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  stu[i].math = Integer.parseInt(tempVar4);
	  }
	  stu[i].sum = stu[i].chin + stu[i].math;
	 }
	 int j;
	 int e1;
	 int e2;
	 for (j = 1;j < 4;j++)
	 {
	  for (i = 0;i < n - j;i++)
	  {
	   if (stu[i].sum >= stu[i + 1].sum)
	   {
			 e1 = stu[i + 1].sum;
		e2 = stu[i + 1].num;
			 stu[i + 1].sum = stu[i].sum;
		stu[i + 1].num = stu[i].num;
		stu[i].sum = e1;
			 stu[i].num = e2;
	   }
	  }
	 }

	 System.out.printf("%d %d\n",stu[n - 1].num,stu[n - 1].sum);
	 System.out.printf("%d %d\n",stu[n - 2].num,stu[n - 2].sum);
	 System.out.printf("%d %d\n",stu[n - 3].num,stu[n - 3].sum);
	 stu = null;
	 return 0;
	}
}

