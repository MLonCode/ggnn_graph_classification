package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static void Main()
	{
		char c;
		int i = 0;
		int num;
		int p = 0;
		int q;
		int max;
		int min;
		int j;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{

				i++;
			}
			else if (c != ',')
			{

				a[i] = 10 * a[i] + c - '0';
			}
		}
		i = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ',')
			{

				i++;
			}
			else if (c != ',')
			{

				b[i] = 10 * b[i] + c - '0';
			}
		}
		num = i + 1;
		min = a[0];
		max = b[0];
		for (i = 0;i < num;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}

		}
		p = 0;
		for (i = min;i < max;i++)
		{
			q = 0;
			for (j = 0;j < num;j++)
			{
				if (a[j] <= i != 0 && b[j]> i)
				{
					q++;
				}

			}
			if (q > p)
			{
			p = q;
			}


		}
		System.out.printf("%d %d",num,p);


	}
}
