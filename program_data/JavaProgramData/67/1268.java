package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float a;
		float b;
		float c;
		float d;
		float x;
		float y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Float.parseFloat(tempVar3);
		}
		x = b / a;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				d = Float.parseFloat(tempVar5);
			}
			y = d / c;
			if (y - x > 0.05F)
			{
				System.out.print("better\n");
			}
			else
			{
				if (x - y > 0.05F)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
		return 0;
	}
}

