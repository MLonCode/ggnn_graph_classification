package <missing>;

public class GlobalMembers
{
	public static void change(int[][] a, int n, int m)
	{
		int i;
		int j;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a[0][0];
		if ((n < 5) && (m < 5))
		{

			for (j = 0;j < 5;j++)
			{
				t = (p + 5 * n + j);
				*(p + 5 * n + j) = *(p + 5 * m + j);
				*(p + 5 * m + j) = t;
			}
			for (i = 0;i < 5;i++)
			{
			System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		change(a, n, m);
	}


}

