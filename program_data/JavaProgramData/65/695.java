package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int n;
		int i;
		int x;
		int y;
		x = 0;
		y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 0 || n>+200)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
				if (a[i] == 0 && b[i] == 1)
				{
					x++;
				}
				else if (a[i] == 1 && b[i] == 2)
				{
					x++;
				}
				else if (a[i] == 2 && b[i] == 0)
				{
					x++;
				}
				else if (a[i] == b[i])
				{
					x++;
					y++;
				}
				else
				{
					y++;
				}
			}
			if (x > y)
			{
				System.out.print("A");
			}
			if (x < y)
			{
				System.out.print("B");
			}
			if (x == y)
			{
				System.out.print("Tie");
			}
		}
		return 0;
	}








}

