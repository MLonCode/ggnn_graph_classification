package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[] a = new int[12];
			int w;
			int[] b = new int[12];
			int i;
			a[0] = 31;
			a[1] = 28;
			a[2] = 31;
			a[3] = 30;
			a[4] = 31;
			a[5] = 30;
			a[6] = 31;
			a[7] = 31;
			a[8] = 30;
			a[9] = 31;
			a[10] = 30;
			a[11] = 31;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				w = Integer.parseInt(tempVar);
			}
			b[0] = (w + 12) % 7;
			for (i = 1;i < 12;i++)
			{
			b[i] = (b[i - 1] + a[i - 1]) % 7;
			}
			for (i = 0;i < 12;i++)
			{
				if (b[i] == 5)
				{
				System.out.printf("%d\n",i + 1);
				}
			}

	}




}

