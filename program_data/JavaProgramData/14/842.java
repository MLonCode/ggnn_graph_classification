public class w
{
	public int id;
public int ch;
public int ma;
public int sum;
public w next;
public w pre;
}

package <missing>;

public class GlobalMembers
{
	public static w head;
	public static w p1;
	public static w p2;
	public static int i;
	public static int n;
	public static int k = 1;
	public static int max;
	public static int s = 0;
	public static w make()
	{
		head = null_Renamed;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (w)malloc(len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.ch = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.ma = Integer.parseInt(tempVar4);
		}
		for (k = 1;k < n;k++)
		{
			if (k == 1)
			{
				head = p1;
				p1.pre = null_Renamed;
			}
			else
			{
				p2.next = p1;
				p1.pre = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (w)malloc(len);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.id = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.ch = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.ma = Integer.parseInt(tempVar7);
			}
		}
		p2.next = p1;
		p1.next = head;
		return head;
	}
	public static void Main()
	{
		head = make();
		max = 0;
		while (s < 3)
		{
			max = 0;
			for (i = 1;i <= n;i++)
			{
				if (i == n)
				{
					p1 = null_Renamed;
				}
				else
				{
					p1.sum = p1.ch + p1.ma;
					p1 = p1.next;
				}
			}
			p1 = head;
			for (i = 1;i <= n;i++)
			{
				if ((p1.sum) > max)
				{
				max = p1.sum;
				}
				p1 = p1.next;
			}
			p1 = head;
			for (i = 1;i <= n;i++)
			{
				p2 = p1;
				p1 = p1.next;
				if (p2.ch + p2.ma == max)
				{
					System.out.printf("%d %d\n",p2.id,p2.sum);
					if (p2 == head)
					{
						head = p2.next;
						p2 = head;
					}
				else
				{
					p2 = p2.pre;
					p1 = p1.next;
					p2.next = p1;
				}
				break;
				}
			}
			s++;
		}
	}

}

