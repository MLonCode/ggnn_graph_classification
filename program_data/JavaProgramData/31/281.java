public class student
{
	public String a = new String(new char[30]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[20]);
	public String age = new String(new char[20]);
	public String score = new String(new char[20]);
	public String addr = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	 public static * creat()
	 {
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student) malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.addr = tempVar6.charAt(0);
		}
		head = null;
		while (strcmp(p1.a,"end") != 0)
		{
			n++;
		   if (n == 1)
		   {
			   p1.next = null;
		   }
		   else
		   {
		   p1.next = p2;
		   }
		   head = p1;
		   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (student)malloc(len);
		   String tempVar7 = ConsoleInput.scanfRead();
		   if (tempVar7 != null)
		   {
			   p1.a = tempVar7.charAt(0);
		   }
		   String tempVar8 = ConsoleInput.scanfRead();
		   if (tempVar8 != null)
		   {
			   p1.name = tempVar8.charAt(0);
		   }
		   String tempVar9 = ConsoleInput.scanfRead();
		   if (tempVar9 != null)
		   {
			   p1.sex = tempVar9.charAt(0);
		   }
		   String tempVar10 = ConsoleInput.scanfRead();
		   if (tempVar10 != null)
		   {
			   p1.age = tempVar10.charAt(0);
		   }
		   String tempVar11 = ConsoleInput.scanfRead();
		   if (tempVar11 != null)
		   {
			   p1.score = tempVar11.charAt(0);
		   }
		   String tempVar12 = ConsoleInput.scanfRead();
		   if (tempVar12 != null)
		   {
			   p1.addr = tempVar12.charAt(0);
		   }
		}
		return (head);
	 }
	public static void print(student head)
	{
		student p1;
		p1 = head;
		if (head != null)
		{
			 do
			 {
				 System.out.printf("%s %s %s %s %s %s\n",p1.a,p1.name,p1.sex,p1.age,p1.score,p1.addr);
				 p1 = p1.next;
			 }while (p1 != null);
		}
	}
	public static int Main()
	{
		student head;
		head = creat();
		print(head);
	}



}

