package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = int n;
		String a = new String(new char[3000]);
		int[] b = new int[500];
		int i;
		int j;
		int k;
		int l;
		int p;
		int temp;
		int sum = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i) == ',')
			{
				q = 1;
				for (j = 0;j <= i - 1;j++)
				{
					sum = sum + (a.charAt(j) - 48) * f(i - 1 - j);
				}
				b[0] = sum;
				break;
			}
		}
		if (q == 0)
		{
			System.out.print("No");
		}
		else
		{
			p = 1;
			for (j = i;a.charAt(j) != 0;j++)
			{
				if (a.charAt(j) == ',')
				{
					sum = 0;
					for (k = j + 1;(a.charAt(k) != ',') && (a.charAt(k) != 0);k++)
					{
						;
					}
					for (l = j + 1;l <= k - 1;l++)
					{
						sum = sum + (a.charAt(l) - 48) * f(k - 1 - l);

					}
					b[p] = sum;
					p++;
				}
			}
			for (k = 1;k <= p - 1;k++)
			{
				if (b[k] != b[0])
				{
					break;
				}
			}
			if (k == p)
			{
				System.out.print("No");
			}
			else
			{

			for (k = 1;k <= p - 1;k++)
			{
					if (b[k] > b[0])
					{
						temp = b[0];
						b[0] = b[k];
						b[k] = temp;
					}
			}



			for (k = 1;k <= p - 1;k++)
			{
				if (b[k] == b[0])
				{
					continue;
				}
				else
				{
					b[1] = b[k];
				}
				break;
			}
			for (k = 2;k <= p - 1;k++)
			{
				if ((b[k] >= b[1]) && (b[k] < b[0]))
				{
						temp = b[1];
						b[1] = b[k];
						b[k] = temp;
				}
			}
			System.out.printf("%d\n",b[1]);
			}

		}
	}
	public static int f(int n)
	{
		int i;
		int z = 1;
		for (i = 1;i <= n;i++)
		{
			z = z * 10;
		}
		return (z);
	}

}

