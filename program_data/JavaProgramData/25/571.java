package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] b = new int[200];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[0] = '1';
		int i = 0;
		for (; i < n ; i++)
		{
			int j = 0;
			for (; j < a.length() ; j++)
			{
				b[j] = a[j] - '0';
			}
			for (j = 0 ; j < a.length() ; j++)
			{
				b[j] = b[j] * 2;
			}

			j = 199;
			while (b[j] == 0)
			{
				j--;
			}
			int k = j + 1;
			for (j = 0 ; j < k; j++)
			{
				b[j + 1] += b[j] / 10;
				b[j] = b[j] % 10;
			}

			j = 199;
			while (b[j] == 0)
			{
				j--;
			}

			for (; j >= 0; j--)
			{
				a[j] = b[j] + '0';
			}
		}

		i = 199;
		while (a[i] == 0)
		{
				i--;
		}
		for (; i >= 0 ; i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");


		return 0;
	}
}

