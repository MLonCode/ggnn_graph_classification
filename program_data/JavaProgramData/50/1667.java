package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] a = new int[12];
		a[0] = 12;
		a[1] = 43;
		a[2] = 71;
		a[3] = 102;
		a[4] = 132;
		a[5] = 163;
		a[6] = 193;
		a[7] = 224;
		a[8] = 255;
		a[9] = 285;
		a[10] = 316;
		a[11] = 346;
		for (i = 0;i <= 11;i++)
		{
			a[i] = w + (a[i] % 7);
			if (a[i] > 7)
			{
				a[i] = a[i] - 7;
			}
			if (a[i] == 5)
			{
				System.out.printf("%d\n",(i + 1));
			}
		}
		return 0;
	}

}

